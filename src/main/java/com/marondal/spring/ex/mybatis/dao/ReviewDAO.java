package com.marondal.spring.ex.mybatis.dao;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.marondal.spring.ex.mybatis.model.Review;

@Repository
public interface ReviewDAO {
	
	public Review selectReivew(@Param("id") int id);
	
	
	

}
