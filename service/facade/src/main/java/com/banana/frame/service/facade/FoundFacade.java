package com.banana.frame.service.facade;

import com.banana.frame.service.facade.request.FoundRequest;
import com.banana.frame.service.facade.response.AccessQueryResponse;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * <p>Banana 门面</p>
 * @author Louis
 * @version v 0.1 2016/7/26
 */
//@WebService(targetNamespace = "http://found.ws.frame.banana.com")
@WebService
public interface FoundFacade {

    @WebMethod
    AccessQueryResponse query(FoundRequest foundRequest);
}
