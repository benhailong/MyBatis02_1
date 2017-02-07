package cn.bdqn.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MyBatisUtil {
	private static SqlSessionFactory factory;
	/** һ������£������Щ�����������Ŀ������ʱ���ִ�е�ʱ����Ҫʹ�þ�̬�����
	 * ���ִ���������ִ�еģ���Ҫ����Ŀ������ʱ��ͳ�ʼ�����ٲ���������������
	 * �������������õ�ʱ����Ҫʹ�þ�̬���������ִ����Ǳ���ִ�е�
	 * ��̬����������ص�ʱ��ͽ��м���  �������������м���
	 * 
	 */
	static{
		System.out.println("static factory==========");
		try{
			InputStream is = Resources.getResourceAsStream("mybatis-config.xml");
			factory = new SqlSessionFactoryBuilder().build(is);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	public static SqlSession createSqlSession(){
		return factory.openSession();
	}
	public static void closeSqlSession(SqlSession sqlSession){
		if(null != sqlSession){
			sqlSession.close();
		}
	}
	
}
