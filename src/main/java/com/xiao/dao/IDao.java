package com.xiao.dao;

import java.util.List;

import com.xiao.domin.User;

public interface IDao {
	/**
 	 * 查找所有user
	 * @return
	 */
	List<User> findAll();
	
	/**
	 * 增加User
	 * @param user
	 */
	void saveUser(User user);

	/**
	 * 更新
	 * @param user
	 */
	void updateUser(User user);
	/**
	 * 模糊查找
	 * @param s
	 * @return
	 */
	List<User>  findUsers(String s);

	/**
	 * 通过id查找
	 * @param id
	 * @return
	 */
	List<User> findbyId(int id);
	/**
	 * 删除user
	 * @param user
	 */
	void deleteUser(User user);
}
