package org.dromara.system.domain;

import javax.annotation.processing.Generated;
import org.dromara.system.domain.vo.SysOssVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-10T11:43:46+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Amazon.com Inc.)"
)
@Component
public class SysOssToSysOssVoMapperImpl implements SysOssToSysOssVoMapper {

    @Override
    public SysOssVo convert(SysOss arg0) {
        if ( arg0 == null ) {
            return null;
        }

        SysOssVo sysOssVo = new SysOssVo();

        sysOssVo.setOssId( arg0.getOssId() );
        sysOssVo.setFileName( arg0.getFileName() );
        sysOssVo.setOriginalName( arg0.getOriginalName() );
        sysOssVo.setFileSuffix( arg0.getFileSuffix() );
        sysOssVo.setUrl( arg0.getUrl() );
        sysOssVo.setCreateTime( arg0.getCreateTime() );
        sysOssVo.setCreateBy( arg0.getCreateBy() );
        sysOssVo.setService( arg0.getService() );

        return sysOssVo;
    }

    @Override
    public SysOssVo convert(SysOss arg0, SysOssVo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setOssId( arg0.getOssId() );
        arg1.setFileName( arg0.getFileName() );
        arg1.setOriginalName( arg0.getOriginalName() );
        arg1.setFileSuffix( arg0.getFileSuffix() );
        arg1.setUrl( arg0.getUrl() );
        arg1.setCreateTime( arg0.getCreateTime() );
        arg1.setCreateBy( arg0.getCreateBy() );
        arg1.setService( arg0.getService() );

        return arg1;
    }
}
