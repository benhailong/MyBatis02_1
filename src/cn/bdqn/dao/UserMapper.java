package cn.bdqn.dao;

import java.util.List;

import cn.bdqn.pojo.User;
import cn.bdqn.pojo.Role;
public interface UserMapper {
	public int count();
	public void add(User user);
	public void update(User user);
	public void delete(User user);
	public List<User> getUserList();
	public List<User> getUserListByRoleId(Role role);
}
