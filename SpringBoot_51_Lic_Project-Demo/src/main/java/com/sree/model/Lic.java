package com.sree.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Data;

@Entity
@Data
public class Lic {
	@Id
	
	@SequenceGenerator(sequenceName="user_policynumber_seq",name="user_seq",allocationSize=1)
	@GeneratedValue(generator="user_seq",strategy=GenerationType.IDENTITY)

	private Long policynumber;
	private String name;
	private Double premium;
    private String dateofbirth;
	private String countrycode;
	private Long mobilenumber;
	private String email;
	private String passport;
	private String PAN;
	private String gender;
	private String JoiningDate;
	
	public Lic() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Lic(Long policynumber, String name, Double premium, String dateofbirth, String countrycode,
			Long mobilenumber, String email, String passport, String pAN, String gender, String joiningDate) {
		super();
		this.policynumber = policynumber;
		this.name = name;
		this.premium = premium;
		this.dateofbirth = dateofbirth;
		this.countrycode = countrycode;
		this.mobilenumber = mobilenumber;
		this.email = email;
		this.passport = passport;
		PAN = pAN;
		this.gender = gender;
		JoiningDate = joiningDate;
	}
	public Long getPolicynumber() {
		return policynumber;
	}
	public void setPolicynumber(Long policynumber) {
		this.policynumber = policynumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPremium() {
		return premium;
	}
	public void setPremium(Double premium) {
		this.premium = premium;
	}
	public String getDateofbirth() {
		return dateofbirth;
	}
	public void setDateofbirth(String dateofbirth) {
		this.dateofbirth = dateofbirth;
	}
	public String getCountrycode() {
		return countrycode;
	}
	public void setCountrycode(String countrycode) {
		this.countrycode = countrycode;
	}
	public Long getMobilenumber() {
		return mobilenumber;
	}
	public void setMobilenumber(Long mobilenumber) {
		this.mobilenumber = mobilenumber;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassport() {
		return passport;
	}
	public void setPassport(String passport) {
		this.passport = passport;
	}
	public String getPAN() {
		return PAN;
	}
	public void setPAN(String pAN) {
		PAN = pAN;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getJoiningDate() {
		return JoiningDate;
	}
	public void setJoiningDate(String joiningDate) {
		JoiningDate = joiningDate;
	}
	@Override
	public String toString() {
		return "Lic [policynumber=" + policynumber + ", name=" + name + ", premium=" + premium + ", dateofbirth="
				+ dateofbirth + ", countrycode=" + countrycode + ", mobilenumber=" + mobilenumber + ", email=" + email
				+ ", passport=" + passport + ", PAN=" + PAN + ", gender=" + gender + ", JoiningDate=" + JoiningDate
				+ "]";
	}
	
	
}