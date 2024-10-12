package org.dromara.workflow.domain;

import io.github.linpeilie.AutoMapperConfig__65;
import io.github.linpeilie.BaseMapper;
import org.dromara.workflow.domain.bo.WfCategoryBoToWfCategoryMapper;
import org.dromara.workflow.domain.vo.WfCategoryVo;
import org.dromara.workflow.domain.vo.WfCategoryVoToWfCategoryMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__65.class,
    uses = {WfCategoryBoToWfCategoryMapper.class,WfCategoryVoToWfCategoryMapper.class},
    imports = {}
)
public interface WfCategoryToWfCategoryVoMapper extends BaseMapper<WfCategory, WfCategoryVo> {
}
