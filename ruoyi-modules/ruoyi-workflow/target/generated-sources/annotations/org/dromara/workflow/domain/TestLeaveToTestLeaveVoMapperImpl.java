package org.dromara.workflow.domain;

import javax.annotation.processing.Generated;
import org.dromara.workflow.domain.vo.TestLeaveVo;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-10T11:43:31+0800",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.12 (Amazon.com Inc.)"
)
@Component
public class TestLeaveToTestLeaveVoMapperImpl implements TestLeaveToTestLeaveVoMapper {

    @Override
    public TestLeaveVo convert(TestLeave arg0) {
        if ( arg0 == null ) {
            return null;
        }

        TestLeaveVo testLeaveVo = new TestLeaveVo();

        testLeaveVo.setId( arg0.getId() );
        testLeaveVo.setLeaveType( arg0.getLeaveType() );
        testLeaveVo.setStartDate( arg0.getStartDate() );
        testLeaveVo.setEndDate( arg0.getEndDate() );
        testLeaveVo.setLeaveDays( arg0.getLeaveDays() );
        testLeaveVo.setRemark( arg0.getRemark() );
        testLeaveVo.setStatus( arg0.getStatus() );

        return testLeaveVo;
    }

    @Override
    public TestLeaveVo convert(TestLeave arg0, TestLeaveVo arg1) {
        if ( arg0 == null ) {
            return arg1;
        }

        arg1.setId( arg0.getId() );
        arg1.setLeaveType( arg0.getLeaveType() );
        arg1.setStartDate( arg0.getStartDate() );
        arg1.setEndDate( arg0.getEndDate() );
        arg1.setLeaveDays( arg0.getLeaveDays() );
        arg1.setRemark( arg0.getRemark() );
        arg1.setStatus( arg0.getStatus() );

        return arg1;
    }
}
