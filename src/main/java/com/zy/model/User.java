package com.zy.model;

import jdk.nashorn.internal.objects.annotations.Constructor;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Component;

/**
 * @ClassName User
 * @Description TODO
 * @Author ZY
 * @Date2020/10/26 15:31
 * @Version 1.0
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
@Component
public class User {
    String userEmail;
    String userPassword;
}
