package org.dromara.works.service;

import org.dromara.works.domain.vo.EfficiencyVo;
import org.dromara.works.domain.bo.EfficiencyBo;
import org.dromara.common.mybatis.core.page.TableDataInfo;
import org.dromara.common.mybatis.core.page.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * 测试单Service接口
 *
 * @author sumrian
 * @date 2024-10-15
 */
public interface IEfficiencyService {

    /**
     * 查询测试单
     *
     * @param id 主键
     * @return 测试单
     */
    EfficiencyVo queryById(Long id);

    /**
     * 分页查询测试单列表
     *
     * @param bo        查询条件
     * @param pageQuery 分页参数
     * @return 测试单分页列表
     */
    TableDataInfo<EfficiencyVo> queryPageList(EfficiencyBo bo, PageQuery pageQuery);

    /**
     * 查询符合条件的测试单列表
     *
     * @param bo 查询条件
     * @return 测试单列表
     */
    List<EfficiencyVo> queryList(EfficiencyBo bo);

    /**
     * 新增测试单
     *
     * @param bo 测试单
     * @return 是否新增成功
     */
    Boolean insertByBo(EfficiencyBo bo);

    /**
     * 修改测试单
     *
     * @param bo 测试单
     * @return 是否修改成功
     */
    Boolean updateByBo(EfficiencyBo bo);

    /**
     * 校验并批量删除测试单信息
     *
     * @param ids     待删除的主键集合
     * @param isValid 是否进行有效性校验
     * @return 是否删除成功
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
