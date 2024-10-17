package org.dromara.works.domain.bo;

import org.dromara.works.domain.Efficiency;
import org.dromara.common.mybatis.core.domain.BaseEntity;
import org.dromara.common.core.validate.AddGroup;
import org.dromara.common.core.validate.EditGroup;
import io.github.linpeilie.annotations.AutoMapper;
import lombok.Data;
import lombok.EqualsAndHashCode;
import jakarta.validation.constraints.*;

/**
 * 测试单业务对象 s_efficiency
 *
 * @author sumrian
 * @date 2024-10-15
 */
@Data
@EqualsAndHashCode(callSuper = true)
@AutoMapper(target = Efficiency.class, reverseConvertGenerate = false)
public class EfficiencyBo extends BaseEntity {

    /**
     * 主键
     */
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


}
