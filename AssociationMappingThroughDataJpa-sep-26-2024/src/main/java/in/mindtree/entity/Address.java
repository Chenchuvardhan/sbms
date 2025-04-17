package in.mindtree.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Component
@Entity
@Table(name="EmployeeAdress")
public class Address {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer addreesId;
@JoinColumn(name="eid")
@ManyToOne(cascade = CascadeType.ALL,fetch=FetchType.LAZY)
private Employee employee;
private String city;
public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public Integer getAddreesId() {
	return addreesId;
}

public void setAddreesId(Integer addreesId) {
	this.addreesId = addreesId;
}

public Employee getEmployee() {
	return employee;
}

public void setEmployee(Employee employee) {
	this.employee = employee;
}

@Override
public String toString() {
	return "Address [city=" + city + "]";
}
}
