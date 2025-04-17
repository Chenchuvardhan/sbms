package in.nareshit.__springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;
import in.nareshit.__springboot.dao.DaoSecurity;
import in.nareshit.__springboot.users.Users;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		DaoSecurity dao = context.getBean(DaoSecurity.class);
		Users us=dao.getUs();
		us.printUsers();
	}
	@Bean

	public DaoSecurity createDaoSecurity() {
		System.out.println("ioc called @ bean annotation cretaedaosecurity() method");
		DaoSecurity dao=new DaoSecurity("des");
		return dao;
	}

}
