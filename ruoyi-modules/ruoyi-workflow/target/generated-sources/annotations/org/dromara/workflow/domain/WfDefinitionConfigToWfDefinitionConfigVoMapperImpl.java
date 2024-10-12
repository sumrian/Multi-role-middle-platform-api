package org.dromara.workflow.domain;

import javax.annotation.processing.Generated;
import org.dromara.workflow.domain.vo.WfDefinitionConfigVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-10T11:43:33+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Amazon.com Inc.)"
)
@Component
public class WfDefinitionConfigToWfDefinitionConfigVoMapperImpl implements WfDefinitionConfigToWfDefinitionConfigVoMapper {

    @Override
    public WfDefinitionConfigVo convert(WfDefinitionConfig arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WfDefinitionConfigVo wfDefinitionConfigVo = new WfDefinitionConfigVo();

        wfDefinitionConfigVo.setId( arg0.getId() );
        wfDefinitionConfigVo.setTableName( arg0.getTableName() );
        wfDefinitionConfigVo.setDefinitionId( arg0.getDefinitionId() );
        wfDefinitionConfigVo.setProcessKey( arg0.getProcessKey() );
        wfDefinitionConfigVo.setVersion( arg0.getVersion() );
        wfDefinitionConfigVo.setRemark( arg0.getRemark() );

        return wfDefinitionConfigVo;
    }

    @Override
    public WfDefinitionConfigVo convert(WfDefinitionConfig arg0, WfDefinitionConfigVo arg1) {
        if ( arg0 == null ) {
            return arg1;
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
