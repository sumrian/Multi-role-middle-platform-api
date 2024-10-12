package org.dromara.system.domain;

import io.github.linpeilie.AutoMapperConfig__66;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.bo.SysOssConfigBoToSysOssConfigMapper;
import org.dromara.system.domain.vo.SysOssConfigVo;
import org.dromara.system.domain.vo.SysOssConfigVoToSysOssConfigMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__66.class,
    uses = {SysOssConfigBoToSysOssConfigMapper.class,SysOssConfigVoToSysOssConfigMapper.class},
    imports = {}
)
public interface SysOssConfigToSysOssConfigVoMapper extends BaseMapper<SysOssConfig, SysOssConfigVo> {
}
