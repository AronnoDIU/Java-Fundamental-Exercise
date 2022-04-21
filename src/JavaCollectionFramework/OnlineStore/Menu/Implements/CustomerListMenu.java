package JavaCollectionFramework.OnlineStore.Menu.Implements;

import java.util.List;

import JavaCollectionFramework.OnlineStore.Configs.ApplicationContext;
import JavaCollectionFramework.OnlineStore.Enteties.User;
import JavaCollectionFramework.OnlineStore.Menu.Menu;
import JavaCollectionFramework.OnlineStore.Services.UserManagementService;
import JavaCollectionFramework.OnlineStore.Services.Implements.DefaultUserManagementService;

public class CustomerListMenu implements Menu {

	private ApplicationContext context;
	private UserManagementService userManagementService;
	
	{
		userManagementService = DefaultUserManagementService.getInstance();
		context = ApplicationContext.getInstance();
	}
	
	@Override
	public void start() {
		printMenuHeader();
		List<User> users = userManagementService.getUsers();
		
		if (users == null || users.size() == 0) {
			System.out.println("Unfortunately, there are no customers.");
		} else {
			for (User user : users) {
				System.out.println(user);
			}
		}
		context.getMainMenu().start();
	}

	@Override
	public void printMenuHeader() {
		System.out.println("***** USERS *****");		
	}

}