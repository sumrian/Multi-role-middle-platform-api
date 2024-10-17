package org.dromara.system.domain.bo;

import io.github.linpeilie.AutoMapperConfig__119;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.SysTenant;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__119.class,
    uses = {},
    imports = {}
)
public interface SysTenantBoToSysTenantMapper extends BaseMapper<SysTenantBo, SysTenant> {
}
