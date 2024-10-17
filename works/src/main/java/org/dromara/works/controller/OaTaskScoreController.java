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
import org.dromara.works.domain.vo.OaTaskScoreVo;
import org.dromara.works.domain.bo.OaTaskScoreBo;
import org.dromara.works.service.IOaTaskScoreService;
import org.dromara.common.mybatis.core.page.TableDataInfo;

/**
 * OA效率管理
 *
 * @author sumrian
 * @date 2024-10-15
 */
@Validated
@RequiredArgsConstructor
@RestController
@RequestMapping("/works/oaTaskScore")
public class OaTaskScoreController extends BaseController {

    private final IOaTaskScoreService oaTaskScoreService;

    /**
     * 查询OA效率管理列表
     */
    @SaCheckPermission("works:oaTaskScore:list")
    @GetMapping("/list")
    public TableDataInfo<OaTaskScoreVo> list(OaTaskScoreBo bo, PageQuery pageQuery) {
        return oaTaskScoreService.queryPageList(bo, pageQuery);
    }

    /**
     * 导出OA效率管理列表
     */
    @SaCheckPermission("works:oaTaskScore:export")
    @Log(title = "OA效率管理", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    public void export(OaTaskScoreBo bo, HttpServletResponse response) {
        List<OaTaskScoreVo> list = oaTaskScoreService.queryList(bo);
        ExcelUtil.exportExcel(list, "OA效率管理", OaTaskScoreVo.class, response);
    }

    /**
     * 获取OA效率管理详细信息
     *
     * @param id 主键
     */
    @SaCheckPermission("works:oaTaskScore:query")
    @GetMapping("/{id}")
    public R<OaTaskScoreVo> getInfo(@NotNull(message = "主键不能为空")
                                     @PathVariable Long id) {
        return R.ok(oaTaskScoreService.queryById(id));
    }

    /**
     * 新增OA效率管理
     */
    @SaCheckPermission("works:oaTaskScore:add")
    @Log(title = "OA效率管理", businessType = BusinessType.INSERT)
    @RepeatSubmit()
    @PostMapping()
    public R<Void> add(@Validated(AddGroup.class) @RequestBody OaTaskScoreBo bo) {
        return toAjax(oaTaskScoreService.insertByBo(bo));
    }

    /**
     * 修改OA效率管理
     */
    @SaCheckPermission("works:oaTaskScore:edit")
    @Log(title = "OA效率管理", businessType = BusinessType.UPDATE)
    @RepeatSubmit()
    @PutMapping()
    public R<Void> edit(@Validated(EditGroup.class) @RequestBody OaTaskScoreBo bo) {
        return toAjax(oaTaskScoreService.updateByBo(bo));
    }

    /**
     * 删除OA效率管理
     *
     * @param ids 主键串
     */
    @SaCheckPermission("works:oaTaskScore:remove")
    @Log(title = "OA效率管理", businessType = BusinessType.DELETE)
    @DeleteMapping("/{ids}")
    public R<Void> remove(@NotEmpty(message = "主键不能为空")
                          @PathVariable Long[] ids) {
        return toAjax(oaTaskScoreService.deleteWithValidByIds(List.of(ids), true));
    }
}
