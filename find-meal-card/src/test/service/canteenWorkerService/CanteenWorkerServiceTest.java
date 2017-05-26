package service.canteenWorkerService;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.*;

/**
 * Created by user on 2017/5/23.
 */
public class CanteenWorkerServiceTest {

    private CanteenWorkerService canteenWorkerService;
    @Before
    public void setUp() throws Exception {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext-Dao.xml","spring/applicationContext-Service.xml","spring/applicationContext-transaction.xml"});
        canteenWorkerService= (CanteenWorkerService) applicationContext.getBean("canteenWorkerService");
    }


    @Test
    public void testSignUp() throws Exception {
        canteenWorkerService.signUp("111","222","3333");
    }

    @Test
    public void testSignIn() throws Exception {
        canteenWorkerService.signIn("111","222");
    }
}