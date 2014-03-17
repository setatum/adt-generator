package com.medseek.clinical.generator.adt;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.medseek.clinical.generator.adt.builder.NameBuilder;

@Component
public class AdtGenerator {
	private static final Logger logger = LoggerFactory.getLogger(AdtGenerator.class);
	
	@Autowired
	private NameBuilder nameBuilder;

	public void run() {
		logger.info("ADT Generator v 1.0.");
	}
}
