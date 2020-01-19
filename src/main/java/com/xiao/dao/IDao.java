package com.xiao.dao;

import java.util.List;

import com.xiao.domin.User;

public interface IDao {
	/**
 	 * ��������user
	 * @return
	 */
	List<User> findAll();
	
	/**
	 * ����User
	 * @param user
	 */
	void saveUser(User user);

	/**
	 * ����
	 * @param user
	 */
	void updateUser(User user);
	/**
	 * ģ������
	 * @param s
	 * @return
	 */
	List<User>  findUsers(String s);

	/**
	 * ͨ��id����
	 * @param id
	 * @return
	 */
	List<User> findbyId(int id);
	/**
	 * ɾ��user
	 * @param user
	 */
	void deleteUser(User user);
}
