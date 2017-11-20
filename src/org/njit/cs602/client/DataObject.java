package org.njit.cs602.client;
import java.io.Serializable;

public class DataObject implements Serializable{

	private static final long serialVersionUID = 1L;
	String message;
	public DataObject()
	{
		message = null; 
	}
	public void setMessage(String m)
	{
		message = m;
	}
	public String getMessage()
	{
		return message; 
	}
}



