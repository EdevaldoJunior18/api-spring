package com.infra.database.mappers;

import com.domain.entities.bo.AddresBO;
import com.domain.entities.vo.UuidVO;
import com.domain.utils.Utils;
import com.infra.database.models.TableAddres;

/**
 *
 * @author Ed
 */
public class AddresRepositoryMapper {

    public static AddresBO toDomain(TableAddres entity) {

        if (Utils.isNullOrEmpty(entity)) {
            return null;
        }

        return new AddresBO(
                new UuidVO(entity.getId().toString()),
                entity.getRoad(),
                entity.getNeighborhood(),
                entity.getHouseNumber(),
                entity.getPostalCode(),
                entity.getComplement());

    }

    public static TableAddres toEntity(AddresBO bo) {

        if (Utils.isNullOrEmpty(bo)) {
            return null;
        }

        var entity = new TableAddres();

        entity.setComplement(bo.getComplement());
        entity.setHouseNumber(bo.getHouseNumber());
        entity.setId(bo.getId().getValue());
        entity.setNeighborhood(bo.getNeighborhood());
        entity.setPostalCode(bo.getPostalCode());
        entity.setRoad(bo.getRoad());

        return entity;

    }

}
