package org.dromara.system.domain.bo;

import io.github.linpeilie.AutoMapperConfig__119;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.SysOssConfig;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__119.class,
    uses = {},
    imports = {}
)
public interface SysOssConfigBoToSysOssConfigMapper extends BaseMapper<SysOssConfigBo, SysOssConfig> {
}
