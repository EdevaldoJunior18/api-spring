package com.domain.usecases;

import com.domain.entities.dto.ConsultResponseDTO;
import com.domain.repositories.IVendorRepository;

public class ConsultPayment {

    IVendorRepository vendorRepository;

    public ConsultPayment(IVendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    public ConsultResponseDTO execute(String txId) {
        return null;
    }
}
