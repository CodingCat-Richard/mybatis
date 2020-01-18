package com.xiao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.xiao.domin.User;

public interface IDao {
	/**
	 * 查找所有记录
	 * @return
	 */
	//@Select("select * from user")
	 List<User> findAll();
}