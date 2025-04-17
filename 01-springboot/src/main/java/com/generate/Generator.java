package com.generate;

import org.springframework.stereotype.Component;

@Component
public class Generator {
public Generator() {
	System.out.println("generator Object is created by ioc container");
}
}
