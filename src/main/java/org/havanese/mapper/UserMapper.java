package org.havanese.mapper;

import org.apache.ibatis.annotations.*;
import org.havanese.pojo.User;

/**
 * Created by Administrator on 2018/12/8 0008.
 *
 */
@Mapper
public interface UserMapper {
    @Select("select * from user where email=#{emailAddress}")
    User findUserById(@Param("emailAddress") String emailAddress);


    @Options(useGeneratedKeys = true,keyProperty = "id")
    @Insert("insert into t_user_msg (email,nick,password,register_date) VALUES(#{email},#{nick},#{password},#{registerDate})")
    boolean insertUser(User user);

    @Update("update t_user_msg set email_status=#{emailStatus}")
    boolean enableMailStatus(@Param("emailStatus") int emailStatus);


    @Select("select email_status where email=#{emailAddress}")
    int getMailStatus(@Param("emailAddress") String email);

}


