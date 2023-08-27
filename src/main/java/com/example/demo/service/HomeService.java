package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.TestDAO;
import com.example.demo.dto.TestDTO;

@Service
public class HomeService {
	
	@Autowired
	private TestDAO testDAO;
	
	public List<TestDTO> selectAll(){
		return testDAO.selectAll();
	}
}
