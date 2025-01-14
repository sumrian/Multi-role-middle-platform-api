package org.dromara.demo.domain.vo;

import io.github.linpeilie.AutoMapperConfig__122;
import io.github.linpeilie.BaseMapper;
import org.dromara.demo.domain.TestTree;
import org.dromara.demo.domain.TestTreeToTestTreeVoMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__122.class,
    uses = {TestTreeToTestTreeVoMapper.class},
    imports = {}
)
public interface TestTreeVoToTestTreeMapper extends BaseMapper<TestTreeVo, TestTree> {
}
