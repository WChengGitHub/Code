package service.studentService;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.canteenWorkerService.CanteenWorkerService;

import static org.junit.Assert.*;

/**
 * Created by user on 2017/5/24.
 */
public class StudentServiceTest {

    private StudentService studentService;
    @Before
    public void setUp() throws Exception {
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(new String[]{"spring/applicationContext-Dao.xml","spring/applicationContext-Service.xml","spring/applicationContext-transaction.xml"});
        studentService= (StudentService) applicationContext.getBean("studentService");
    }

    @Test
    public void testGetAddress() throws Exception {
        String address=studentService.getAddress("1514080902123");
    }
}