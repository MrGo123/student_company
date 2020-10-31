package com.zy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @ClassName Company
 * @Description TODO
 * @Author ZY
 * @Date2020/8/31 21:07
 * @Version 1.0
 **/
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Company {
    /**
     * 对应Company表
     */
    private String id;
    private String name;
    private String phone;
    private String addr;
}
