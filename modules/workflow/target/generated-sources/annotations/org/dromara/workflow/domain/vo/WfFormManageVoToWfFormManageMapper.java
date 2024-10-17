package org.dromara.workflow.domain.vo;

import io.github.linpeilie.AutoMapperConfig__120;
import io.github.linpeilie.BaseMapper;
import org.dromara.workflow.domain.WfFormManage;
import org.dromara.workflow.domain.WfFormManageToWfFormManageVoMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__120.class,
    uses = {WfFormManageToWfFormManageVoMapper.class},
    imports = {}
)
public interface WfFormManageVoToWfFormManageMapper extends BaseMapper<WfFormManageVo, WfFormManage> {
}
