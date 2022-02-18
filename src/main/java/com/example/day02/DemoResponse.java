package com.example.day02;

public class DemoResponse{
	private int code;
	private String message;

	//add default constructor for support file that was created from JSON generation
	public DemoResponse() {
	}

	public DemoResponse(int code, String message) {
		this.code = code;
		this.message = message;
	}

	public void setCode(int code){
		this.code = code;
	}

	public int getCode(){
		return code;
	}

	public void setMessage(String message){
		this.message = message;
	}

	public String getMessage(){
		return message;
	}
}
