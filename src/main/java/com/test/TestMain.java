package com.test;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.pojo.Film;
import com.service.FilmService;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Context Start");
		@SuppressWarnings("resource")
		ApplicationContext spring = new ClassPathXmlApplicationContext("classpath:spring/ApplicationContext.xml");
		//创建film对象
		Film film = getFilm();
		
		FilmService filmService = (FilmService)spring.getBean("filmServiceImpl");
		
		int i = filmService.insert(film);
	
		System.out.println("Context close");
	}

	@SuppressWarnings("resource")
	private static Film getFilm() {
		// TODO Auto-generated method stub
		Film film = new Film();
		System.out.println("请输入电影名称（title）：");
		Scanner sc = new Scanner(System.in);
		String title = sc.nextLine();
		film.setTitle(title);
		
		System.out.println("请输入电影描述（description）：");
		Scanner sc1 = new Scanner(System.in);
		String description = sc1.nextLine();
		film.setDescription(description);
		
		System.out.println("请输入语言ID（language_id）：");
		Scanner sc2 = new Scanner(System.in);
		int  id = sc2.nextInt();
		film.setLanguageId(id);
		
		//设置默认值为4.99，3
		film.setRentalRate(4.99);
		film.setRentalDuration(3);
		
		return film;
		
	}

}
