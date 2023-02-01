package springdemo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages ="springdemo")
public class SpringConf {

	@Bean(initMethod = "initMethod" , destroyMethod = "destroyMethod")
	public GetShape getShape() {
		return new GetShape();
	}
}
