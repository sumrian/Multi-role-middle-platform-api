package org.dromara.system.domain;

import io.github.linpeilie.AutoMapperConfig__66;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.bo.SysOperLogBoToSysOperLogMapper;
import org.dromara.system.domain.vo.SysOperLogVo;
import org.dromara.system.domain.vo.SysOperLogVoToSysOperLogMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__66.class,
    uses = {SysOperLogVoToSysOperLogMapper.class,SysOperLogBoToSysOperLogMapper.class},
    imports = {}
)
public interface SysOperLogToSysOperLogVoMapper extends BaseMapper<SysOperLog, SysOperLogVo> {
}
