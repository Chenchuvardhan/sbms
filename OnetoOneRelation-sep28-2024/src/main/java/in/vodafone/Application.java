package in.vodafone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.vodafone.service.StudentService;



@SpringBootApplication
public class Application {
		public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		System.out.println("Hello EveryOne");
		StudentService bean = context.getBean(StudentService.class);
		bean.saveTheStudent();
		}

}
