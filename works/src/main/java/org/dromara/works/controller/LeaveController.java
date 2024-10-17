package org.dromara.works.controller;

import java.util.List;

import lombok.RequiredArgsConstructor;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.constraints.*;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.springframework.web.bind.annotation.*;
import org.springframework.validation.annotation.Validated;
import org.dromara.common.idempotent.annotation.RepeatSubmit;
import org.dromara.common.log.annotation.Log;
import org.dromara.common.web.core.BaseController;
import org.dromara.common.mybatis.core.page.PageQuery;
import org.dromara.common.core.domain.R;
import org.dromara.common.core.validate.AddGroup;
import org.dromara.common.core.validate.EditGroup;
import org.dromara.common.log.enums.BusinessType;
import org.dromara.common.excel.utils.ExcelUtil;
import org.dromara.works.domain.vo.LeaveVo;
import org.dromara.works.domain.bo.LeaveBo;
import org.dromara.works.service.ILeaveService;
import org.dromara.common.mybatis.core.page.TableDataInfo;

/**
 * 请假申请
 *
 * @author sumrian
 * @date 2024-10-15
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/works/leave")
public class LeaveController extends BaseController {

    private final ILeaveService leaveService;

    /**
     * 查询请假申请列表
     */
    @SaCheckPermission("works:leave:list")
    @GetMapping("/list")
    public TableDataInfo<LeaveVo> list(LeaveBo bo, PageQuery pageQuery) {
        return leaveService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出请假申请列表
     */
    @SaCheckPermission("works:leave:export")
    @Log(title = "请假申请", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(LeaveBo bo, HttpServletResponse response) {
        List<LeaveVo> list = leaveService.queryList(bo);
        ExcelUtil.exportExcel(list, "请假申请", LeaveVo.class, response);
    }

    /**
     * 获取请假申请详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("works:leave:query")
    @GetMapping("/{id}")
    public R<LeaveVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(leaveService.queryById(id));
    }

    /**
     * 新增请假申请
     */
    @SaCheckPermission("works:leave:add")
    @Log(title = "请假申请", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody LeaveBo bo) {
        return toAjax(leaveService.insertByBo(bo));
    }

    /**
     * 修改请假申请
     */
    @SaCheckPermission("works:leave:edit")
    @Log(title = "请假申请", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody LeaveBo bo) {
        return toAjax(leaveService.updateByBo(bo));
    }

    /**
     * 删除请假申请
     *
     * @param ids 主键串
     */
    @SaCheckPermission("works:leave:remove")
    @Log(title = "请假申请", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(leaveService.deleteWithValidByIds(List.of(ids), true));
    }
}
