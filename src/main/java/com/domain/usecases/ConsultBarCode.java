package com.domain.usecases;

import com.domain.entities.dto.BarCodeResponseDTO;
import com.domain.repositories.IVendorRepository;

public class ConsultBarCode {

    IVendorRepository vendorRepository;

    public ConsultBarCode(IVendorRepository vendorRepository) {
        this.vendorRepository = vendorRepository;
    }

    public BarCodeResponseDTO execute(final String lineDocument) {

        return vendorRepository.consultBarCode(lineDocument);

    }

}
