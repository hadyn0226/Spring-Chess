package com.example.demo.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.TestDTO;
import com.example.demo.mapper.TestMapper;

@Repository
public class TestDAO implements TestMapper{

	@Autowired
	private SqlSession sqlSession;
	
	
	@Override
	public List<TestDTO> selectAll() {
		return sqlSession.selectList("com.example.demo.mapper.TestMapper.selectAll");
	}

}
