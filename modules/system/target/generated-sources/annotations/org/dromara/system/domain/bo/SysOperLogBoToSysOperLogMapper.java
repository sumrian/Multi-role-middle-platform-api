package org.dromara.system.domain.bo;

import io.github.linpeilie.AutoMapperConfig__66;
import io.github.linpeilie.BaseMapper;
import org.dromara.common.log.event.OperLogEventToSysOperLogBoMapper;
import org.dromara.system.domain.SysOperLog;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__66.class,
    uses = {SysOperLogBoToOperLogEventMapper.class,OperLogEventToSysOperLogBoMapper.class},
    imports = {}
)
public interface SysOperLogBoToSysOperLogMapper extends BaseMapper<SysOperLogBo, SysOperLog> {
}
