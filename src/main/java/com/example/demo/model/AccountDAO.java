package com.example.demo.model;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.example.demo.vo.AccountVO;

@Mapper
public interface AccountDAO {
	
	@Insert("insert into account(userid,userpw,name,email,phone,brith,nick) values(#{userid},#{userpw},#{name},#{email},#{phone},#{brith},#{nick});")
	int insertAccount(AccountVO input);
	
	@Select("select * from account where userid = #{userid} and userpw = #{userpw}")
	AccountVO selectOne(AccountVO input);

}
