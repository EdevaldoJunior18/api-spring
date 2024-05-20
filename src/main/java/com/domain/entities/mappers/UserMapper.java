package com.domain.entities.mappers;

import com.domain.entities.bo.UserBO;
import com.domain.entities.dto.UserDTO;
import com.domain.entities.vo.UuidVO;
import com.domain.utils.Utils;

/**
 *
 * @author Ed
 */
public class UserMapper {

    public static UserBO toBO(UserDTO dto) {

        if (Utils.isNullOrEmpty(dto)) {
            return null;
        }

        return new UserBO(
                new UuidVO(dto.getId()),
                dto.getName(),
                dto.getAge(),
                dto.getEmail(),
                dto.getDocument(),
                dto.getPhoneNumber(),
                dto.getPassword(),
                AddresMapper.toBO(dto.getAddres()));
    }

    public static UserDTO toDTO(UserBO bo) {

        if (Utils.isNullOrEmpty(bo)) {
            return null;
        }

        var dto = new UserDTO();
        dto.setAddres(AddresMapper.toDTO(bo.getAddres()));
        dto.setAge(bo.getAge());
        dto.setDocument(bo.getDocument());
        dto.setEmail(bo.getEmail());
        dto.setId(bo.getId().getValue().toString());
        dto.setName(bo.getName());
        dto.setPassword(bo.getPassword());
        dto.setPhoneNumber(bo.getPhoneNumber());

        return dto;
    }

}
