package com.example.hello.controller;

import com.example.hello.dto.CommonResp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

/**
 * controller模板，欢迎界面
 * @author guweiyu
 */
@RestController
@RequestMapping(value = "/greeting", produces = "application/json; charset=UTF-8")
public class GreetingController {

    Logger logger = LoggerFactory.getLogger(GreetingController.class);

    /**
     * 欢迎接口
     * @param contend
     * @return
     */
    @GetMapping("/hellouser")
    @ResponseBody
    public CommonResp helloUser(@RequestParam(value = "contend", required = false) String contend) {

        CommonResp resp = new CommonResp();

        logger.info("contend:"+contend);
        resp.setStatus("0");
        resp.setMsg("welcome " + contend);
        return resp;
    }
}
