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
import org.dromara.works.domain.bo.OaTaskScoreBo;
import org.dromara.works.domain.vo.OaTaskScoreVo;
import org.dromara.works.domain.OaTaskScore;
import org.dromara.works.mapper.OaTaskScoreMapper;
import org.dromara.works.service.IOaTaskScoreService;

import java.util.List;
import java.util.Map;
import java.util.Collection;

/**
 * OA效率管理Service业务层处理
 *
 * @author sumrian
 * @date 2024-10-15
 */
@RequiredArgsConstructor
@Service
public class OaTaskScoreServiceImpl implements IOaTaskScoreService {

    private final OaTaskScoreMapper baseMapper;

    /**
     * 查询OA效率管理
     *
     * @param id 主键
     * @return OA效率管理
     */
    @Override
    public OaTaskScoreVo queryById(Long id){
        return baseMapper.selectVoById(id);
    }

    /**
     * 分页查询OA效率管理列表
     *
     * @param bo        查询条件
     * @param pageQuery 分页参数
     * @return OA效率管理分页列表
     */
    @Override
    public TableDataInfo<OaTaskScoreVo> queryPageList(OaTaskScoreBo bo, PageQuery pageQuery) {
        LambdaQueryWrapper<OaTaskScore> lqw = buildQueryWrapper(bo);
        Page<OaTaskScoreVo> result = baseMapper.selectVoPage(pageQuery.build(), lqw);
        return TableDataInfo.build(result);
    }

    /**
     * 查询符合条件的OA效率管理列表
     *
     * @param bo 查询条件
     * @return OA效率管理列表
     */
    @Override
    public List<OaTaskScoreVo> queryList(OaTaskScoreBo bo) {
        LambdaQueryWrapper<OaTaskScore> lqw = buildQueryWrapper(bo);
        return baseMapper.selectVoList(lqw);
    }

    private LambdaQueryWrapper<OaTaskScore> buildQueryWrapper(OaTaskScoreBo bo) {
        Map<String, Object> params = bo.getParams();
        LambdaQueryWrapper<OaTaskScore> lqw = Wrappers.lambdaQuery();
        lqw.eq(bo.getDeptId() != null, OaTaskScore::getDeptId, bo.getDeptId());
        lqw.eq(bo.getUserId() != null, OaTaskScore::getUserId, bo.getUserId());
        lqw.eq(bo.getOrderNum() != null, OaTaskScore::getOrderNum, bo.getOrderNum());
        lqw.eq(StringUtils.isNotBlank(bo.getTestKey()), OaTaskScore::getTestKey, bo.getTestKey());
        lqw.eq(StringUtils.isNotBlank(bo.getValue()), OaTaskScore::getValue, bo.getValue());
        lqw.eq(StringUtils.isNotBlank(bo.getEXECUTOR()), OaTaskScore::getEXECUTOR, bo.getEXECUTOR());
        lqw.eq(StringUtils.isNotBlank(bo.getREVIEWER()), OaTaskScore::getREVIEWER, bo.getREVIEWER());
        lqw.eq(StringUtils.isNotBlank(bo.getASSISTANT()), OaTaskScore::getASSISTANT, bo.getASSISTANT());
        lqw.eq(StringUtils.isNotBlank(bo.getTITLE()), OaTaskScore::getTITLE, bo.getTITLE());
        lqw.eq(StringUtils.isNotBlank(bo.getTYPE()), OaTaskScore::getType, bo.getTYPE());
        lqw.eq(StringUtils.isNotBlank(bo.getSCORE()), OaTaskScore::getSCORE, bo.getSCORE());
        lqw.eq(StringUtils.isNotBlank(bo.getUserScore()), OaTaskScore::getUserScore, bo.getUserScore());
        lqw.eq(StringUtils.isNotBlank(bo.getDESCRIPTION()), OaTaskScore::getDESCRIPTION, bo.getDESCRIPTION());
        lqw.eq(bo.getStartTime() != null, OaTaskScore::getStartTime, bo.getStartTime());
        lqw.eq(bo.getFollowUpTime() != null, OaTaskScore::getFollowUpTime, bo.getFollowUpTime());
        lqw.eq(bo.getCompletionTime() != null, OaTaskScore::getCompletionTime, bo.getCompletionTime());
        lqw.eq(StringUtils.isNotBlank(bo.getSTATUS()), OaTaskScore::getSTATUS, bo.getSTATUS());
        lqw.eq(bo.getTimeSpent() != null, OaTaskScore::getTimeSpent, bo.getTimeSpent());
        lqw.eq(StringUtils.isNotBlank(bo.getExtJson()), OaTaskScore::getExtJson, bo.getExtJson());
        return lqw;
    }

    /**
     * 新增OA效率管理
     *
     * @param bo OA效率管理
     * @return 是否新增成功
     */
    @Override
    public Boolean insertByBo(OaTaskScoreBo bo) {
        OaTaskScore add = MapstructUtils.convert(bo, OaTaskScore.class);
        validEntityBeforeSave(add);
        boolean flag = baseMapper.insert(add) > 0;
        if (flag) {
            bo.setId(add.getId());
        }
        return flag;
    }

    /**
     * 修改OA效率管理
     *
     * @param bo OA效率管理
     * @return 是否修改成功
     */
    @Override
    public Boolean updateByBo(OaTaskScoreBo bo) {
        OaTaskScore update = MapstructUtils.convert(bo, OaTaskScore.class);
        validEntityBeforeSave(update);
        return baseMapper.updateById(update) > 0;
    }

    /**
     * 保存前的数据校验
     */
    private void validEntityBeforeSave(OaTaskScore entity){
        //TODO 做一些数据校验,如唯一约束
    }

    /**
     * 校验并批量删除OA效率管理信息
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
