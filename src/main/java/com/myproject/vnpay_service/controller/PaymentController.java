package com.myproject.vnpay_service.controller;

import com.myproject.vnpay_service.service.PaymentInfoService;
import com.myproject.vnpay_service.service.PaymentOrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author nguyenle
 * @since 7:49 AM Wed 9/11/2024
 */
@RestController
@RequiredArgsConstructor
public class PaymentController {

    private final PaymentInfoService paymentInfoService;

    private final PaymentOrderService paymentOrderService;

}
