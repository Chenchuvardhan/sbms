package in.nareshit.__springboot.dao;

import org.springframework.beans.factory.annotation.Autowired;

import in.nareshit.__springboot.users.Users;

public class DaoSecurity {
	private String algorithm;
	@Autowired
	private Users us;
   public DaoSecurity(String algorithm) {
	   System.out.println("it uses "+algorithm+" to provide security");
      this.algorithm=algorithm;
   }
public String getAlgorithm() {
	return algorithm;
}
public Users getUs() {
	return us;
}
   
}
