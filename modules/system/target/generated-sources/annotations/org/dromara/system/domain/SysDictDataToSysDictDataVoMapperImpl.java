package org.dromara.system.domain;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysDictDataVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-16T08:36:52+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Amazon.com Inc.)"
)
@Component
public class SysDictDataToSysDictDataVoMapperImpl implements SysDictDataToSysDictDataVoMapper {

    @Override
    public SysDictDataVo convert(SysDictData arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysDictDataVo sysDictDataVo = new SysDictDataVo();

        sysDictDataVo.setDictCode( arg0.getDictCode() );
        sysDictDataVo.setDictSort( arg0.getDictSort() );
        sysDictDataVo.setDictLabel( arg0.getDictLabel() );
        sysDictDataVo.setDictValue( arg0.getDictValue() );
        sysDictDataVo.setDictType( arg0.getDictType() );
        sysDictDataVo.setCssClass( arg0.getCssClass() );
        sysDictDataVo.setListClass( arg0.getListClass() );
        sysDictDataVo.setIsDefault( arg0.getIsDefault() );
        sysDictDataVo.setRemark( arg0.getRemark() );
        sysDictDataVo.setCreateTime( arg0.getCreateTime() );

        return sysDictDataVo;
    }

    @Override
    public SysDictDataVo convert(SysDictData arg0, SysDictDataVo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setDictCode( arg0.getDictCode() );
        arg1.setDictSort( arg0.getDictSort() );
        arg1.setDictLabel( arg0.getDictLabel() );
        arg1.setDictValue( arg0.getDictValue() );
        arg1.setDictType( arg0.getDictType() );
        arg1.setCssClass( arg0.getCssClass() );
        arg1.setListClass( arg0.getListClass() );
        arg1.setIsDefault( arg0.getIsDefault() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setCreateTime( arg0.getCreateTime() );

        return arg1;
    }
}
