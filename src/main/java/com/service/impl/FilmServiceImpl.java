package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mapper.FilmMapper;
import com.pojo.Film;
import com.service.FilmService;


public class FilmServiceImpl implements FilmService{
	//注入mapper
	@Autowired
	private FilmMapper filmMapper;
	
	@Override
	public int insert(Film record) {
		// TODO Auto-generated method stub
		return filmMapper.insert(record);
	}

	
}
