package com.listener;

import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import com.event.AfterFilmInsertEvent;
@Component
public class AfterFilmInsertListener implements  ApplicationListener<AfterFilmInsertEvent>{

	@Override
	public void onApplicationEvent(AfterFilmInsertEvent event) {
		// TODO Auto-generated method stub
		if(event instanceof AfterFilmInsertEvent){
			System.out.println("After Insert Film Data");
		}
	}

}
