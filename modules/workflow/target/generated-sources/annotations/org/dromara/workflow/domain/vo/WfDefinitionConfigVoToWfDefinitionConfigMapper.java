package org.dromara.workflow.domain.vo;

import io.github.linpeilie.AutoMapperConfig__120;
import io.github.linpeilie.BaseMapper;
import org.dromara.workflow.domain.WfDefinitionConfig;
import org.dromara.workflow.domain.WfDefinitionConfigToWfDefinitionConfigVoMapper;
import org.dromara.workflow.domain.WfFormManageToWfFormManageVoMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__120.class,
    uses = {WfFormManageVoToWfFormManageMapper.class,WfFormManageToWfFormManageVoMapper.class,WfDefinitionConfigToWfDefinitionConfigVoMapper.class},
    imports = {}
)
public interface WfDefinitionConfigVoToWfDefinitionConfigMapper extends BaseMapper<WfDefinitionConfigVo, WfDefinitionConfig> {
}
