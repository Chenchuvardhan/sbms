package in.vodafone.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.vodafone.entity.HallTicket;
import in.vodafone.entity.Student;
import in.vodafone.repository.StudentRepository;

@Service
public class StudentService {
@Autowired
private StudentRepository studentRepository;
public void saveTheStudent() {
	HallTicket hallTicket=new HallTicket();
	Student student=new Student();
	student.setStudentName("Nagavardhan Gurram");
	student.setStudentMobileNumber("9878987867");
	hallTicket.setStudent(student);
	student.setHallTicket(hallTicket);
	studentRepository.save(student);
}
}
