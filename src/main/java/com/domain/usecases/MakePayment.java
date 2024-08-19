package com.domain.usecases;

import com.domain.entities.dto.PaymentDTO;
import com.domain.entities.dto.PaymentResponseDTO;
import com.domain.repositories.IVendorRepository;

public class MakePayment {

    IVendorRepository vendorRepository;

    public MakePayment(IVendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    public PaymentResponseDTO execute(final PaymentDTO dto) {
        return null;
    }

}
