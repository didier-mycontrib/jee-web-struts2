package tp.dao.spring;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Repository;

import tp.dao.UserDao;
import tp.web.data.User;

//version Spring du dao (sans singleton) et avec @Repository ou ...

@Repository //ou @Component (spring)
@Scope("singleton")
public class UserDaoSpring implements UserDao{
	
	
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
	
	@PostConstruct
	public void afterSpringInit(){
		System.out.println("UserDaoSpring.afterSpringInit() / " + this.toString());
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
