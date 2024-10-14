package org.dromara.workflow.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.workflow.domain.WfFormManage;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-10T11:43:32+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Amazon.com Inc.)"
)
@Component
public class WfFormManageVoToWfFormManageMapperImpl implements WfFormManageVoToWfFormManageMapper {

    @Override
    public WfFormManage convert(WfFormManageVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WfFormManage wfFormManage = new WfFormManage();

        wfFormManage.setId( arg0.getId() );
        wfFormManage.setFormName( arg0.getFormName() );
        wfFormManage.setFormType( arg0.getFormType() );
        wfFormManage.setRouter( arg0.getRouter() );
        wfFormManage.setRemark( arg0.getRemark() );

        return wfFormManage;
    }

    @Override
    public WfFormManage convert(WfFormManageVo arg0, WfFormManage arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setFormName( arg0.getFormName() );
        arg1.setFormType( arg0.getFormType() );
        arg1.setRouter( arg0.getRouter() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
