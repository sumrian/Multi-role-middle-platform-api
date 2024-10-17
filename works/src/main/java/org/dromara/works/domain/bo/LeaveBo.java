package org.dromara.works.domain.bo;

import org.dromara.works.domain.Leave;
import org.dromara.common.mybatis.core.domain.BaseEntity;
import org.dromara.common.core.validate.AddGroup;
import org.dromara.common.core.validate.EditGroup;
import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;
import lombok.EqualsAndHashCode;
import jakarta.validation.constraints.*;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

/**
 * 请假申请业务对象 s_leave
 *
 * @author sumrian
 * @date 2024-10-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AutoMapper(target = Leave.class, reverseConvertGenerate = false)
public class LeaveBo extends BaseEntity {

    /**
     * 主键
     */
    @NotNull(message = "主键不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * 请假类型
     */
    @NotBlank(message = "请假类型不能为空", groups = { AddGroup.class, EditGroup.class })
    private String leaveType;

    /**
     * 开始时间
     */
    @NotNull(message = "开始时间不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date startDate;

    /**
     * 结束时间
     */
    @NotNull(message = "结束时间不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date endDate;

    /**
     * 请假天数
     */
    @NotNull(message = "请假天数不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long leaveDays;

    /**
     * 请假原因
     */
    @NotBlank(message = "请假原因不能为空", groups = { AddGroup.class, EditGroup.class })
    private String remark;

    /**
     * 状态
     */
//    @NotBlank(message = "状态不能为空", groups = { AddGroup.class, EditGroup.class })
    private String status;


}
