package br.com.erudio.exceptions;

import java.io.Serializable;
import java.util.Date;

public class ExceptionsResponse implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Date timestamp;
	private String menssage;
	private String details;
	
	public ExceptionsResponse(Date timestamp, String menssage, String details) {
		super();
		this.timestamp = timestamp;
		this.menssage = menssage;
		this.details = details;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public String getMenssage() {
		return menssage;
	}

	public String getDetails() {
		return details;
	}

	
	
}
