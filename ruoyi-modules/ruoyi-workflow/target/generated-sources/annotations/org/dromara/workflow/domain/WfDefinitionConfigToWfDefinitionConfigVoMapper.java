package org.dromara.workflow.domain;

import io.github.linpeilie.AutoMapperConfig__65;
import io.github.linpeilie.BaseMapper;
import org.dromara.workflow.domain.bo.WfDefinitionConfigBoToWfDefinitionConfigMapper;
import org.dromara.workflow.domain.vo.WfDefinitionConfigVo;
import org.dromara.workflow.domain.vo.WfDefinitionConfigVoToWfDefinitionConfigMapper;
import org.dromara.workflow.domain.vo.WfFormManageVoToWfFormManageMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__65.class,
    uses = {WfFormManageVoToWfFormManageMapper.class,WfFormManageToWfFormManageVoMapper.class,WfDefinitionConfigBoToWfDefinitionConfigMapper.class,WfDefinitionConfigVoToWfDefinitionConfigMapper.class},
    imports = {}
)
public interface WfDefinitionConfigToWfDefinitionConfigVoMapper extends BaseMapper<WfDefinitionConfig, WfDefinitionConfigVo> {
}
