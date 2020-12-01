package io.koschicken.springmybatisdemo.domain;

import lombok.Data;

import java.math.BigDecimal;

@Data
public class Student {
    private Integer id;
    private String sName;
    private BigDecimal mark;
    private String sex;
}
