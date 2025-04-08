package com.my.DTO;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author yufan_cai
 * @date 2025/4/8 16:58
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class QueryTableDto {
    private Long id;
    private String gameTime;
    private String host;
    private String visit;
    private String px1;
    private String px2;
    private String win1;
    private String flat1;
    private String lose1;
    private String startRate3;
    private String startRate1;
    private String startRate0;
    private String nearRate3;
    private String nearRate1;
    private String nearRate0;
    private String startWin2;
    private String startFlat2;
    private String startLose2;
    private String sum;
    private String nearWin2;
    private String nearFlat2;
    private String nearLose2;
    private String nearSum;
    private Long gameId;


}
