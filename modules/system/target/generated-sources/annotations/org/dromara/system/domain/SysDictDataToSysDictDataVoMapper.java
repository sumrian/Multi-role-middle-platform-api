package org.dromara.system.domain;

import io.github.linpeilie.AutoMapperConfig__119;
import io.github.linpeilie.BaseMapper;
import org.dromara.system.domain.bo.SysDictDataBoToSysDictDataMapper;
import org.dromara.system.domain.vo.SysDictDataVo;
import org.dromara.system.domain.vo.SysDictDataVoToSysDictDataMapper;
import org.mapstruct.Mapper;

@Mapper(
    config = AutoMapperConfig__119.class,
    uses = {SysDictDataBoToSysDictDataMapper.class,SysDictDataVoToSysDictDataMapper.class},
    imports = {}
)
public interface SysDictDataToSysDictDataVoMapper extends BaseMapper<SysDictData, SysDictDataVo> {
}
