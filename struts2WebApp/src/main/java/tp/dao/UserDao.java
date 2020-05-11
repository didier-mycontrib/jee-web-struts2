package tp.dao;

import java.util.List;

import tp.web.data.User;

public interface UserDao {
	
	public void saveOrUpdateUser(User user) ;
	public void removeUser(Long userId) ;
	public List<User> allUser() ;
	public User userById(Long userId) ;

}
