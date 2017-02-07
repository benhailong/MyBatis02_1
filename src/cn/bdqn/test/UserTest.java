package cn.bdqn.test;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.apache.log4j.Logger;
import org.junit.Test;


import cn.bdqn.test.UserTest;
import cn.bdqn.dao.UserMapper;
import cn.bdqn.pojo.Role;
import cn.bdqn.pojo.User;
import cn.bdqn.util.MyBatisUtil;

public class UserTest {
	private static Logger logger=Logger.getLogger(UserTest.class);
	@Test
	public void getUserListByRoleId(){
		SqlSession sqlSession = null;
		List<User> userList = new ArrayList<User>();
		Role role = new Role();
		role.setId(2);
		try{
			sqlSession = MyBatisUtil.createSqlSession();
			userList = sqlSession.getMapper(UserMapper.class).getUserListByRoleId(role);
		} catch (Exception e) {
			//
		}finally{
			MyBatisUtil.closeSqlSession(sqlSession);
		}
		
		logger.debug("getUserListByRoleIdTest count ----> "+userList.size());
		for(User user:userList){
			logger.debug("*****" + user.getUsername()+","+user.getRoleName()+","+user.getRoleId());
		}
	}
	
}
