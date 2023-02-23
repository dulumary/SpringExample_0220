package com.marondal.spring.ex.mybatis.bo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marondal.spring.ex.mybatis.dao.ReviewDAO;
import com.marondal.spring.ex.mybatis.model.Review;

@Service
public class ReviewBO {
	
	@Autowired
	private ReviewDAO reviewDAO;
	
	// 전달받은 id와 일치하는 데이터 조회후 그 결과 리턴
	public Review getReview(int id) {
		
		Review review = reviewDAO.selectReivew(id);
		
		return review;
	}
	
	

}
