package org.dromara.workflow.domain;

import io.github.linpeilie.AutoMapperConfig__65;
import io.github.linpeilie.BaseMapper;
import org.dromara.workflow.domain.bo.WfNodeConfigBoToWfNodeConfigMapper;
import org.dromara.workflow.domain.vo.WfFormManageVoToWfFormManageMapper;
import org.dromara.workflow.domain.vo.WfNodeConfigVo;
import org.dromara.workflow.domain.vo.WfNodeConfigVoToWfNodeConfigMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__65.class,
    uses = {WfFormManageVoToWfFormManageMapper.class,WfFormManageToWfFormManageVoMapper.class,WfNodeConfigVoToWfNodeConfigMapper.class,WfNodeConfigBoToWfNodeConfigMapper.class},
    imports = {}
)
public interface WfNodeConfigToWfNodeConfigVoMapper extends BaseMapper<WfNodeConfig, WfNodeConfigVo> {
}
