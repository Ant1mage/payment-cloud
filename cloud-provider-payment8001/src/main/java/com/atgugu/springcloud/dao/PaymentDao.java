package com.atgugu.springcloud.dao;

import com.atgugu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @author alexanderz
 */

public interface PaymentDao {
    /**
     * create
     * @param payment payment entity
     * @return id
     */
    public int create(Payment payment);

    /**
     * get payment
     * @param id payment id
     * @return payment
     */
    public Payment getPaymentById(@Param("id") Long id);
}
