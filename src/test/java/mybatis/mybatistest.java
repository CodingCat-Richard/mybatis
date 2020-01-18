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
		//1.加载配置文件
		InputStream in = Resources.getResourceAsStream("SqlMapConfig.xml");
		//2.创建SqlSessionFactory
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(in);
		//3.使用工厂创建SqlSession对象
		SqlSession session = factory.openSession();
		//4.使用SqlSession创建接口dao的代理对象
		IDao dao = session.getMapper(IDao.class);
		//5.使用代理对象实现方法
		List<User> users = dao.findAll();
		
		for(User user :users) {
			System.out.println(user);
		}
		
	}
	public mybatistest() {
		
	}

}
