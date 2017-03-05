package service.testService;

import model.UserModel;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by user on 2017/3/5.
 */
public class UserServiceImpTest {

    private ApplicationContext applicationContext;
    @Before
    public void setUp() throws Exception {
       applicationContext=new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext-Dao.xml","spring/applicationContext-Service.xml","spring/applicationContext-transaction.xml"});
    }

    @Test
    public void testInsertUser() throws Exception {
        UserService userService= (UserService) applicationContext.getBean("userService");
        UserModel userModel =new UserModel();
        userModel.setPassword("111244444444222222");
        userModel.setName("1111111111111111111");
        userService.insertUser(userModel);
    }

}