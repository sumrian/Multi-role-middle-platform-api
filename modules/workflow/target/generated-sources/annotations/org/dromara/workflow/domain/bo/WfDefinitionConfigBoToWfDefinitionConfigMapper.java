package org.dromara.workflow.domain.bo;

import io.github.linpeilie.AutoMapperConfig__65;
import io.github.linpeilie.BaseMapper;
import org.dromara.workflow.domain.WfDefinitionConfig;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__65.class,
    uses = {},
    imports = {}
)
public interface WfDefinitionConfigBoToWfDefinitionConfigMapper extends BaseMapper<WfDefinitionConfigBo, WfDefinitionConfig> {
}