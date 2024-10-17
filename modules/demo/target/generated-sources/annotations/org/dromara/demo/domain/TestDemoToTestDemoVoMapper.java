package org.dromara.demo.domain;

import io.github.linpeilie.AutoMapperConfig__122;
import io.github.linpeilie.BaseMapper;
import org.dromara.demo.domain.bo.TestDemoBoToTestDemoMapper;
import org.dromara.demo.domain.vo.TestDemoVo;
import org.dromara.demo.domain.vo.TestDemoVoToTestDemoMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__122.class,
    uses = {TestDemoVoToTestDemoMapper.class,TestDemoBoToTestDemoMapper.class},
    imports = {}
)
public interface TestDemoToTestDemoVoMapper extends BaseMapper<TestDemo, TestDemoVo> {
}
