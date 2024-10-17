package org.dromara.works.domain.vo;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.dromara.works.domain.Leave;
import com.alibaba.excel.annotation.ExcelIgnoreUnannotated;
import com.alibaba.excel.annotation.ExcelProperty;
import org.dromara.common.excel.annotation.ExcelDictFormat;
import org.dromara.common.excel.convert.ExcelDictConvert;
import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;

import java.io.Serial;
import java.io.Serializable;
import java.util.Date;



/**
 * 请假申请视图对象 s_leave
 *
 * @author sumrian
 * @date 2024-10-15
 */
@Data
@ExcelIgnoreUnannotated
@AutoMapper(target = Leave.class)
public class LeaveVo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ExcelProperty(value = "主键")
    private Long id;

    /**
     * 请假类型
     */
    @ExcelProperty(value = "请假类型")
    private String leaveType;

    /**
     * 开始时间
     */
    @ExcelProperty(value = "开始时间")
    private Date startDate;

    /**
     * 结束时间
     */
    @ExcelProperty(value = "结束时间")
    private Date endDate;

    /**
     * 请假天数
     */
    @ExcelProperty(value = "请假天数")
    private Long leaveDays;

    /**
     * 请假原因
     */
    @ExcelProperty(value = "请假原因")
    private String remark;

    /**
     * 状态
     */
    @ExcelProperty(value = "状态")
    private String status;


}
