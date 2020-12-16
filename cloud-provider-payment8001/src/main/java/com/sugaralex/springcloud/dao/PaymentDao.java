package com.sugaralex.springcloud.dao;

import com.sugaralex.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @author alexanderz
 */

@Mapper
public interface PaymentDao {
    /**
     * create
     *
     * @param payment payment entity
     * @return id
     */
    public int create(Payment payment);

    /**
     * get payment
     *
     * @param id payment id
     * @return payment
     */
    public Payment getPaymentById(@Param("id") Long id);
}
