package mybatis;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.xiao.dao.IDao;
import com.xiao.domin.User;

public class mybatistest {
	public static void main(String[] args) throws IOException {
		//1.���������ļ�
		InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
		//2.����SqlSessionFactory
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(in);
		//3.ʹ�ù�������SqlSession����
		SqlSession session = factory.openSession();
		//4.ʹ��SqlSession�����ӿ�dao�Ĵ������
		IDao dao = session.getMapper(IDao.class);
		//5.ʹ�ô������ʵ�ַ���
		List<User> users = dao.findAll();
		
		for(User user :users) {
			System.out.println(user);
		}
		
	}
	public mybatistest() {
		
	}

}
