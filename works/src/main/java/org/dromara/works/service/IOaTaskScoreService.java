package org.dromara.works.service;

import org.dromara.works.domain.vo.OaTaskScoreVo;
import org.dromara.works.domain.bo.OaTaskScoreBo;
import org.dromara.common.mybatis.core.page.TableDataInfo;
import org.dromara.common.mybatis.core.page.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * OA效率管理Service接口
 *
 * @author sumrian
 * @date 2024-10-15
 */
public interface IOaTaskScoreService {

    /**
     * 查询OA效率管理
     *
     * @param id 主键
     * @return OA效率管理
     */
    OaTaskScoreVo queryById(Long id);

    /**
     * 分页查询OA效率管理列表
     *
     * @param bo        查询条件
     * @param pageQuery 分页参数
     * @return OA效率管理分页列表
     */
    TableDataInfo<OaTaskScoreVo> queryPageList(OaTaskScoreBo bo, PageQuery pageQuery);

    /**
     * 查询符合条件的OA效率管理列表
     *
     * @param bo 查询条件
     * @return OA效率管理列表
     */
    List<OaTaskScoreVo> queryList(OaTaskScoreBo bo);

    /**
     * 新增OA效率管理
     *
     * @param bo OA效率管理
     * @return 是否新增成功
     */
    Boolean insertByBo(OaTaskScoreBo bo);

    /**
     * 修改OA效率管理
     *
     * @param bo OA效率管理
     * @return 是否修改成功
     */
    Boolean updateByBo(OaTaskScoreBo bo);

    /**
     * 校验并批量删除OA效率管理信息
     *
     * @param ids     待删除的主键集合
     * @param isValid 是否进行有效性校验
     * @return 是否删除成功
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
