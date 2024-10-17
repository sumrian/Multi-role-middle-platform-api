package org.dromara.demo.domain;

import io.github.linpeilie.AutoMapperConfig__122;
import io.github.linpeilie.BaseMapper;
import org.dromara.demo.domain.bo.TestTreeBoToTestTreeMapper;
import org.dromara.demo.domain.vo.TestTreeVo;
import org.dromara.demo.domain.vo.TestTreeVoToTestTreeMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__122.class,
    uses = {TestTreeVoToTestTreeMapper.class,TestTreeBoToTestTreeMapper.class},
    imports = {}
)
public interface TestTreeToTestTreeVoMapper extends BaseMapper<TestTree, TestTreeVo> {
}
