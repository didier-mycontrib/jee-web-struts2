package tp.web.actions;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import tp.dao.UserDao;

@Component //spring --> bean d'action d'abord géré par Spring puis utilisé par struts2
//default id/name of this spring bean : springUserCrudAction
@Scope("prototype") //scope spring compatible avec logique / cycle de vie "struts2"
public class SpringUserCrudAction extends AbstractUserCrudAction {
	private static final long serialVersionUID = 1L;
	
	
	@Override
	public UserDao getUserDao() {
		return super.getUserDao();
	}


	@Autowired //ici ou bien directement sur private UserDao userDao si pas d'heritage
	@Override
	public void setUserDao(UserDao userDao) {
		super.setUserDao(userDao);
	}

	@PostConstruct
	public void afterSpringInit(){
		//System.out.println("SpringUserCrudAction.afterSpringInit() / " + this.toString());
		//System.out.println("with userDao =  " + userDao);
	}

	public SpringUserCrudAction(){
		super();		
	}
}