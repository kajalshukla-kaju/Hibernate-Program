package org.customer;

public class FundTransfer {
	private  int AccNo;
	private  int ToAccNo;
	private  int Amount;
	private  String Mode;
	public int getAccNo() {
		return AccNo;
	}
	public void setAccNo(int accNo) {
		AccNo = accNo;
	}
	public int getToAccNo() {
		return ToAccNo;
	}
	public void setToAccNo(int toAccNo) {
		ToAccNo = toAccNo;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public String getMode() {
		return Mode;
	}
	public void setMode(String mode) {
		Mode = mode;
	}
	
}
