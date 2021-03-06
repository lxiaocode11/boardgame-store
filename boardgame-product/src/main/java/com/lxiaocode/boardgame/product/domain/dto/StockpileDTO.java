package com.lxiaocode.boardgame.product.domain.dto;

import lombok.Data;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

/**
 * @author lixiaofeng
 * @date 2020/11/23 下午4:22
 * @blog http://www.lxiaocode.com/
 */
@Data
public class StockpileDTO {

    @NotBlank
    private String productId;

    @Min(value = 0)
    private Integer amount;

    @Min(value = 0)
    private Integer frozen;
}
