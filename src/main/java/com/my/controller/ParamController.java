package com.my.controller;

import com.my.DTO.QueryTableDto;
import com.my.DTO.SaveDto;
import com.my.model.Game;
import com.my.model.Rate;
import com.my.model.RequestParam;
import com.my.repository.GameRepository;
import com.my.repository.ParamRepository;
import com.my.repository.RateRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;
import com.alibaba.fastjson.JSON;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class ParamController {
    @Resource
    private ParamRepository paramRepository;
    @Resource
    private GameRepository gameRepository;
    @Resource
    private RateRepository rateRepository;

    // 保存参数的POST接口
    @PostMapping("/save")
    public String saveParam(@RequestBody SaveDto saveDto) {
        log.info("game:{},rate:{}", JSON.toJSONString(saveDto.getGame()), JSON.toJSONString(saveDto.getRate()));
        Game save = gameRepository.save(saveDto.getGame());
        Rate rate = saveDto.getRate();
        rate.setGameId(save.getId());
        Rate save1 = rateRepository.save(rate);
        return "Ok";
    }

    @GetMapping("/query")
    public List<QueryTableDto> queryParam() {
        return gameRepository.queryTableDto();
    }

}