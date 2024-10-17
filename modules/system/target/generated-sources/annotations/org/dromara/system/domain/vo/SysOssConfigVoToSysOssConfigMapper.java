package org.dromara.system.domain.vo;

import io.github.linpeilie.AutoMapperConfig__119;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.SysOssConfig;
import org.dromara.system.domain.SysOssConfigToSysOssConfigVoMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__119.class,
    uses = {SysOssConfigToSysOssConfigVoMapper.class},
    imports = {}
)
public interface SysOssConfigVoToSysOssConfigMapper extends BaseMapper<SysOssConfigVo, SysOssConfig> {
}
