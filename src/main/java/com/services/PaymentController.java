package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.domain.entities.dto.BarCodeResponseDTO;
import com.domain.entities.dto.ConsultResponseDTO;
import com.domain.entities.dto.PaymentDTO;
import com.domain.entities.dto.PaymentResponseDTO;

/**
 *
 * @author Ed
 */
@RestController
@RequestMapping("/api/v1")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/payment")
    public BarCodeResponseDTO consultBarCode(@RequestHeader final String line) {
        return paymentService.consultBarCode(line);
    }

    @PostMapping("/pay")
    public PaymentResponseDTO pay(final PaymentDTO dto) {
        return paymentService.pay(dto);
    }

    @GetMapping("/consult")
    public ConsultResponseDTO consultPayment(@RequestHeader final String txId) {
        return paymentService.consultPayment(txId);
    }

}
