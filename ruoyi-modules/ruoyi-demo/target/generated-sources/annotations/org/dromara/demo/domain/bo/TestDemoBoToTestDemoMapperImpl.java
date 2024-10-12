package org.dromara.demo.domain.bo;

import java.util.LinkedHashMap;
import java.util.Map;
import javax.annotation.processing.Generated;
import org.dromara.demo.domain.TestDemo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-10T11:43:57+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Amazon.com Inc.)"
)
@Component
public class TestDemoBoToTestDemoMapperImpl implements TestDemoBoToTestDemoMapper {

    @Override
    public TestDemo convert(TestDemoBo arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TestDemo testDemo = new TestDemo();

        testDemo.setSearchValue( arg0.getSearchValue() );
        testDemo.setCreateDept( arg0.getCreateDept() );
        testDemo.setCreateBy( arg0.getCreateBy() );
        testDemo.setCreateTime( arg0.getCreateTime() );
        testDemo.setUpdateBy( arg0.getUpdateBy() );
        testDemo.setUpdateTime( arg0.getUpdateTime() );
        Map<String, Object> map = arg0.getParams();
        if ( map != null ) {
            testDemo.setParams( new LinkedHashMap<String, Object>( map ) );
        }
        testDemo.setId( arg0.getId() );
        testDemo.setDeptId( arg0.getDeptId() );
        testDemo.setUserId( arg0.getUserId() );
        testDemo.setOrderNum( arg0.getOrderNum() );
        testDemo.setTestKey( arg0.getTestKey() );
        testDemo.setValue( arg0.getValue() );

        return testDemo;
    }

    @Override
    public TestDemo convert(TestDemoBo arg0, TestDemo arg1) {
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
        arg1.setDeptId( arg0.getDeptId() );
        arg1.setUserId( arg0.getUserId() );
        arg1.setOrderNum( arg0.getOrderNum() );
        arg1.setTestKey( arg0.getTestKey() );
        arg1.setValue( arg0.getValue() );

        return arg1;
    }
}
