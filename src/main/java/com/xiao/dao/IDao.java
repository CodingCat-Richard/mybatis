package com.xiao.dao;

import java.util.List;

import org.apache.ibatis.annotations.Select;

import com.xiao.domin.User;

public interface IDao {
	/**
	 * �������м�¼
	 * @return
	 */
	//@Select("select * from user")
	 List<User> findAll();
}