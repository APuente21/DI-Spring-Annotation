package com.DevSchool.domain;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;


@Service
public class Annotated {
	private String str = "This comes first";
	
	public String getString(){
		return str;
	}
}
