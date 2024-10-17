package org.dromara.system.domain.vo;

import io.github.linpeilie.AutoMapperConfig__119;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.SysRole;
import org.dromara.system.domain.SysRoleToSysRoleVoMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__119.class,
    uses = {SysRoleToSysRoleVoMapper.class},
    imports = {}
)
public interface SysRoleVoToSysRoleMapper extends BaseMapper<SysRoleVo, SysRole> {
}
