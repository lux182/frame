package com.banana.frame.ext.service.config;


import com.banana.frame.service.facade.FoundFacade;
import org.apache.cxf.Bus;
import org.apache.cxf.endpoint.Endpoint;
import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.EndpointImpl;
import org.apache.cxf.transport.servlet.CXFServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.context.embedded.ServletRegistrationBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableAutoConfiguration
public class WebServiceConfiguration {

    @Autowired
    private ApplicationContext applicationContext;

    @SuppressWarnings("SpringJavaAutowiringInspection")
    @Autowired
    private FoundFacade foundFacade;

    public static EndpointImpl publishEndPoint(ApplicationContext applicationContext, String url, Object service) {
        Bus bus = (Bus) applicationContext.getBean(Bus.DEFAULT_BUS_ID);
        EndpointImpl endpoint = new EndpointImpl(bus, service);
        endpoint.publish(url);
        Endpoint serverEndpoint = endpoint.getServer().getEndpoint();
        serverEndpoint.getInInterceptors().add(new LoggingInInterceptor());
        serverEndpoint.getOutInterceptors().add(new LoggingOutInterceptor());
        return endpoint;
    }

    @Bean
    public ServletRegistrationBean servletRegistrationBean() {
        return new ServletRegistrationBean(new CXFServlet(), "/banana/api/*");
    }

    @Bean
    public EndpointImpl foundServiceEndPoint() {
        return publishEndPoint(applicationContext, "/FoundFacade", foundFacade);
    }

}
