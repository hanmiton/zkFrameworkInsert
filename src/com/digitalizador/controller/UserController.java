package com.digitalizador.controller;

import java.util.HashMap;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import com.digitalizador.model.Usuario;
import com.digitalizador.model.Types;
import com.digitalizador.util.HibernateUtil;

public class UserController extends SelectorComposer<Window>{
	
	@Wire
	Textbox nameUser;
	
	@Wire
	Textbox apeUser;
	
	@Wire
	Textbox emailUser;
	
	@Wire
	Textbox passUser;
	
	@Wire
	Textbox username;
	
	@Wire
	Textbox typeUser;
	
	@Wire
	Textbox desc;
	
	
	
	@Listen("onClick=#saveUser")
	public void submit() {
		final HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("nameUser", nameUser.getValue());
		map.put("apeUser",  apeUser.getValue());
		map.put("emailUser",  emailUser.getValue());
		map.put("passUser",  passUser.getValue());
		map.put("username",  username.getValue());
		
		Usuario user = new Usuario();
		
		user.setNAME_USER(nameUser.getValue());
		user.setLAST_NAME(apeUser.getValue());
		user.setEMAIL(emailUser.getValue());
		user.setPASSWORD(passUser.getValue());
		user.setUSERNAME(username.getValue());
		
		HibernateUtil.save(user);
	}
	
	@Listen("onClick=#saveType")
	public void submitType() {
		final HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("typeUser", typeUser.getValue());
		map.put("desc",  desc.getValue());
		
		
		Types type = new Types();
		
		type.setTIPO(typeUser.getValue());
		type.setDESCRIPCION(desc.getValue());
		
		HibernateUtil.save(type);
	}

}
