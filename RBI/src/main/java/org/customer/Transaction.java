package org.customer;

public class Transaction {
	private  int AccNo;
	private  int Amount;
	private  String TranDate;
	private String Status;
	public int getAccNo() {
		return AccNo;
	}
	public void setAccNo(int accNo) {
		AccNo = accNo;
	}
	public int getAmount() {
		return Amount;
	}
	public void setAmount(int amount) {
		Amount = amount;
	}
	public String getTranDate() {
		return TranDate;
	}
	public void setTranDate(String tranDate) {
		TranDate = tranDate;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	
}
