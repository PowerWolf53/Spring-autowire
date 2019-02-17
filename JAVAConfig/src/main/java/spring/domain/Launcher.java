package spring.domain;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import spring.bean.User;

public class Launcher {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
		User user =  ctx.getBean(User.class);
		System.out.println(user.getName());
		ctx.close();

	}

}
