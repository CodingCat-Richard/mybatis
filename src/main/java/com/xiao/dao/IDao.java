package com.xiao.dao;

import java.util.List;

import com.xiao.domin.User;

public interface IDao {
	/**
	 * �������м�¼
	 * @return
	 */
	 List<User> findAll();
}