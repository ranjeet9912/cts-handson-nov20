package com.org.jeet;

public class Account {
	private int Account;
	private String name;
	public int getAccount() {
		return Account;
	}
	public void setAccount(int account) {
		Account = account;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Account(int account, String name) {
		super();
		Account = account;
		this.name = name;
	}

}
