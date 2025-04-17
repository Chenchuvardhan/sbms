package com.vega;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.vega.service.QuoteRetrieve;

@SpringBootApplication
public class WebclientSep2524Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(WebclientSep2524Application.class, args);
	    QuoteRetrieve bean = run.getBean(QuoteRetrieve.class);
	   //System.out.println(bean.getQuote());
	   //System.out.println(bean.getQuoteObject());
	    
	    bean.asynchronousCommunication();
	}
}
