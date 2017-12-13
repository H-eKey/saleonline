package com.schekey.saleonline.mapper;

import com.schekey.saleonline.entity.User;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

@Repository("userMapper")
@org.apache.ibatis.annotations.Mapper
public interface UserMapper extends Mapper<User> {
}