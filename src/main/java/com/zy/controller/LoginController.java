package com.zy.controller;

import com.zy.mapper.UserMapper;
import com.zy.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ClassName LoginController
 * @Description TODO
 * @Author ZY
 * @Date2020/9/1 9:02
 * @Version 1.0
 **/
@Controller
public class LoginController {
    @Autowired
    UserMapper userMapper;

    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(@RequestParam(value = "emailAddr") String email, @RequestParam(value = "password") String password, HttpServletResponse response) throws IOException {
        try{
            User user = userMapper.isExistUser(email, password);
        }catch (NullPointerException e){
        }finally {
            System.out.println("email=" + email + "\npassword=" + password);
            return "redirect:funcpages/main.html";
        }

        // System.out.println(user.getUserEmail()+" hh "+user.getUserPassword());
        // if (user.getUserEmail().equals(email) && user.getUserPassword().equals(password)) {
        //     return "redirect:funcpages/graduate.html";
        // } else if (!user.getUserEmail().equals(email) || !user.getUserPassword().equals(password)){
        //     response.sendError(666,"User email or user password is wrong!");
        //     return "index.html";
        // }

    }
}
