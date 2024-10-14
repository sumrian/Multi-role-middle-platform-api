package org.dromara.system.domain;

import io.github.linpeilie.AutoMapperConfig__66;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.bo.SysConfigBoToSysConfigMapper;
import org.dromara.system.domain.vo.SysConfigVo;
import org.dromara.system.domain.vo.SysConfigVoToSysConfigMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__66.class,
    uses = {SysConfigVoToSysConfigMapper.class,SysConfigBoToSysConfigMapper.class},
    imports = {}
)
public interface SysConfigToSysConfigVoMapper extends BaseMapper<SysConfig, SysConfigVo> {
}
