package com.my.DTO;

import com.my.model.Game;
import com.my.model.Rate;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @author yufan_cai
 * @date 2025/4/8 16:26
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class SaveDto implements Serializable {


    private static final long serialVersionUID = 6233045267854343636L;
    private Game game;
    private Rate rate;
}
