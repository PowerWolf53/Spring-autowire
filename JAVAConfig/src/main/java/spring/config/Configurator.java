package spring.config;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

import spring.bean.User;

@Configuration
public class Configurator {

	@Bean(name="User")
	@Scope(value=ConfigurableBeanFactory.SCOPE_PROTOTYPE)
	public User user() {
		return new User("David");
	}
}
