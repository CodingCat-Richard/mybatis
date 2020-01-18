package com.xiao.dao;

import java.util.List;

import com.xiao.domin.User;

public interface IDao {
	/**
	 * 查找所有记录
	 * @return
	 */
	 List<User> findAll();
}