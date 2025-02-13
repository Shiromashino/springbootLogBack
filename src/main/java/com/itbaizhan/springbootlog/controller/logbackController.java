package com.itbaizhan.springbootlog.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class logbackController {
    private final static Logger logger = LoggerFactory.getLogger(logbackController.class);
    @RequestMapping("/printLog")
    @ResponseBody
    public String index() {
        logger.info("记录日志");
        return "hello LogBack";
    }
}
