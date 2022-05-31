package org.htwdresden.informatik.pkademo.SpringPKAdemo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bean1 {
	
	@Autowired
	private Bean2 b2;
	
	@Override
	public String toString() {
		return "Bean1" + " " + b2.toString();
	}
}
