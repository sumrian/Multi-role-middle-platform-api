package org.dromara.workflow.domain.vo;

import io.github.linpeilie.AutoMapperConfig__65;
import io.github.linpeilie.BaseMapper;
import org.dromara.workflow.domain.WfFormManageToWfFormManageVoMapper;
import org.dromara.workflow.domain.WfNodeConfig;
import org.dromara.workflow.domain.WfNodeConfigToWfNodeConfigVoMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__65.class,
    uses = {WfFormManageVoToWfFormManageMapper.class,WfFormManageToWfFormManageVoMapper.class,WfNodeConfigToWfNodeConfigVoMapper.class},
    imports = {}
)
public interface WfNodeConfigVoToWfNodeConfigMapper extends BaseMapper<WfNodeConfigVo, WfNodeConfig> {
}
