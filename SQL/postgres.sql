CREATE TABLE usuario (
	
	OID VARCHAR(255) DEFAULT NULL,
	VERSION VARCHAR(255) DEFAULT NULL,
	NAME_USER VARCHAR(255) DEFAULT NULL,
	LAST_NAME VARCHAR(255) DEFAULT NULL,
	EMAIL VARCHAR(255) DEFAULT NULL,
	PASSWORD VARCHAR(255) DEFAULT NULL,
	USERNAME VARCHAR(255) DEFAULT NULL,
	PRIMARY KEY (OID)	
)

CREATE TABLE tipos (
	OID VARCHAR(255) DEFAULT NULL,
	VERSION VARCHAR(255) DEFAULT NULL,
	TIPO VARCHAR(255) DEFAULT NULL,
	DESCRIPCION VARCHAR(255) DEFAULT NULL,
	PRIMARY KEY (OID)	
)

CREATE TABLE PERMISOS (
	OID VARCHAR(255) DEFAULT NULL,
	PERMISO VARCHAR(255) DEFAULT NULL,
	DESCRIPCION VARCHAR(255) DEFAULT NULL,
	PRIMARY KEY (OID)	
)

CREATE TABLE ARCHIVOS (
	OID VARCHAR(255) DEFAULT NULL,
    VERSION VARCHAR(255) DEFAULT NULL,
	PATH VARCHAR(255) DEFAULT NULL,
	DESCRIPCION VARCHAR(255) DEFAULT NULL,
	PRIMARY KEY (OID)	
)

CREATE TABLE METAS (
	OID VARCHAR(255) DEFAULT NULL,
	NUMERO VARCHAR(255) DEFAULT NULL,
	DESCRIPCION VARCHAR(255) DEFAULT NULL,
    FECHA VARCHAR(255) DEFAULT NULL,
	PRIMARY KEY (OID)	
)