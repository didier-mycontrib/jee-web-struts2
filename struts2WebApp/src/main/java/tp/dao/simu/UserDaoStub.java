package tp.dao.simu;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import tp.dao.UserDao;
import tp.web.data.User;

public class UserDaoStub implements UserDao{
	
	private static UserDaoStub uniqueInstance =null;
	
	public static UserDaoStub getInstance(){
		if(uniqueInstance==null) {
			uniqueInstance=new UserDaoStub();
		}
		return uniqueInstance;
	}
	
	//ici simulation en memoire (sans Database) via map(idUser,user)
	private Map<Long,User> userMap = new HashMap<Long,User>();
	private Long lastId=0L; //for auto_incr

	@Override
	public void saveOrUpdateUser(User user) {
		if(user.getId()==null){
			user.setId(++lastId);
		}
		userMap.put(user.getId(), user);
	}

	@Override
	public void removeUser(Long userId) {
		   userMap.remove(userId);
	}

	@Override
	public List<User> allUser() {
		return new ArrayList<User>(userMap.values());
	}

	@Override
	public User userById(Long userId) {
		return userMap.get(userId);
	}
	
	
}
