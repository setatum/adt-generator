package com.medseek.clinical.generator.adt.builder;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.ThreadLocalRandom;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.io.Files;

@Component
public class NameBuilder {
	private static final Logger logger = LoggerFactory.getLogger(NameBuilder.class);

	private String firstNameFilePath;
	private String lastNameFileStrPath;
	private ImmutableList<String> firstNameList;
	private ImmutableList<String> lastNameList;

	public NameBuilder() {
		this.firstNameFilePath = "src/main/resources/first-names.txt";
		this.lastNameFileStrPath = "src/main/resources/last-names.txt";

		// load these files into large immutable String arrays
		try {
			firstNameList = Files.asCharSource(new File(this.firstNameFilePath), Charsets.UTF_8).readLines();
			lastNameList = Files.asCharSource(new File(this.lastNameFileStrPath), Charsets.UTF_8).readLines();
			logger.info("Loaded " + firstNameList.size() + " first names.");
			logger.info("Loaded " + lastNameList.size() + " last names.");
		}
		catch (IOException e) {
			logger.error("Failed to read first and/or last name files: " + e);
		}
	}

	public String getRandomFirstName() {
		return firstNameList.get(ThreadLocalRandom.current().nextInt(0, firstNameList.size()));
	}

	public String getRandomLastName() {
		return lastNameList.get(ThreadLocalRandom.current().nextInt(0, lastNameList.size()));
	}

	public String getRandomFullName() {
		StringBuilder buffer = new StringBuilder(64);
		buffer.append(getRandomFirstName());
		buffer.append(" ");
		buffer.append(getRandomLastName());
		return buffer.toString();
	}
	
	public String getFirstNameFilePath() {
		return firstNameFilePath;
	}

	public void setFirstNameFilePath(String firstNameFilePath) {
		this.firstNameFilePath = firstNameFilePath;
	}

	public String getLastNameFileStrPath() {
		return lastNameFileStrPath;
	}

	public void setLastNameFileStrPath(String lastNameFileStrPath) {
		this.lastNameFileStrPath = lastNameFileStrPath;
	}

	public ImmutableList<String> getFirstNameList() {
		return firstNameList;
	}

	public void setFirstNameList(ImmutableList<String> firstNameList) {
		this.firstNameList = firstNameList;
	}

	public ImmutableList<String> getLastNameList() {
		return lastNameList;
	}

	public void setLastNameList(ImmutableList<String> lastNameList) {
		this.lastNameList = lastNameList;
	}
		
}