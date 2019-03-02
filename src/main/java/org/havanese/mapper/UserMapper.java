package org.havanese.mapper;

import org.apache.ibatis.annotations.*;
import org.havanese.pojo.User;

/**
 * Created by Administrator on 2018/12/8 0008.
 *
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where name=#{name}")
    User findUserById(@Param("name") String name);


    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into t_user_msg (email,nick,password,register_date) VALUES(#{email},#{nick},#{password},#{registerDate})")
    boolean insertUser(User user);

}

