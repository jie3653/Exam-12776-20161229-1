package com.event;

import org.springframework.context.ApplicationEvent;

public class BeforeFilmInsertEvent extends ApplicationEvent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
 
	public BeforeFilmInsertEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}


}
