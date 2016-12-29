package com.event;

import org.springframework.context.ApplicationEvent;

public class AfterFilmInsertEvent extends ApplicationEvent{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public AfterFilmInsertEvent(Object source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

}
