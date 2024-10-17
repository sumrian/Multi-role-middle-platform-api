package org.dromara.works.domain.bo;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.dromara.works.domain.OaTaskScore;
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
 * OA效率管理业务对象 s_oa_task_score
 *
 * @author sumrian
 * @date 2024-10-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AutoMapper(target = OaTaskScore.class, reverseConvertGenerate = false)
public class OaTaskScoreBo extends BaseEntity {

    /**
     * 主键
     */
    @JsonProperty
    @NotNull(message = "主键不能为空", groups = { EditGroup.class })
    private Long id;

    /**
     * 部门id
     */
    @NotNull(message = "部门id不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long deptId;

    /**
     * 用户id
     */
    @NotNull(message = "用户id不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long userId;

    /**
     * 排序号
     */
    @NotNull(message = "排序号不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long orderNum;

    /**
     * key键
     */
    @NotBlank(message = "key键不能为空", groups = { AddGroup.class, EditGroup.class })
    private String testKey;

    /**
     * 值
     */
    @NotBlank(message = "值不能为空", groups = { AddGroup.class, EditGroup.class })
    private String value;

    /**
     * 执行人
     */
    @NotBlank(message = "执行人不能为空", groups = { AddGroup.class, EditGroup.class })
    private String EXECUTOR;

    /**
     * 复核人
     */
    @NotBlank(message = "复核人不能为空", groups = { AddGroup.class, EditGroup.class })
    private String REVIEWER;

    /**
     * 协助人
     */
    @NotBlank(message = "协助人不能为空", groups = { AddGroup.class, EditGroup.class })
    private String ASSISTANT;

    /**
     * 事项标题
     */
    @NotBlank(message = "事项标题不能为空", groups = { AddGroup.class, EditGroup.class })
    private String TITLE;

    /**
     * 事项类型
     */
    @NotBlank(message = "事项类型不能为空", groups = { AddGroup.class, EditGroup.class })
    private String TYPE;

    /**
     * 得分
     */
    @NotBlank(message = "得分不能为空", groups = { AddGroup.class, EditGroup.class })
    private String SCORE;

    /**
     * 用户得分(评分)
     */
    @NotBlank(message = "用户得分(评分)不能为空", groups = { AddGroup.class, EditGroup.class })
    private String userScore;

    /**
     * 事项描述
     */
//    @NotBlank(message = "事项描述不能为空", groups = { AddGroup.class, EditGroup.class })

    private String DESCRIPTION;

    /**
     * 开始时间
     */
    @NotNull(message = "开始时间不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date startTime;

    /**
     * 跟踪时间
     */
    @NotNull(message = "跟踪时间不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date followUpTime;

    /**
     * 完成时间
     */
    @NotNull(message = "完成时间不能为空", groups = { AddGroup.class, EditGroup.class })
    private Date completionTime;

    /**
     * 任务状态
     */
    @NotBlank(message = "任务状态不能为空", groups = { AddGroup.class, EditGroup.class })
    private String STATUS;

    /**
     * 耗时 (以分钟计)
     */
    @NotNull(message = "耗时 (以分钟计)不能为空", groups = { AddGroup.class, EditGroup.class })
    private Long timeSpent;

    /**
     * 扩展信息
     */
    @NotBlank(message = "扩展信息不能为空", groups = { AddGroup.class, EditGroup.class })
    private String extJson;


}
