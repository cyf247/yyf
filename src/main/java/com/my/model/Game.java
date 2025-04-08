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
 * @date 2025/4/8 15:49
 */
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Data
@Entity
public class Game {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String gameTime;
    private String host;
    private String visit;
    private String px1;
    private String px2;
    private String win1;
    private String flat1;
    private String lose1;

}
