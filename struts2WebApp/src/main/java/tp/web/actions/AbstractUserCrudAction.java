package tp.web.actions;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;

import tp.dao.UserDao;
import tp.web.data.User;

public abstract class AbstractUserCrudAction extends ActionSupport implements ModelDriven<User>{
	private static final long serialVersionUID = 1L;

	protected UserDao userDao = null; //sera initialisé dans sous classe concrete 
	                                  //avec singleton ou Spring ou ...
	
	private List<User> userList = new ArrayList<User>();
	private User user = new User();//model bean instance (for input)
	
	public String refreshList()
	{
		userList = userDao.allUser();
		return SUCCESS;
	}
	
	public String saveOrUpdate(){
		userDao.saveOrUpdateUser(user);
		return SUCCESS;
	}
	
	public String delete(){		
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get( ServletActionContext.HTTP_REQUEST);
		userDao.removeUser(Long.parseLong( request.getParameter("id")));
		return SUCCESS;
	}
	
	public String selectToEdit(){
		HttpServletRequest request = (HttpServletRequest) ActionContext.getContext().get( ServletActionContext.HTTP_REQUEST);
		user = userDao.userById(Long.parseLong( request.getParameter("id")));
		return SUCCESS;
	}
	

	@Override
	public User getModel() {
		return user;
	}

	public List<User> getUserList() {
		return userList;
	}

	public void setUserList(List<User> userList) {
		this.userList = userList;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}


}
