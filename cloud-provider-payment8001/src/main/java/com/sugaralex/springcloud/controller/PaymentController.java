package com.sugaralex.springcloud.controller;

import com.sugaralex.springcloud.entities.CommonResult;
import com.sugaralex.springcloud.entities.Payment;
import com.sugaralex.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * @author alexanderz
 */

@RestController
@Slf4j
public class PaymentController {

    @Resource
    private PaymentService paymentService;

    /**
     * @param payment create
     * @return int
     */
    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment){
        int result = paymentService.create(payment);
        if(result > 0) {
            return new CommonResult(200, "插入数据库成功", result);
        }
        return new CommonResult(444, "插入数据库失败", null);
    }

    /**
     * @param id pytID
     * @return payment
     */
    @GetMapping(value = "/payment/{id}")
    public CommonResult getPaymentById(@PathVariable("id")Long id){
        Payment result = paymentService.getPaymentById(id);
        log.info("****查询结果：" + result);
        if(result != null){
            return new CommonResult(200, "查询成功", result);
        }
        return new CommonResult(444, "没有对应id的记录", null);
    }
}
