package org.dromara.workflow.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.workflow.domain.WfDefinitionConfig;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-16T08:37:21+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Amazon.com Inc.)"
)
@Component
public class WfDefinitionConfigBoToWfDefinitionConfigMapperImpl implements WfDefinitionConfigBoToWfDefinitionConfigMapper {

    @Override
    public WfDefinitionConfig convert(WfDefinitionConfigBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WfDefinitionConfig wfDefinitionConfig = new WfDefinitionConfig();

        wfDefinitionConfig.setSearchValue( arg0.getSearchValue() );
        wfDefinitionConfig.setCreateDept( arg0.getCreateDept() );
        wfDefinitionConfig.setCreateBy( arg0.getCreateBy() );
        wfDefinitionConfig.setCreateTime( arg0.getCreateTime() );
        wfDefinitionConfig.setUpdateBy( arg0.getUpdateBy() );
        wfDefinitionConfig.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            wfDefinitionConfig.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        wfDefinitionConfig.setId( arg0.getId() );
        wfDefinitionConfig.setTableName( arg0.getTableName() );
        wfDefinitionConfig.setDefinitionId( arg0.getDefinitionId() );
        wfDefinitionConfig.setProcessKey( arg0.getProcessKey() );
        wfDefinitionConfig.setVersion( arg0.getVersion() );
        wfDefinitionConfig.setRemark( arg0.getRemark() );

        return wfDefinitionConfig;
    }

    @Override
    public WfDefinitionConfig convert(WfDefinitionConfigBo arg0, WfDefinitionConfig arg1) {
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
        arg1.setTableName( arg0.getTableName() );
        arg1.setDefinitionId( arg0.getDefinitionId() );
        arg1.setProcessKey( arg0.getProcessKey() );
        arg1.setVersion( arg0.getVersion() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
