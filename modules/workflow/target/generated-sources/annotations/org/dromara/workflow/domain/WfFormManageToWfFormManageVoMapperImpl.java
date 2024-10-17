package org.dromara.workflow.domain;

import javax.annotation.processing.Generated;
import org.dromara.workflow.domain.vo.WfFormManageVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-16T08:37:20+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Amazon.com Inc.)"
)
@Component
public class WfFormManageToWfFormManageVoMapperImpl implements WfFormManageToWfFormManageVoMapper {

    @Override
    public WfFormManageVo convert(WfFormManage arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WfFormManageVo wfFormManageVo = new WfFormManageVo();

        wfFormManageVo.setId( arg0.getId() );
        wfFormManageVo.setFormName( arg0.getFormName() );
        wfFormManageVo.setFormType( arg0.getFormType() );
        wfFormManageVo.setRouter( arg0.getRouter() );
        wfFormManageVo.setRemark( arg0.getRemark() );

        return wfFormManageVo;
    }

    @Override
    public WfFormManageVo convert(WfFormManage arg0, WfFormManageVo arg1) {
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
