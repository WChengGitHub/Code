package helloWord;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
          HelloWord h=(HelloWord) ctx.getBean("helloWord");
          h.sayHello();
          Car car=(Car) ctx.getBean("car");
          System.out.println(car);
          Person person=(Person) ctx.getBean("person");
          System.out.println(person);
	}

}
