package com.medseek.clinical.generator.adt.builder;

import java.io.File;
import java.io.IOException;

import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableList;
import com.google.common.io.Files;

public class NameBuilder {
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
			System.out.println("Loaded " + firstNameList.size() + " first names.");
			System.out.println("Loaded " + lastNameList.size() + " last names.");
		}
		catch (IOException e) {
			System.out.println("Failed to read first and/or last name files: " + e);
		}
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