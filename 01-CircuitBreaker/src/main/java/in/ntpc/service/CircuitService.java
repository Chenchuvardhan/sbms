package in.ntpc.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;

@RestController
public class CircuitService {
	@GetMapping("/data")
	@CircuitBreaker(fallbackMethod = "getDataByDB", name = "chenchu")
	public String getDataByRedis() {
		System.out.println("get data Through apache redis");
		Integer as=10/0;
		return "get data from apache redis";
	}

	public String getDataByDB(Throwable t) {
		System.out.println("It is from getting data through database");
		return "get data from Data base()";
	}
}
