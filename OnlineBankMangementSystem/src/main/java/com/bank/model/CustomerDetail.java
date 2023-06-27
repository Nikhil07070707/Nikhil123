package com.bank.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class CustomerDetail {
	@Id
	private int customer_id;
	private String frist_name;
	private String middle_name;
	private String last_name;
	private String mail_id;
	private long mobile_no;
	private int date_brith;
	private String token;
	private int code;
	private int verified;
	private LocalDate verified_at;
	@CreationTimestamp
	@Column(updatable = false)
	private LocalDate created_at;
	@CreationTimestamp
	@Column(insertable = false)
	private LocalDate updated_at;
	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public int getVerified() {
		return verified;
	}

	public void setVerified(int verified) {
		this.verified = verified;
	}

	public LocalDate getVerified_at() {
		return verified_at;
	}

	public void setVerified_at(LocalDate verified_at) {
		this.verified_at = verified_at;
	}

	public LocalDate getCreated_at() {
		return created_at;
	}

	public void setCreated_at(LocalDate created_at) {
		this.created_at = created_at;
	}

	public LocalDate getUpdated_at() {
		return updated_at;
	}

	public void setUpdated_at(LocalDate updated_at) {
		this.updated_at = updated_at;
	}

	private String gender;
	private long addhar_no;
	private String pan_no;

	private String mother_name;
	@OneToMany(cascade = CascadeType.ALL)

	private List<Address> address;

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	@OneToOne(cascade = CascadeType.ALL)
	private Login login;

	public int getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(int customer_id) {
		this.customer_id = customer_id;
	}

	public Login getLogin() {
		return login;
	}

	public void setLogin(Login login) {
		this.login = login;
	}

	public String getFrist_name() {
		return frist_name;
	}

	public void setFrist_name(String frist_name) {
		this.frist_name = frist_name;
	}

	public String getMiddle_name() {
		return middle_name;
	}

	public void setMiddle_name(String middle_name) {
		this.middle_name = middle_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getMail_id() {
		return mail_id;
	}

	public void setMail_id(String mail_id) {
		this.mail_id = mail_id;
	}

	public long getMobile_no() {
		return mobile_no;
	}

	public void setMobile_no(long mobile_no) {
		this.mobile_no = mobile_no;
	}

	public int getDate_brith() {
		return date_brith;
	}

	public void setDate_brith(int date_brith) {
		this.date_brith = date_brith;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public long getAddhar_no() {
		return addhar_no;
	}

	public void setAddhar_no(long addhar_no) {
		this.addhar_no = addhar_no;
	}

	public String getPan_no() {
		return pan_no;
	}

	public void setPan_no(String pan_no) {
		this.pan_no = pan_no;
	}

	public String getMother_name() {
		return mother_name;
	}

	public void setMother_name(String mother_name) {
		this.mother_name = mother_name;
	}

}
