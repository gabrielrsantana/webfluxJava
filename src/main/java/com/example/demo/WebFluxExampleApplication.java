package com.example.demo;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


public class WebFluxExampleApplication {

	public static void main(String[] args) {
		System.out.println("-------- Usando Mono -----------------");
		Mono<String> mono = Mono.just("Hello, Reactor!");
		mono.subscribe(System.out::println);
		System.out.println("-------- Usando FLux -----------------");
		Flux<String> flux = Flux.just("Hello", "Reactor", "with", "Flux");
		flux.subscribe(System.out::println);

	}

}
