package com.bank.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Branch {
	
	
	private int branch_ifsc;
	private String branch_name;
	@Id
	private int branch_code;
	private String branch_address;

	public int getBank_ifsc() {
		return branch_ifsc;
	}

	public void setBank_ifsc(int bank_ifsc) {
		this.branch_ifsc = bank_ifsc;
	}

	public String getBranch_name() {
		return branch_name;
	}

	public void setBranch_name(String branch_name) {
		this.branch_name = branch_name;
	}

	public int getBranch_pincode() {
		return branch_code;
	}

	public void setBranch_pincode(int branch_pincode) {
		this.branch_code = branch_pincode;
	}

	public String getBranch_address() {
		return branch_address;
	}

	public void setBranch_address(String branch_address) {
		this.branch_address = branch_address;
	}

}
