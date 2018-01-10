package com.digitalizador.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;



@Entity
@Table(name = "TIPOS")
public class Types {
	private String OID;
	private String TIPO;
	private String DESCRIPCION;
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
	
	@Column(name = "TIPO")
	public String getTIPO() {
		return TIPO;
	}
	
	@Column(name = "TIPO")
	public void setTIPO(String tIPO) {
		TIPO = tIPO;
	}
	
	@Column(name = "DESCRIPCION")
	public String getDESCRIPCION() {
		return DESCRIPCION;
	}
	
	@Column(name = "DESCRIPCION")
	public void setDESCRIPCION(String dESCRIPCION) {
		DESCRIPCION = dESCRIPCION;
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
