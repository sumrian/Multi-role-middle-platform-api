package org.dromara.system.domain;

import io.github.linpeilie.AutoMapperConfig__119;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.bo.SysDeptBoToSysDeptMapper;
import org.dromara.system.domain.vo.SysDeptVo;
import org.dromara.system.domain.vo.SysDeptVoToSysDeptMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__119.class,
    uses = {SysDeptVoToSysDeptMapper.class,SysDeptBoToSysDeptMapper.class},
    imports = {}
)
public interface SysDeptToSysDeptVoMapper extends BaseMapper<SysDept, SysDeptVo> {
}
