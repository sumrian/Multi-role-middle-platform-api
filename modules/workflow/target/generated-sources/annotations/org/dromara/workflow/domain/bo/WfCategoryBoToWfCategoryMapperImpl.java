package org.dromara.workflow.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.workflow.domain.WfCategory;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-16T08:37:21+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Amazon.com Inc.)"
)
@Component
public class WfCategoryBoToWfCategoryMapperImpl implements WfCategoryBoToWfCategoryMapper {

    @Override
    public WfCategory convert(WfCategoryBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WfCategory wfCategory = new WfCategory();

        wfCategory.setSearchValue( arg0.getSearchValue() );
        wfCategory.setCreateDept( arg0.getCreateDept() );
        wfCategory.setCreateBy( arg0.getCreateBy() );
        wfCategory.setCreateTime( arg0.getCreateTime() );
        wfCategory.setUpdateBy( arg0.getUpdateBy() );
        wfCategory.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            wfCategory.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        wfCategory.setId( arg0.getId() );
        wfCategory.setCategoryName( arg0.getCategoryName() );
        wfCategory.setCategoryCode( arg0.getCategoryCode() );
        wfCategory.setParentId( arg0.getParentId() );
        wfCategory.setSortNum( arg0.getSortNum() );

        return wfCategory;
    }

    @Override
    public WfCategory convert(WfCategoryBo arg0, WfCategory arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setSearchValue( arg0.getSearchValue() );
        arg1.setCreateDept( arg0.getCreateDept() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setUpdateBy( arg0.getUpdateBy() );
        arg1.setUpdateTime( arg0.getUpdateTime() );
        if ( arg1.getParams() != null ) {
            Map<String, Object> map = arg0.getParams();
            if ( map != null ) {
                arg1.getParams().clear();
                arg1.getParams().putAll( map );
            }
            else {
                arg1.setParams( null );
            }
        }
        else {
            Map<String, Object> map = arg0.getParams();
            if ( map != null ) {
                arg1.setParams( new LinkedHashMap<String, Object>( map ) );
            }
        }
        arg1.setId( arg0.getId() );
        arg1.setCategoryName( arg0.getCategoryName() );
        arg1.setCategoryCode( arg0.getCategoryCode() );
        arg1.setParentId( arg0.getParentId() );
        arg1.setSortNum( arg0.getSortNum() );

        return arg1;
    }
}
