package com.example.demo.controller;

import com.example.demo.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author zhu_wm
 * @date 2021/8/14 16:15
 */

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    /**
     * 正常访问
     *
     * @param id
     * @return
     */
    @GetMapping("/hystrix/ok/{id}")
    public String paymentInfo_OK(@PathVariable("id") Integer id) {
        final String result = paymentService.paymentInfo_OK(id);
        log.info("***result:" + result);
        return result;
    }

    /**
     * 非正常访问
     *
     * @param id
     * @return
     */
    @GetMapping("/hystrix/timeout/{id}")
    public String paymentInfo_TimeOut(@PathVariable("id") Integer id) {
        final String result = paymentService.paymentInfo_TimeOut(id);
        log.info("***result:" + result);
        return result;
    }

}
