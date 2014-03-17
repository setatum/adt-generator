package com.medseek.clinical.generator.adt;

/**
 * Exception class for errors specific to the AdtGenerator application.
 * 
 * @author statum
 */
public class AdtGeneratorException extends Exception {

	public AdtGeneratorException() { super(); }
	public AdtGeneratorException(String message) { super(message); }
	public AdtGeneratorException(String message, Throwable cause) { super(message, cause); }
	public AdtGeneratorException(Throwable cause) { super(cause); }

}
