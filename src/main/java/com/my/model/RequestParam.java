package com.my.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class RequestParam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String param1;
    private Integer param2;

    // 必须有无参构造函数
    public RequestParam() {}

    // Getter和Setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getParam1() { return param1; }
    public void setParam1(String param1) { this.param1 = param1; }
    public Integer getParam2() { return param2; }
    public void setParam2(Integer param2) { this.param2 = param2; }
}
