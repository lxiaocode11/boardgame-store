package com.lxiaocode.boardgame.product.domain.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;

/**
 * @author lixiaofeng
 * @date 2020/12/1 上午9:26
 * @blog http://www.lxiaocode.com/
 */
@Data
public class MechanicsDTO {

    @NotBlank
    private String productId;

    @NotEmpty
    private String[] mechanics;
}
