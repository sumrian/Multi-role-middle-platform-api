package org.dromara.system.domain.bo;

import io.github.linpeilie.AutoMapperConfig__66;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.SysNotice;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__66.class,
    uses = {},
    imports = {}
)
public interface SysNoticeBoToSysNoticeMapper extends BaseMapper<SysNoticeBo, SysNotice> {
}
