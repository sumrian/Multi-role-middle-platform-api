package org.dromara.workflow.domain.vo;

import io.github.linpeilie.AutoMapperConfig__120;
import io.github.linpeilie.BaseMapper;
import org.dromara.workflow.domain.WfCategory;
import org.dromara.workflow.domain.WfCategoryToWfCategoryVoMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__120.class,
    uses = {WfCategoryToWfCategoryVoMapper.class},
    imports = {}
)
public interface WfCategoryVoToWfCategoryMapper extends BaseMapper<WfCategoryVo, WfCategory> {
}
