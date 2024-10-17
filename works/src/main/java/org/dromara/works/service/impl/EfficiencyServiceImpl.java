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
import org.dromara.works.domain.bo.EfficiencyBo;
import org.dromara.works.domain.vo.EfficiencyVo;
import org.dromara.works.domain.Efficiency;
import org.dromara.works.mapper.EfficiencyMapper;
import org.dromara.works.service.IEfficiencyService;

import java.util.List;
import java.util.Map;
import java.util.Collection;

/**
 * 测试单Service业务层处理
 *
 * @author sumrian
 * @date 2024-10-15
 */
@RequiredArgsConstructor
@Service
public class EfficiencyServiceImpl implements IEfficiencyService {

    private final EfficiencyMapper baseMapper;

    /**
     * 查询测试单
     *
     * @param id 主键
     * @return 测试单
     */
    @Override
    public EfficiencyVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 分页查询测试单列表
     *
     * @param bo        查询条件
     * @param pageQuery 分页参数
     * @return 测试单分页列表
     */
    @Override
    public TableDataInfo<EfficiencyVo> queryPageList(EfficiencyBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<Efficiency> lqw = buildQueryWrapper(bo);
        Page<EfficiencyVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询符合条件的测试单列表
     *
     * @param bo 查询条件
     * @return 测试单列表
     */
    @Override
    public List<EfficiencyVo> queryList(EfficiencyBo bo) {
        LambdaQueryWrapper<Efficiency> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<Efficiency> buildQueryWrapper(EfficiencyBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<Efficiency> lqw = Wrappers.lambdaQuery();
        lqw.eq(bo.getDeptId() != null, Efficiency::getDeptId, bo.getDeptId());
        lqw.eq(bo.getUserId() != null, Efficiency::getUserId, bo.getUserId());
        lqw.eq(bo.getOrderNum() != null, Efficiency::getOrderNum, bo.getOrderNum());
        lqw.eq(StringUtils.isNotBlank(bo.getTestKey()), Efficiency::getTestKey, bo.getTestKey());
        lqw.eq(StringUtils.isNotBlank(bo.getValue()), Efficiency::getValue, bo.getValue());
        return lqw;
    }

    /**
     * 新增测试单
     *
     * @param bo 测试单
     * @return 是否新增成功
     */
    @Override
    public Boolean insertByBo(EfficiencyBo bo) {
        Efficiency add = MapstructUtils.convert(bo, Efficiency.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改测试单
     *
     * @param bo 测试单
     * @return 是否修改成功
     */
    @Override
    public Boolean updateByBo(EfficiencyBo bo) {
        Efficiency update = MapstructUtils.convert(bo, Efficiency.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(Efficiency entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 校验并批量删除测试单信息
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
