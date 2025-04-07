package com.my.controller;

import com.my.model.RequestParam;
import org.springframework.web.bind.annotation.*;
import com.alibaba.fastjson.JSON;
@RestController
@RequestMapping("/api")
public class ParamController {

    // 保存参数的POST接口
    @PostMapping("/save")
    public RequestParam saveParam(@RequestBody RequestParam requestParam) {
        System.out.println(JSON.toJSON(requestParam));
        return null;
    }


}