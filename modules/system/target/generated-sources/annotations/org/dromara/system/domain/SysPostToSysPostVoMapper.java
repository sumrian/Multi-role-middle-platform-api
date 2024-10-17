package org.dromara.system.domain;

import io.github.linpeilie.AutoMapperConfig__119;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.bo.SysPostBoToSysPostMapper;
import org.dromara.system.domain.vo.SysPostVo;
import org.dromara.system.domain.vo.SysPostVoToSysPostMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__119.class,
    uses = {SysPostBoToSysPostMapper.class,SysPostVoToSysPostMapper.class},
    imports = {}
)
public interface SysPostToSysPostVoMapper extends BaseMapper<SysPost, SysPostVo> {
}
