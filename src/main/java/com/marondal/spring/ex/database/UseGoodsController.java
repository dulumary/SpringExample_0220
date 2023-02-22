package com.marondal.spring.ex.database;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.marondal.spring.ex.database.bo.UsedGoodsBO;
import com.marondal.spring.ex.database.model.UsedGoods;

@Controller
public class UseGoodsController {
	
	@Autowired
	private UsedGoodsBO usedGoodsBO;
	
	@RequestMapping("/database/ex01")
	@ResponseBody
	public List<UsedGoods> ex01() {
		
		// used_goods 목록 가져오기 
		List<UsedGoods> usedGoodsList = usedGoodsBO.getUsedGoodsList();
		
		return usedGoodsList;
		
	}

}
