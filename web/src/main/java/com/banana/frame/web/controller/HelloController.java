package com.banana.frame.web.controller;

import com.banana.frame.domainservice.found.service.FoundService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * <p></p>
 *
 * @author Louis
 * @version $Id:com.banana.frame.web.controller, v 0.1 2016/7/27 14:52 liuxuesi Exp $
 */
@Controller
@RequestMapping("/test")
public class HelloController {
    private static final Logger LOG = LoggerFactory.getLogger(HelloController.class);

    @Autowired
    private FoundService foundService;

    @RequestMapping("/hello")
    public String helloworld(Model model) {
        String name = foundService.query();
        model.addAttribute("test", name);
        return "test";
    }

    @RequestMapping("/helloagian")
    public String helloworldagain(Model model) {
        List list = foundService.queryUserList();
        model.addAttribute("test", list);
        return "test";
    }
}
