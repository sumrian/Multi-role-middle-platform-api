package org.dromara.workflow.domain.bo;

import io.github.linpeilie.AutoMapperConfig__120;
import io.github.linpeilie.BaseMapper;
import org.dromara.workflow.domain.WfFormManage;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__120.class,
    uses = {},
    imports = {}
)
public interface WfFormManageBoToWfFormManageMapper extends BaseMapper<WfFormManageBo, WfFormManage> {
}
