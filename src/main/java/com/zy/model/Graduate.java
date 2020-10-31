package com.zy.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.springframework.stereotype.Component;

/**
 * @ClassName Graduate
 * @Description TODO
 * @Author ZY
 * @Date2020/8/31 21:07
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
@ToString
public class Graduate {
    /**
     * 对应Graduate
     */
    private String num;
    private String id;
    private String name;
    private int age;
    private String phone;
    private String academy;
    private String major;
}
