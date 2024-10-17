package org.dromara.workflow.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.workflow.domain.WfDefinitionConfig;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-16T08:37:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Amazon.com Inc.)"
)
@Component
public class WfDefinitionConfigVoToWfDefinitionConfigMapperImpl implements WfDefinitionConfigVoToWfDefinitionConfigMapper {

    @Override
    public WfDefinitionConfig convert(WfDefinitionConfigVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WfDefinitionConfig wfDefinitionConfig = new WfDefinitionConfig();

        wfDefinitionConfig.setId( arg0.getId() );
        wfDefinitionConfig.setTableName( arg0.getTableName() );
        wfDefinitionConfig.setDefinitionId( arg0.getDefinitionId() );
        wfDefinitionConfig.setProcessKey( arg0.getProcessKey() );
        wfDefinitionConfig.setVersion( arg0.getVersion() );
        wfDefinitionConfig.setRemark( arg0.getRemark() );

        return wfDefinitionConfig;
    }

    @Override
    public WfDefinitionConfig convert(WfDefinitionConfigVo arg0, WfDefinitionConfig arg1) {
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
