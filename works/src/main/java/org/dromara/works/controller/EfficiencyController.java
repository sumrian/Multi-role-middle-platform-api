package org.dromara.works.controller;

import java.util.List;

import lombok.RequiredArgsConstructor;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.validation.constraints.*;
import cn.dev33.satoken.annotation.SaCheckPermission;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
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
import org.dromara.works.domain.vo.EfficiencyVo;
import org.dromara.works.domain.bo.EfficiencyBo;
import org.dromara.works.service.IEfficiencyService;
import org.dromara.common.mybatis.core.page.TableDataInfo;

/**
 * 测试单
 *
 * @author sumrian
 * @date 2024-10-15
 */
@Validated
@RestController
@RequiredArgsConstructor
@Service
@RequestMapping("/works/efficiency")
public class EfficiencyController extends BaseController {

    private static final Logger log = LoggerFactory.getLogger(EfficiencyController.class);
    @Autowired
    private  IEfficiencyService efficiencyService;
    /**
     * 查询测试单列表
     */
    @SaCheckPermission("works:efficiency:list")
    @GetMapping("/list")
    public TableDataInfo<EfficiencyVo> list(EfficiencyBo bo, PageQuery pageQuery) {
        return efficiencyService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出测试单列表
     */
    @SaCheckPermission("works:efficiency:export")
    @Log(title = "测试单", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(EfficiencyBo bo, HttpServletResponse response) {
        List<EfficiencyVo> list = efficiencyService.queryList(bo);
        ExcelUtil.exportExcel(list, "测试单", EfficiencyVo.class, response);
    }

    /**
     * 获取测试单详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("works:efficiency:query")
    @GetMapping("/{id}")
    public R<EfficiencyVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(efficiencyService.queryById(id));
    }

    /**
     * 新增测试单
     */
    @SaCheckPermission("works:efficiency:add")
    @Log(title = "测试单", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody EfficiencyBo bo) {
        return toAjax(efficiencyService.insertByBo(bo));
    }

    /**
     * 修改测试单
     */
    @SaCheckPermission("works:efficiency:edit")
    @Log(title = "测试单", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody EfficiencyBo bo) {
        return toAjax(efficiencyService.updateByBo(bo));
    }

    /**
     * 删除测试单
     *
     * @param ids 主键串
     */
    @SaCheckPermission("works:efficiency:remove")
    @Log(title = "测试单", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(efficiencyService.deleteWithValidByIds(List.of(ids), true));
    }
}
