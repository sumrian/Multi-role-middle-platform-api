package org.dromara.workflow.domain;

import io.github.linpeilie.AutoMapperConfig__65;
import io.github.linpeilie.BaseMapper;
import org.dromara.workflow.domain.bo.WfFormManageBoToWfFormManageMapper;
import org.dromara.workflow.domain.vo.WfFormManageVo;
import org.dromara.workflow.domain.vo.WfFormManageVoToWfFormManageMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__65.class,
    uses = {WfFormManageBoToWfFormManageMapper.class,WfFormManageVoToWfFormManageMapper.class},
    imports = {}
)
public interface WfFormManageToWfFormManageVoMapper extends BaseMapper<WfFormManage, WfFormManageVo> {
}
