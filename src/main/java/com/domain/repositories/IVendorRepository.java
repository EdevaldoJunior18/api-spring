package com.domain.repositories;

import com.domain.entities.dto.BarCodeResponseDTO;
import com.domain.entities.dto.ConsultResponseDTO;
import com.domain.entities.dto.PaymentDTO;
import com.domain.entities.dto.PaymentResponseDTO;

public interface IVendorRepository {

    BarCodeResponseDTO consultBarCode(final String lineDocument);

    PaymentResponseDTO pay(final PaymentDTO dto);

    ConsultResponseDTO consult(final String txId);

}
