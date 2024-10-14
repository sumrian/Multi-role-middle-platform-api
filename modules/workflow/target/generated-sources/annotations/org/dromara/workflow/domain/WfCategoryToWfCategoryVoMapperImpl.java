package org.dromara.workflow.domain;

import javax.annotation.processing.Generated;
import org.dromara.workflow.domain.vo.WfCategoryVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-10T11:43:32+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Amazon.com Inc.)"
)
@Component
public class WfCategoryToWfCategoryVoMapperImpl implements WfCategoryToWfCategoryVoMapper {

    @Override
    public WfCategoryVo convert(WfCategory arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WfCategoryVo wfCategoryVo = new WfCategoryVo();

        wfCategoryVo.setId( arg0.getId() );
        wfCategoryVo.setCategoryName( arg0.getCategoryName() );
        wfCategoryVo.setCategoryCode( arg0.getCategoryCode() );
        wfCategoryVo.setParentId( arg0.getParentId() );
        wfCategoryVo.setSortNum( arg0.getSortNum() );

        return wfCategoryVo;
    }

    @Override
    public WfCategoryVo convert(WfCategory arg0, WfCategoryVo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setCategoryName( arg0.getCategoryName() );
        arg1.setCategoryCode( arg0.getCategoryCode() );
        arg1.setParentId( arg0.getParentId() );
        arg1.setSortNum( arg0.getSortNum() );

        return arg1;
    }
}
