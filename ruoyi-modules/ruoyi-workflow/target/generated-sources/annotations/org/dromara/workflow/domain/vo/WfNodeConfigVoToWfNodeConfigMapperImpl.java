package org.dromara.workflow.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.workflow.domain.WfNodeConfig;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-10T11:43:32+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Amazon.com Inc.)"
)
@Component
public class WfNodeConfigVoToWfNodeConfigMapperImpl implements WfNodeConfigVoToWfNodeConfigMapper {

    @Override
    public WfNodeConfig convert(WfNodeConfigVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WfNodeConfig wfNodeConfig = new WfNodeConfig();

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
    public WfNodeConfig convert(WfNodeConfigVo arg0, WfNodeConfig arg1) {
        if ( arg0 == null ) {
            return arg1;
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
