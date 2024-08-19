package com.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.domain.entities.dto.BarCodeResponseDTO;
import com.domain.entities.dto.ConsultResponseDTO;
import com.domain.entities.dto.PaymentDTO;
import com.domain.entities.dto.PaymentResponseDTO;
import com.domain.usecases.ConsultBarCode;
import com.domain.usecases.ConsultPayment;
import com.domain.usecases.MakePayment;
import com.infra.restClient.celcoin.repositories.CelcoinRepository;

/**
 *
 * @author Ed
 */
@Service
public class PaymentService {

    @Autowired
    private CelcoinRepository vendorRepository;

    public BarCodeResponseDTO consultBarCode(final String line) {

        final var consult = new ConsultBarCode(vendorRepository);
        return consult.execute(line);
    }

    public PaymentResponseDTO pay(final PaymentDTO dto) {

        final var make = new MakePayment(vendorRepository);
        return make.execute(dto);
    }

    public ConsultResponseDTO consultPayment(final String txId) {

        final var consult = new ConsultPayment(vendorRepository);
        return consult.execute(txId);
    }

}
