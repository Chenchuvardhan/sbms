package in.vodafone.entity;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
@Component
@Entity
public class HallTicket {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long hallTicketNumber;
	@OneToOne(mappedBy="hallTicket",cascade = CascadeType.ALL)
	@JoinColumn(name="studentId")
	private Student student;
	public Long getHallTicketNumber() {
		return hallTicketNumber;
	}
	public Student getStudent() {
		return student;
	}
	public void setStudent(Student student) {
		this.student = student;
	}
}
