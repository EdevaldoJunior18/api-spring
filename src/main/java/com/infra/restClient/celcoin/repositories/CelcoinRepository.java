package com.infra.restClient.celcoin.repositories;

import org.springframework.web.bind.annotation.RestController;

import com.domain.entities.dto.BarCodeResponseDTO;
import com.domain.entities.dto.ConsultResponseDTO;
import com.domain.entities.dto.PaymentDTO;
import com.domain.entities.dto.PaymentResponseDTO;
import com.domain.repositories.IVendorRepository;

@RestController
public class CelcoinRepository implements IVendorRepository {

    @Override
    public BarCodeResponseDTO consultBarCode(final String line) {
        try {
            var response = new BarCodeResponseDTO();
            response.setLine(line);

            return response;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public PaymentResponseDTO pay(PaymentDTO dto) {
        try {
            var response = new PaymentResponseDTO();

            return response;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public ConsultResponseDTO consult(String txId) {
        try {
            var response = new ConsultResponseDTO();

            return response;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }

}
