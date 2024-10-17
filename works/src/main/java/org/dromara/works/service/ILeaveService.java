package org.dromara.works.service;

import org.dromara.works.domain.vo.LeaveVo;
import org.dromara.works.domain.bo.LeaveBo;
import org.dromara.common.mybatis.core.page.TableDataInfo;
import org.dromara.common.mybatis.core.page.PageQuery;

import java.util.Collection;
import java.util.List;

/**
 * 请假申请Service接口
 *
 * @author sumrian
 * @date 2024-10-15
 */
public interface ILeaveService {

    /**
     * 查询请假申请
     *
     * @param id 主键
     * @return 请假申请
     */
    LeaveVo queryById(Long id);

    /**
     * 分页查询请假申请列表
     *
     * @param bo        查询条件
     * @param pageQuery 分页参数
     * @return 请假申请分页列表
     */
    TableDataInfo<LeaveVo> queryPageList(LeaveBo bo, PageQuery pageQuery);

    /**
     * 查询符合条件的请假申请列表
     *
     * @param bo 查询条件
     * @return 请假申请列表
     */
    List<LeaveVo> queryList(LeaveBo bo);

    /**
     * 新增请假申请
     *
     * @param bo 请假申请
     * @return 是否新增成功
     */
    Boolean insertByBo(LeaveBo bo);

    /**
     * 修改请假申请
     *
     * @param bo 请假申请
     * @return 是否修改成功
     */
    Boolean updateByBo(LeaveBo bo);

    /**
     * 校验并批量删除请假申请信息
     *
     * @param ids     待删除的主键集合
     * @param isValid 是否进行有效性校验
     * @return 是否删除成功
     */
    Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid);
}
