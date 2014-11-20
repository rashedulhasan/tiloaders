package com.ti.tmg.tiloader;

import com.ti.tmg.tiloader.service.UserService;
import java.util.List;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.ti.tmg.tiloader.domain.User;
import com.ti.tmg.tiloader.service2.User2Service;

/**
 * Hello world!
 *
 */
public class App 
{
//    @Autowired
//    private UserService userService;
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        UserService userService = (UserService) context.getBean("userService");
        User2Service user2Service = (User2Service) context.getBean("user2Service");
        
        List<User> users = userService.getAllUsers();
        
        for(User user: users){
            System.out.println("user name-" + user.getFirstName() + user.getLastName());
                    
        }
        
        System.out.println("now inserting");
        user2Service.insertUser("abc", "xyz", "abcxyz", "abcpass");
    }

//    public UserService getUserService() {
//        return userService;
//    }
//
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }
    
}
