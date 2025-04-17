package in.vodafone.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
@Component
@Entity
@Table(name="StudentTable")
public class Student {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer studentId;
private String studentName;
private String studentMobileNumber;
@OneToOne(cascade = CascadeType.ALL, mappedBy="student")
@JoinColumn(name="hallTicketNumber")
private HallTicket hallTicket;
public HallTicket getHallTicket() {
	return hallTicket;
}
public void setHallTicket(HallTicket hallTicket) {
	this.hallTicket = hallTicket;
}
public Integer getStudentId() {
	return studentId;
}
public void setStudentId(Integer studentId) {
	this.studentId = studentId;
}
public void setStudentName(String studentName) {
	this.studentName = studentName;
}
public String getStudentName() {
	return studentName;
}
public String getStudentMobileNumber() {
	return studentMobileNumber;
}
public void setStudentMobileNumber(String studentMobileNumber) {
	this.studentMobileNumber = studentMobileNumber;
}

}
