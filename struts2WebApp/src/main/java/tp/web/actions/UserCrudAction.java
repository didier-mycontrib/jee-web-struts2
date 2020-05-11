package tp.web.actions;

import tp.dao.simu.UserDaoStub;

public class UserCrudAction extends AbstractUserCrudAction {
	private static final long serialVersionUID = 1L;
	public UserCrudAction(){
		super();
		this.userDao =  UserDaoStub.getInstance();
		//singleton (dao stub without DB, memoryMap)
	}
}