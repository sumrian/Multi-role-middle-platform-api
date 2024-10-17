package org.dromara.works.domain.vo;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.dromara.works.domain.OaTaskScore;
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
 * OA效率管理视图对象 s_oa_task_score
 *
 * @author sumrian
 * @date 2024-10-15
 */
@Data
@ExcelIgnoreUnannotated
@AutoMapper(target = OaTaskScore.class)
public class OaTaskScoreVo implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    /**
     * 主键
     */
    @ExcelProperty(value = "主键")
    private Long id;

    /**
     * 部门id
     */
    @ExcelProperty(value = "部门id")
    private Long deptId;

    /**
     * 用户id
     */
    @ExcelProperty(value = "用户id")
    private Long userId;

    /**
     * 排序号
     */
    @ExcelProperty(value = "排序号")
    private Long orderNum;

    /**
     * key键
     */
    @ExcelProperty(value = "key键")
    private String testKey;

    /**
     * 值
     */
    @ExcelProperty(value = "值")
    private String value;

    /**
     * 执行人
     */
    @ExcelProperty(value = "执行人")
    private String EXECUTOR;

    /**
     * 复核人
     */
    @ExcelProperty(value = "复核人")
    private String REVIEWER;

    /**
     * 协助人
     */
    @ExcelProperty(value = "协助人")
    private String ASSISTANT;

    /**
     * 事项标题
     */
    @ExcelProperty(value = "事项标题")
    private String TITLE;

    /**
     * 事项类型
     */
    @ExcelProperty(value = "事项类型")
    private String TYPE;

    /**
     * 得分
     */
    @ExcelProperty(value = "得分")
    private String SCORE;

    /**
     * 用户得分(评分)
     */
    @ExcelProperty(value = "用户得分(评分)")
    private String userScore;

    /**
     * 事项描述
     */
    @ExcelProperty(value = "事项描述")
    private String DESCRIPTION;

    /**
     * 开始时间
     */
    @ExcelProperty(value = "开始时间")
    private Date startTime;

    /**
     * 跟踪时间
     */
    @ExcelProperty(value = "跟踪时间")
    private Date followUpTime;

    /**
     * 完成时间
     */
    @ExcelProperty(value = "完成时间")
    private Date completionTime;

    /**
     * 任务状态
     */
    @ExcelProperty(value = "任务状态")
    private String STATUS;

    /**
     * 耗时 (以分钟计)
     */
    @ExcelProperty(value = "耗时 (以分钟计)")
    private Long timeSpent;

    /**
     * 扩展信息
     */
    @ExcelProperty(value = "扩展信息")
    private String extJson;


}
