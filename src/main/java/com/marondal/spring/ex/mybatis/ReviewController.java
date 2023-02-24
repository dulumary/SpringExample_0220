package com.marondal.spring.ex.mybatis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marondal.spring.ex.mybatis.bo.ReviewBO;
import com.marondal.spring.ex.mybatis.model.Review;

@Controller
@RequestMapping("/mybatis")
public class ReviewController {
	
	@Autowired
	private ReviewBO reviewBO;
	
	// 전달받은 id와 일치하는 데이터 조회 그결과를 json으로 response에 담기
	@RequestMapping("/ex01")
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
	
	// 새로운 리뷰를 등록하는 기능
	@RequestMapping("/ex02")
	@ResponseBody
	public String addReview() {
		// 4, "콤비네이션피자", "김인규", 4.5, "할인도 많이 받고 잘 먹었어요"
//		int count = reviewBO.addReview(4, "콤비네이션피자", "김인규", 4.5, "할인도 많이 받고 잘 먹었습니다.");
		
		Review review = new Review();
		review.setStoreId(2);
		review.setMenu("뿌링클");
		review.setUserName("김인규");
		review.setPoint(4.0);
		review.setReview("역시 뿌링클은 진리입니다!");
		
		int count = reviewBO.addReviewByObject(review);
		
		// 실행결과 : 1
		return "실행결과 : " + count;
	}
	
	
	
	
	
	
	
	

}
