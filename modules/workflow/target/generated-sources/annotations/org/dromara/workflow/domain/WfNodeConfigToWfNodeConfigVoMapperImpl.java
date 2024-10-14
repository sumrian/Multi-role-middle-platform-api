package org.dromara.workflow.domain;

import javax.annotation.processing.Generated;
import org.dromara.workflow.domain.vo.WfNodeConfigVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-10T11:43:33+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Amazon.com Inc.)"
)
@Component
public class WfNodeConfigToWfNodeConfigVoMapperImpl implements WfNodeConfigToWfNodeConfigVoMapper {

    @Override
    public WfNodeConfigVo convert(WfNodeConfig arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WfNodeConfigVo wfNodeConfigVo = new WfNodeConfigVo();

        wfNodeConfigVo.setId( arg0.getId() );
        wfNodeConfigVo.setFormId( arg0.getFormId() );
        wfNodeConfigVo.setFormType( arg0.getFormType() );
        wfNodeConfigVo.setNodeName( arg0.getNodeName() );
        wfNodeConfigVo.setNodeId( arg0.getNodeId() );
        wfNodeConfigVo.setDefinitionId( arg0.getDefinitionId() );
        wfNodeConfigVo.setApplyUserTask( arg0.getApplyUserTask() );

        return wfNodeConfigVo;
    }

    @Override
    public WfNodeConfigVo convert(WfNodeConfig arg0, WfNodeConfigVo arg1) {
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
