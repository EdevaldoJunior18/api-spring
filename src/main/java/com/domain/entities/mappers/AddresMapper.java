package com.domain.entities.mappers;

import com.domain.entities.bo.AddresBO;
import com.domain.entities.dto.AddresDTO;
import com.domain.entities.vo.UuidVO;
import com.domain.utils.Utils;

/**
 *
 * @author Ed
 */
public class AddresMapper {

    public static AddresBO toBO(AddresDTO dto) {

        if (Utils.isNullOrEmpty(dto)) {
            return null;
        }

        return new AddresBO(
                new UuidVO(dto.getId()),
                dto.getRoad(),
                dto.getNeighborhood(),
                dto.getHouseNumber(),
                dto.getPostalCode(),
                dto.getComplement());
    }

    public static AddresDTO toDTO(AddresBO bo) {

        if (Utils.isNullOrEmpty(bo)) {
            return null;
        }

        var dto = new AddresDTO();
        dto.setComplement(bo.getComplement());
        dto.setHouseNumber(bo.getHouseNumber());
        dto.setId(bo.getId().getValue().toString());
        dto.setNeighborhood(bo.getNeighborhood());
        dto.setPostalCode(bo.getPostalCode());
        dto.setRoad(bo.getRoad());

        return dto;
    }
}
