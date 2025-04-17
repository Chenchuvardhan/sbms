package in.mindtree;

import java.util.Arrays;
import java.util.Optional;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import in.mindtree.entity.Address;
import in.mindtree.entity.Employee;
import in.mindtree.repository.EmployeeRepository;

@SpringBootApplication
public class AssociationMappingThroughDataJpaSep262024Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext configurableApplicationContext = SpringApplication.run(AssociationMappingThroughDataJpaSep262024Application.class, args);
		Employee employee = configurableApplicationContext.getBean(Employee.class);
		Address address = configurableApplicationContext.getBean(Address.class);
		address.setCity("New Delhi");
		employee.setEmployeeAdress(Arrays.asList(address));
		employee.setEmployeeName("Mahidhar");
		employee.setMobileNumber("9099666508");
		Address address1 =new Address();
		address1.setCity("Chennai");
		employee.setEmployeeAdress(Arrays.asList(address1));
		address.setEmployee(employee);
		address1.setEmployee(employee);
		EmployeeRepository employeeRepository = configurableApplicationContext.getBean(EmployeeRepository.class);
		
		employee.setEmployeeAdress(Arrays.asList(address,address1));
		employeeRepository.save(employee);
	}
}
