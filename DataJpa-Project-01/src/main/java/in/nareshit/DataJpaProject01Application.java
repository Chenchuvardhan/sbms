package in.nareshit;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

import in.nareshit.entity.Employee;
import in.nareshit.repo.EmployeeRepo;

@SpringBootApplication
public class DataJpaProject01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(DataJpaProject01Application.class, args);
		EmployeeRepo bean = run.getBean(EmployeeRepo.class);
		System.out.println(bean.getClass().getName());
		Employee e1= new Employee(101,"Sashi",23000.00,"Banglore");
		Employee e2=new Employee(102,"Raja",34000.00,"Hyderabad");
		Employee e3=new Employee(103,"Roja",45000.00,"Banglore");
		Employee e4=new Employee(104,"Mani",25000.00,"Hyderabad");
		List<Employee> of = List.of(e1,e2,e3,e4);
		//bean.saveAll(of);
		//List<Employee> list = bean.findByAddress("Banglore");
	    //List<Employee> list1 = bean.findBySalaryGreaterThanEqual(10000);
	    //list1.forEach(System.out::println);
	    //bean.findByAddressAndSalaryGreaterThanEqual("Hyderabad", 20000)
	    //.forEach(System.out::println);
	    //bean.getAllEmployees().forEach(System.out::println);
	    //bean.findAllEmployees().forEach(System.out::println);
		//bean.getByAddress("Banglore").forEach(System.out::println);
		//bean.getByAddress("Hyderabad").forEach(System.out::println);
		//System.out.println(bean.getEmployeeBySalAndAddress(25000,"Hyderabad"));
		//bean.getEmployeeGreaterThan(30000).forEach(System.out::println);
		bean.getAllNamesAndAddresses().forEach(i->System.out.println(i[0]+" "+i[1]));
		Page<Employee> all = bean.findAll(PageRequest.of(0, 2));
		all.forEach(System.out::println);
		run.close();
	}

}
