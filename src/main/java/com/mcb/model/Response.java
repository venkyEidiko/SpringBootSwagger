package com.mcb.model;



public class Response {
	
	public int satus;
	public String massage;
	@Override
	public String toString() {
		return "Response [satus=" + satus + ", massage=" + massage + "]";
	}
	public int getSatus() {
		return satus;
	}
	public void setSatus(int satus) {
		this.satus = satus;
	}
	public String getMassage() {
		return massage;
	}
	public void setMassage(String massage) {
		this.massage = massage;
	}
	
	
	
}
