package in.nareshit.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import in.nareshit.entity.Employee;
@Repository	
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
public List<Employee> findByAddress(String address);
public List<Employee> findBySalaryGreaterThanEqual(double salary);
public List<Employee> findByAddressAndSalaryGreaterThanEqual(String address,double salary);
@Query(value="select * from employee",nativeQuery = true)
public List<Employee> getAllEmployees();
@Query("from Employee")
public List<Employee> findAllEmployees();
@Query(value = "select * from employee where address=:address",nativeQuery = true)
public List<Employee> getByAddress(String address);
@Query(value="select * from employee where salary=:sal and address=:adress",nativeQuery = true)
public Employee getEmployeeBySalAndAddress(double sal,String adress);
@Query(value = "select * from employee where salary>=:sal",nativeQuery = true)
public List<Employee> getEmployeeGreaterThan(double sal);
@Query(value="select name,address from Employee")
public List<Object[]> getAllNamesAndAddresses();
}
