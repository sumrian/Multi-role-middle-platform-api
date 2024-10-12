package org.dromara.system.domain.vo;

import io.github.linpeilie.AutoMapperConfig__66;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.SysPost;
import org.dromara.system.domain.SysPostToSysPostVoMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__66.class,
    uses = {SysPostToSysPostVoMapper.class},
    imports = {}
)
public interface SysPostVoToSysPostMapper extends BaseMapper<SysPostVo, SysPost> {
}
