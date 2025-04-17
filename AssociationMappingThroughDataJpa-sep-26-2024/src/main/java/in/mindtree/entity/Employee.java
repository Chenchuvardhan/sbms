package in.mindtree.entity;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="EmployeeRecords")
@Component
public class Employee {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
@JoinColumn(name="employeeId")
private Integer empId;
private String  employeeName;
private String mobileNumber;
@OneToMany(mappedBy="employee",cascade = CascadeType.ALL,fetch=FetchType.LAZY)
private List<Address> employeeAdress;
public void setEmployeeAdress(List<Address> employeeAdress) {
	this.employeeAdress = employeeAdress;
}
public Integer getEmpId() {
	return empId;
}
public void setEmpId(Integer empId) {
	this.empId = empId;
}
public String getEmployeeName() {
	return employeeName;
}
public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
}
public String getMobileNumber() {
	return mobileNumber;
}
public void setMobileNumber(String mobileNumber) {
	this.mobileNumber = mobileNumber;
}
@Override
public String toString() {
	return "Employee [empId=" + empId + ", employeeName=" + employeeName + ", employeeAdress=" + employeeAdress
			+ ", mobileNumber=" + mobileNumber + "]";
}
public Employee() {}
public Employee(Integer empId, String employeeName, List<Address> employeeAdress, String mobileNumber) {
	super();
	this.empId = empId;
	this.employeeName = employeeName;
	this.employeeAdress = employeeAdress;
	this.mobileNumber = mobileNumber;
}
}
