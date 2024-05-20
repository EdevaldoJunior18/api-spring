package com.infra.database.mappers;

import com.domain.entities.bo.UserBO;
import com.domain.entities.vo.UuidVO;
import com.domain.utils.Utils;
import com.infra.database.models.TableUser;

/**
 *
 * @author Ed
 */
public class UserRepositoryMapper {

    public static UserBO toDomain(TableUser entity) {

        if (Utils.isNullOrEmpty(entity)) {
            return null;
        }

        return new UserBO(
                new UuidVO(entity.getId().toString()),
                entity.getName(),
                entity.getAge(),
                entity.getEmail(),
                entity.getDocument(),
                entity.getPhoneNumber(),
                entity.getPassword(),
                AddresRepositoryMapper.toDomain(entity.getAddres()));

    }

    public static TableUser toEntity(UserBO bo) {

        if (Utils.isNullOrEmpty(bo)) {
            return null;
        }

        var entity = new TableUser();
        entity.setAddres(AddresRepositoryMapper.toEntity(bo.getAddres()));
        entity.setAge(bo.getAge());
        entity.setDocument(bo.getDocument());
        entity.setEmail(bo.getEmail());
        entity.setId(bo.getId().getValue());
        entity.setName(bo.getName());
        entity.setPassword(bo.getPassword());
        entity.setPhoneNumber(bo.getPhoneNumber());

        return entity;

    }

}
