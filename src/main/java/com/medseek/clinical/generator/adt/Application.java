package com.medseek.clinical.generator.adt;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Entry point for the ADT generator application. Pulls in various builders
 * (classes that generate random pieces of the ADT structure.
 * @author setatum
 *
 */
@Configuration
@ComponentScan
public class Application {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(Application.class);

		AdtGenerator adt = context.getBean(AdtGenerator.class);
		adt.run();
	}
}
