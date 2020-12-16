package com.sugaralex.springcloud.service.impl;

import com.sugaralex.springcloud.dao.PaymentDao;
import com.sugaralex.springcloud.entities.Payment;
import com.sugaralex.springcloud.service.PaymentService;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author alexanderz
 */

@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    @Override
    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    @Override
    public Payment getPaymentById(@Param("id") Long id) {
        return paymentDao.getPaymentById(id);
    }
}
