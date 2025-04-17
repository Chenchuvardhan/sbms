package in.nareshit.__springboot.users;

import org.springframework.stereotype.Component;
@Component
public class Users {
public Users() {
 System.out.println("Users Object is created by spring boot ioc container started by run method preseneted in start class");
}
public void printUsers() {
	System.out.println("users printed...");
}
}
