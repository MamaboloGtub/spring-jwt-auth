package mamaboloGtub.springframework.springjwtauth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.test.context.TestConfiguration;

@TestConfiguration(proxyBeanMethods = false)
public class TestSpringJwtAuthApplication {

	public static void main(String[] args) {
		SpringApplication.from(SpringJwtAuthApplication::main).with(TestSpringJwtAuthApplication.class).run(args);
	}

}
