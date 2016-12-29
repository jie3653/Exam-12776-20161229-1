package com.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.event.BeforeFilmInsertEvent;

@Component
public class BeforeFilmInsertListener implements  ApplicationListener<BeforeFilmInsertEvent>{

	@Override
	public void onApplicationEvent(BeforeFilmInsertEvent event) {
		// TODO Auto-generated method stub
		if(event instanceof BeforeFilmInsertEvent){
			System.out.println("Before Insert Film Data");
		}
	}

	

	
	
}
