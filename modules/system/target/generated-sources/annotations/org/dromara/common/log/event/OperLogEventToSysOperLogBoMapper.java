package org.dromara.common.log.event;

import io.github.linpeilie.AutoMapperConfig__119;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.bo.SysOperLogBo;
import org.dromara.system.domain.bo.SysOperLogBoToOperLogEventMapper;
import org.dromara.system.domain.bo.SysOperLogBoToSysOperLogMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__119.class,
    uses = {SysOperLogBoToSysOperLogMapper.class,SysOperLogBoToOperLogEventMapper.class},
    imports = {}
)
public interface OperLogEventToSysOperLogBoMapper extends BaseMapper<OperLogEvent, SysOperLogBo> {
}
