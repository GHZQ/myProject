package com.my.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.my.entity.User;

@Mapper
public interface UserMapper {

	@Insert("insert into user (name,age,`password`,email) values(#{name},#{age},#{pwd},#{email})")
	int save(@Param("name") String name, @Param("age") Integer age, @Param("pwd") String password,
			@Param("email") String email);
	
	@Select("select * from user")
	List<User> selectAll();
}
