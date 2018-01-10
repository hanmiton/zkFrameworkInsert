package com.digitalizador.controller;

import java.util.HashMap;

import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zul.Textbox;
import org.zkoss.zul.Window;

import com.digitalizador.model.User;
import com.digitalizador.util.HibernateUtil;

public class UserController extends SelectorComposer<Window>{
	
	@Wire
	Textbox firstName;
	
	@Wire
	Textbox userCode;
	
	@Listen("onClick=#saveUser")
	public void submit() {
		final HashMap<String, Object> map = new HashMap<String, Object>();
		
		map.put("firstName", firstName.getValue());
		map.put("lastName",  userCode.getValue());
		
		User user = new User();
		
		user.setUSER_NAME(firstName.getValue());
		user.setUSER_CODE(userCode.getValue());
		
		HibernateUtil.save(user);
	}

}
