package com.zy.mapper;

import com.zy.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {
    User isExistUser(String userEmail, String userPassword);
}
