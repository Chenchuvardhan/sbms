package com.vega.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

import com.vega.jsonObject.Quote;

import reactor.core.publisher.Mono;

@Service
public class QuoteRetrieve {
private static final String PROVIDER_URL="https://dummyjson.com/quotes/random";
public String  getQuote() {
	Mono<String> bodyToMono = WebClient.create()
	                 .get()
	                 .uri(PROVIDER_URL)
	                 .retrieve()
	                 .bodyToMono(String.class);
	String block = bodyToMono.block();
	                 return block;
}
public Quote getQuoteObject() {
	WebClient webClient = WebClient.create();
	Mono<Quote> bodyToMono = webClient.get()
	               .uri(PROVIDER_URL)
	               .retrieve()
	               .bodyToMono(Quote.class);
	System.out.println(bodyToMono);
	Quote block = bodyToMono.block();
	
	return block;
}
public void asynchronousCommunication() {
  WebClient webClient = WebClient.create();
  System.out.println("WebClient is Sending Request");
  Mono<String> bodyToMono = webClient.get()
                .uri(PROVIDER_URL)
                .retrieve()
                .bodyToMono(String.class);
   bodyToMono.subscribe(response->System.out.println(response));
  System.out.println("Response have Gotten");
}
}
