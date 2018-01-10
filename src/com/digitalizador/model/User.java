package com.digitalizador.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "user")
public class User {

	private String OID;
	private String USER_NAME;
	private String USER_CODE;
	private  String VERSION;
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name= "uuid", strategy = "uuid2")
	@Column(name = "OID")
	public String getOID() {
		return OID;
	}
	
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name= "uuid", strategy = "uuid2")
	@Column(name = "OID")
	public void setOID(String oID) {
		OID = oID;
	}
	
	@Column(name = "USER_NAME")
	public String getUSER_NAME() {
		return USER_NAME;
	}
	
	@Column(name = "USER_NAME")
	public void setUSER_NAME(String uSER_NAME) {
		USER_NAME = uSER_NAME;
	}
	
	@Column(name = "USER_CODE")
	public String getUSER_CODE() {
		return USER_CODE;
	}
	
	@Column(name = "USER_CODE")
	public void setUSER_CODE(String uSER_CODE) {
		USER_CODE = uSER_CODE;
	}
	
	@Column(name = "VERSION")
	public String getVERSION() {
		return VERSION;
	}
	
	@Column(name = "VERSION")
	public void setVERSION(String vERSION) {
		VERSION = vERSION;
	}
	
	
	
	
}
