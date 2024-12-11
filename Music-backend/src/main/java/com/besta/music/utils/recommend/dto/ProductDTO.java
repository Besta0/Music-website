package com.besta.music.utils.recommend.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 推荐业务对象
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ProductDTO {

    private Integer productId;

    private String productName;

    private String productPrice;

}
