package com.marondal.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marondal.spring.ex.mybatis.bo.ReviewBO;
import com.marondal.spring.ex.mybatis.model.Review;

@Controller
public class ReviewController {
	
	@Autowired
	private ReviewBO reviewBO;
	
	// 전달받은 id와 일치하는 데이터 조회 그결과를 json으로 response에 담기
	@RequestMapping("/mybatis/ex01")
	@ResponseBody
	public Review review(
			@RequestParam("id") int id
//			@RequestParam(value="id", required=false) int id  // 비필수 파라미터
//			@RequestParam(value="id", defaultValue="3")  int id
			) {
		
//		int id = Integer.parseInt(request.getParameter("id"));
		Review review = reviewBO.getReview(id);
		
		return review;
		
	}
	
	

}
