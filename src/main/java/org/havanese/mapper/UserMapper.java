package org.havanese.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.havanese.pojo.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/12/8 0008.
 *
 */
@Mapper

public interface UserMapper {
    @Select("select * from user where name=#{name}")
    User findUserById(@Param("name") String name);

    @Insert("insert into user (name,age) values(#{name},#{age})")
    boolean insertUsers(@Param("name") String name,@Param("ageg") int age);

}
