package org.dromara.demo.domain.bo;

import io.github.linpeilie.AutoMapperConfig__122;
import io.github.linpeilie.BaseMapper;
import org.dromara.demo.domain.TestTree;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__122.class,
    uses = {},
    imports = {}
)
public interface TestTreeBoToTestTreeMapper extends BaseMapper<TestTreeBo, TestTree> {
}
