package com.my.repository;

import com.my.DTO.QueryTableDto;
import com.my.model.Game;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @author yufan_cai
 * @date 2025/4/8 15:59
 */
public interface GameRepository extends JpaRepository<Game, Long> {

    @Query("select NEW com.my.DTO.QueryTableDto(g.id,g.gameTime,g.host,g.visit,g.px1,g.px2,g.win1,g.flat1,g.lose1,r.gameId,r.startRate3,r.startRate1,r.startRate0,r.nearRate3,r.nearRate1,r.startRate0,r.startWin2,r.startFlat2,r.startLose2,r.sum,r.nearWin2,r.nearFlat2,r.nearLose2,r.nearSum,r.gameId)" +
            " from Game g inner join Rate r on g.id = r.gameId")
    List<QueryTableDto> queryTableDto();
}
