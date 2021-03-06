package com.lxiaocode.boardgame.product.domain;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.lxiaocode.boardgame.product.domain.vo.ParameterVO;
import com.lxiaocode.boardgame.product.domain.vo.StockpileVO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author lixiaofeng
 * @date 2020/11/23 下午3:58
 * @blog http://www.lxiaocode.com/
 */
public interface StockpileMapper extends BaseMapper<Stockpile> {
    IPage<StockpileVO> pageStockpileVO(IPage<StockpileVO> page);
    StockpileVO getStockpileVO(String id);
}
