package com.banana.frame.ext.service.facade;

import com.banana.frame.domainservice.found.domain.ReturnCode;
import com.banana.frame.domainservice.found.service.FoundService;
import com.banana.frame.service.facade.FoundFacade;
import com.banana.frame.service.facade.request.FoundRequest;
import com.banana.frame.service.facade.response.AccessQueryResponse;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.annotation.Resource;
import javax.jws.WebService;

/**
 * <p></p>
 *
 * @author Louis
 * @version v 0.1 2016/7/2614:39
 */

//@WebService(serviceName = "foundFacade",endpointInterface = "com.banana.frame.service.facade.FoundFacade", targetNamespace = "http://found.ws.frame.banana.com")
@Component("foundFacade")
@WebService(serviceName = "foundFacade", endpointInterface = "com.banana.frame.service.facade.FoundFacade")
public class FoundFacadeImpl implements FoundFacade {
    private static final Logger logger = LoggerFactory
            .getLogger(FoundFacadeImpl.class);
    @Resource
    private FoundService foundService;

    @Override
    public AccessQueryResponse query(FoundRequest foundRequest) {
        logger.info("开始查询数据：request=" + foundRequest);
        AccessQueryResponse response = new AccessQueryResponse();
        try {
            Assert.notNull(foundRequest, "查询请求不能为空");
            Assert.isTrue(StringUtils.isNotEmpty(foundRequest.getFoundType()), "查询类型不能为空");
            String string = foundService.query();
            response.setReturnCode(ReturnCode.SUCCESS.getCode());
            response.setReturnMessage(ReturnCode.SUCCESS.getName());
            if (StringUtils.isNotEmpty(string))
                response.setAccess(string);
        } catch (IllegalArgumentException e) {
            logger.warn("查询时参数校验失败！request=" + foundRequest, e);
            return buildFailedAccessQueryResponse(ReturnCode.ILLEGAL_ARGUMENT, e.getMessage());
        } catch (Exception e) {
            logger.error("查询时失败!registerRequest=" + foundRequest, e);
            return buildFailedAccessQueryResponse(ReturnCode.UNKOWN_EXCEPTION, e.getMessage());
        }
        return response;
    }

    private AccessQueryResponse buildFailedAccessQueryResponse(ReturnCode returnCode, String message) {
        AccessQueryResponse response = new AccessQueryResponse();
        response.setReturnCode(returnCode.getCode());
        response.setReturnMessage(returnCode.getName() + "," + message);
        return response;
    }
}
