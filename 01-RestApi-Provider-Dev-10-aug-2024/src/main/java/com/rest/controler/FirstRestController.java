package com.rest.controler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import com.rest.dao.Mobile;

@org.springframework.web.bind.annotation.RestController
public class FirstRestController {
@GetMapping(value="/get",
		produces="application/xml")	
public ResponseEntity<Mobile> getRecords() {
	return  new ResponseEntity<Mobile>(new Mobile(7726,"Realme",9999.00,"yellow"),HttpStatus.OK);
	}
@PostMapping(
		value="/save")
public ResponseEntity<String> insertRecord(@RequestBody Mobile mob){
	System.out.println(mob);
	return new ResponseEntity<>("user Inserted",HttpStatus.OK);
}
}
