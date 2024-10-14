package org.dromara.system.domain.vo;

import io.github.linpeilie.AutoMapperConfig__66;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.SysTenantPackage;
import org.dromara.system.domain.SysTenantPackageToSysTenantPackageVoMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__66.class,
    uses = {SysTenantPackageToSysTenantPackageVoMapper.class},
    imports = {}
)
public interface SysTenantPackageVoToSysTenantPackageMapper extends BaseMapper<SysTenantPackageVo, SysTenantPackage> {
}