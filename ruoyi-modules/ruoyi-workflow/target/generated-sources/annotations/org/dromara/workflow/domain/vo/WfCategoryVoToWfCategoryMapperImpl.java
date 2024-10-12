package org.dromara.workflow.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.workflow.domain.WfCategory;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-10T11:43:32+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Amazon.com Inc.)"
)
@Component
public class WfCategoryVoToWfCategoryMapperImpl implements WfCategoryVoToWfCategoryMapper {

    @Override
    public WfCategory convert(WfCategoryVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WfCategory wfCategory = new WfCategory();

        wfCategory.setId( arg0.getId() );
        wfCategory.setCategoryName( arg0.getCategoryName() );
        wfCategory.setCategoryCode( arg0.getCategoryCode() );
        wfCategory.setParentId( arg0.getParentId() );
        wfCategory.setSortNum( arg0.getSortNum() );

        return wfCategory;
    }

    @Override
    public WfCategory convert(WfCategoryVo arg0, WfCategory arg1) {
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
