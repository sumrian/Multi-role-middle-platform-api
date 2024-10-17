package org.dromara.web.domain.vo;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysTenantVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-16T08:37:33+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Amazon.com Inc.)"
)
@Component
public class TenantListVoToSysTenantVoMapperImpl implements TenantListVoToSysTenantVoMapper {

    @Override
    public SysTenantVo convert(TenantListVo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysTenantVo sysTenantVo = new SysTenantVo();

        sysTenantVo.setTenantId( arg0.getTenantId() );
        sysTenantVo.setCompanyName( arg0.getCompanyName() );
        sysTenantVo.setDomain( arg0.getDomain() );

        return sysTenantVo;
    }

    @Override
    public SysTenantVo convert(TenantListVo arg0, SysTenantVo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setTenantId( arg0.getTenantId() );
        arg1.setCompanyName( arg0.getCompanyName() );
        arg1.setDomain( arg0.getDomain() );

        return arg1;
    }
}
