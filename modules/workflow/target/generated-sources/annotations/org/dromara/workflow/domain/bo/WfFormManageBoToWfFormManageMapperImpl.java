package org.dromara.workflow.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.workflow.domain.WfFormManage;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-16T08:37:21+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Amazon.com Inc.)"
)
@Component
public class WfFormManageBoToWfFormManageMapperImpl implements WfFormManageBoToWfFormManageMapper {

    @Override
    public WfFormManage convert(WfFormManageBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        WfFormManage wfFormManage = new WfFormManage();

        wfFormManage.setSearchValue( arg0.getSearchValue() );
        wfFormManage.setCreateDept( arg0.getCreateDept() );
        wfFormManage.setCreateBy( arg0.getCreateBy() );
        wfFormManage.setCreateTime( arg0.getCreateTime() );
        wfFormManage.setUpdateBy( arg0.getUpdateBy() );
        wfFormManage.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            wfFormManage.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        wfFormManage.setId( arg0.getId() );
        wfFormManage.setFormName( arg0.getFormName() );
        wfFormManage.setFormType( arg0.getFormType() );
        wfFormManage.setRouter( arg0.getRouter() );
        wfFormManage.setRemark( arg0.getRemark() );

        return wfFormManage;
    }

    @Override
    public WfFormManage convert(WfFormManageBo arg0, WfFormManage arg1) {
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
        arg1.setFormName( arg0.getFormName() );
        arg1.setFormType( arg0.getFormType() );
        arg1.setRouter( arg0.getRouter() );
        arg1.setRemark( arg0.getRemark() );

        return arg1;
    }
}
