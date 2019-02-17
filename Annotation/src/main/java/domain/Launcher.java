package domain;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Example;

public class Launcher {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx= new ClassPathXmlApplicationContext("spring.xml");
		Example ex=  ctx.getBean(Example.class);
		System.out.println(ex.getInjected().getId());
		ctx.close();

	}

}
