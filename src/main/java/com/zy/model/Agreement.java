package com.zy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Component;

/**
 * @ClassName Agreement
 * @Description TODO
 * @Author ZY
 * @Date2020/8/31 21:08
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@ToString
public class Agreement {
    /**
     * 对应Agreement表
     */
    private String id;
    private String signDate;
    private String graduateId;
    private String companyId;
    private int salary;
}
