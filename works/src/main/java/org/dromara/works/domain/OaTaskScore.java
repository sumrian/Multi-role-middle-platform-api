package org.dromara.works.domain;

import org.dromara.common.tenant.core.TenantEntity;
import com.baomidou.mybatisplus.annotation.*;
import lombok.Data;
import lombok.EqualsAndHashCode;
import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serial;

/**
 * OA效率管理对象 s_oa_task_score
 *
 * @author sumrian
 * @date 2024-10-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@TableName("s_oa_task_score")
public class OaTaskScore extends TenantEntity {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @TableId(value = "id")
    private Long id;

    /**
     * 部门id
     */
    private Long deptId;

    /**
     * 用户id
     */
    private Long userId;

    /**
     * 排序号
     */
    private Long orderNum;

    /**
     * key键
     */
    private String testKey;

    /**
     * 值
     */
    private String value;

    /**
     * 版本
     */
    @Version
    private Long version;

    /**
     * 删除标志
     */
    @TableLogic
    private Long delFlag;

    /**
     * 执行人
     */
    private String EXECUTOR;

    /**
     * 复核人
     */
    private String REVIEWER;

    /**
     * 协助人
     */
    private String ASSISTANT;

    /**
     * 事项标题
     */
    private String TITLE;

    /**
     * 事项类型
     */
    private String type;

    /**
     * 得分
     */
    private String SCORE;

    /**
     * 用户得分(评分)
     */
    private String userScore;

    /**
     * 事项描述
     */
    private String DESCRIPTION;

    /**
     * 开始时间
     */
    private Date startTime;

    /**
     * 跟踪时间
     */
    private Date followUpTime;

    /**
     * 完成时间
     */
    private Date completionTime;

    /**
     * 任务状态
     */
    private String STATUS;

    /**
     * 耗时 (以分钟计)
     */
    private Long timeSpent;

    /**
     * 扩展信息
     */
    private String extJson;


}
