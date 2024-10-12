package org.dromara.demo.domain.vo;

import io.github.linpeilie.AutoMapperConfig__67;
import io.github.linpeilie.BaseMapper;
import org.dromara.demo.domain.TestDemo;
import org.dromara.demo.domain.TestDemoToTestDemoVoMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__67.class,
    uses = {TestDemoToTestDemoVoMapper.class},
    imports = {}
)
public interface TestDemoVoToTestDemoMapper extends BaseMapper<TestDemoVo, TestDemo> {
}