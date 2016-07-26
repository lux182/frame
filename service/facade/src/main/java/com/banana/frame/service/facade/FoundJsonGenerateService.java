package com.banana.frame.service.facade;

import com.banana.frame.service.facade.domain.access.WebAccessInfo;

import javax.jws.WebService;

/**
 * <p></p>
 *
 * @author Louis
 * @version v 0.1 2016/7/2611:42
 */
@WebService(targetNamespace = "http://found.ws.frame.banana.com")
public interface FoundJsonGenerateService {

    String convertFound(WebAccessInfo wallet);
}
