package com.DevSchool.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MessageImp implements Message{
	Annotated ann;
	
	public void printString(String msg) {
		System.out.println(ann.getString());
		System.out.println("Hello " + msg);
	}

	@Autowired
	public void setAnnoted(Annotated ann){
		this.ann = ann;
	}
	
}
