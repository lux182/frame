package com.banana.frame.ext.service.facade;

import com.banana.frame.service.facade.request.FoundRequest;
import org.apache.cxf.endpoint.Client;
import org.apache.cxf.jaxws.endpoint.dynamic.JaxWsDynamicClientFactory;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * <p></p>
 *
 * @author Louis
 * @version $Id:com.banana.frame.ext.service.facade, v 0.1 2016/8/2 10:38 liuxuesi Exp $
 */
public class WebserviceTest {

    @Resource
    private FoundRequest foundRequest;

    @Test
    public void foundFacadeTest() throws Exception {
        JaxWsDynamicClientFactory dcf = JaxWsDynamicClientFactory.newInstance();
        Client client = dcf.createClient("http://localhost:8080/banana/api/FoundFacade?wsdl");
        Object[] objects = client.invoke("query", foundRequest);
        //输出调用结果
    }

}
