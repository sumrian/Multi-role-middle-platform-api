package org.dromara.works.service.impl;

import org.dromara.common.core.utils.MapstructUtils;
import org.dromara.common.core.utils.StringUtils;
import org.dromara.common.mybatis.core.page.TableDataInfo;
import org.dromara.common.mybatis.core.page.PageQuery;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.dromara.works.domain.bo.LeaveBo;
import org.dromara.works.domain.vo.LeaveVo;
import org.dromara.works.domain.Leave;
import org.dromara.works.mapper.LeaveMapper;
import org.dromara.works.service.ILeaveService;

import java.util.List;
import java.util.Map;
import java.util.Collection;

/**
 * 请假申请Service业务层处理
 *
 * @author sumrian
 * @date 2024-10-15
 */
@RequiredArgsConstructor
@Service
public class LeaveServiceImpl implements ILeaveService {

    private final LeaveMapper baseMapper;

    /**
     * 查询请假申请
     *
     * @param id 主键
     * @return 请假申请
     */
    @Override
    public LeaveVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 分页查询请假申请列表
     *
     * @param bo        查询条件
     * @param pageQuery 分页参数
     * @return 请假申请分页列表
     */
    @Override
    public TableDataInfo<LeaveVo> queryPageList(LeaveBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<Leave> lqw = buildQueryWrapper(bo);
        Page<LeaveVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询符合条件的请假申请列表
     *
     * @param bo 查询条件
     * @return 请假申请列表
     */
    @Override
    public List<LeaveVo> queryList(LeaveBo bo) {
        LambdaQueryWrapper<Leave> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<Leave> buildQueryWrapper(LeaveBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<Leave> lqw = Wrappers.lambdaQuery();
        lqw.eq(StringUtils.isNotBlank(bo.getLeaveType()), Leave::getLeaveType, bo.getLeaveType());
        lqw.eq(bo.getStartDate() != null, Leave::getStartDate, bo.getStartDate());
        lqw.eq(bo.getEndDate() != null, Leave::getEndDate, bo.getEndDate());
        lqw.eq(bo.getLeaveDays() != null, Leave::getLeaveDays, bo.getLeaveDays());
        lqw.eq(StringUtils.isNotBlank(bo.getStatus()), Leave::getStatus, bo.getStatus());
        return lqw;
    }

    /**
     * 新增请假申请
     *
     * @param bo 请假申请
     * @return 是否新增成功
     */
    @Override
    public Boolean insertByBo(LeaveBo bo) {
        Leave add = MapstructUtils.convert(bo, Leave.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改请假申请
     *
     * @param bo 请假申请
     * @return 是否修改成功
     */
    @Override
    public Boolean updateByBo(LeaveBo bo) {
        Leave update = MapstructUtils.convert(bo, Leave.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(Leave entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 校验并批量删除请假申请信息
     *
     * @param ids     待删除的主键集合
     * @param isValid 是否进行有效性校验
     * @return 是否删除成功
     */
    @Override
    public Boolean deleteWithValidByIds(Collection<Long> ids, Boolean isValid) {
        if(isValid){
            //TODO 做一些业务上的校验,判断是否需要校验
        }
        return baseMapper.deleteByIds(ids) > 0;
    }
}
