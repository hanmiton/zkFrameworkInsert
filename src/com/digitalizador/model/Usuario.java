package com.digitalizador.model;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "usuario")
public class Usuario {

	private String OID;
	private String NAME_USER;
	private String LAST_NAME;
	private  String VERSION;
	private  String EMAIL;
	private  String PASSWORD;
	private  String USERNAME;
	
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
	
	@Column(name = "NAME_USER")
	public String getNAME_USER() {
		return NAME_USER;
	}
	@Column(name = "NAME_USER")
	public void setNAME_USER(String nAME_USER) {
		NAME_USER = nAME_USER;
	}
	
	@Column(name = "LAST_NAME")
	public String getLAST_NAME() {
		return LAST_NAME;
	}

	@Column(name = "LAST_NAME")
	public void setLAST_NAME(String lAST_NAME) {
		LAST_NAME = lAST_NAME;
	}
	
	@Column(name = "VERSION")
	public String getVERSION() {
		return VERSION;
	}
	
	@Column(name = "VERSION")
	public void setVERSION(String vERSION) {
		VERSION = vERSION;
	}
	
	@Column(name = "EMAIL")
	public String getEMAIL() {
		return EMAIL;
	}
	
	@Column(name = "EMAIL")
	public void setEMAIL(String eMAIL) {
		EMAIL = eMAIL;
	}
	
	@Column(name = "PASSWORD")
	public String getPASSWORD() {
		return PASSWORD;
	}

	@Column(name = "PASSWORD")
	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
	
	@Column(name = "USERNAME")
	public String getUSERNAME() {
		return USERNAME;
	}
	
	@Column(name = "USERNAME")
	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}
	
	
	
	
	
}
