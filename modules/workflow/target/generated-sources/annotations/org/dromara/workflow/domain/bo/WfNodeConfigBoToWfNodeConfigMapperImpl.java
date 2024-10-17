package org.dromara.workflow.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.workflow.domain.WfNodeConfig;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-16T08:37:21+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Amazon.com Inc.)"
)
@Component
public class WfNodeConfigBoToWfNodeConfigMapperImpl implements WfNodeConfigBoToWfNodeConfigMapper {

    @Override
    public WfNodeConfig convert(WfNodeConfigBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WfNodeConfig wfNodeConfig = new WfNodeConfig();

        wfNodeConfig.setSearchValue( arg0.getSearchValue() );
        wfNodeConfig.setCreateDept( arg0.getCreateDept() );
        wfNodeConfig.setCreateBy( arg0.getCreateBy() );
        wfNodeConfig.setCreateTime( arg0.getCreateTime() );
        wfNodeConfig.setUpdateBy( arg0.getUpdateBy() );
        wfNodeConfig.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            wfNodeConfig.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        wfNodeConfig.setId( arg0.getId() );
        wfNodeConfig.setFormId( arg0.getFormId() );
        wfNodeConfig.setFormType( arg0.getFormType() );
        wfNodeConfig.setNodeName( arg0.getNodeName() );
        wfNodeConfig.setNodeId( arg0.getNodeId() );
        wfNodeConfig.setDefinitionId( arg0.getDefinitionId() );
        wfNodeConfig.setApplyUserTask( arg0.getApplyUserTask() );

        return wfNodeConfig;
    }

    @Override
    public WfNodeConfig convert(WfNodeConfigBo arg0, WfNodeConfig arg1) {
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
        arg1.setFormId( arg0.getFormId() );
        arg1.setFormType( arg0.getFormType() );
        arg1.setNodeName( arg0.getNodeName() );
        arg1.setNodeId( arg0.getNodeId() );
        arg1.setDefinitionId( arg0.getDefinitionId() );
        arg1.setApplyUserTask( arg0.getApplyUserTask() );

        return arg1;
    }
}
