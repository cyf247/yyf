package com.my.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author yufan_cai
 * @date 2025/4/8 15:51
 */
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
public class Rate {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

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
