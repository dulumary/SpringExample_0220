package com.marondal.spring.ex.jsp.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marondal.spring.ex.jsp.dao.UserDAO;
import com.marondal.spring.ex.jsp.model.User;

@Service
public class UserBO {
	
	@Autowired
	private UserDAO userDAO;
	
	// 이름, 생년월일, 이메일, 자기소개 저장
	public int addUser(String name, String birthday, String email, String introduce) {
		
		return userDAO.insertUser(name, birthday, email, introduce);
	}
	
	public int addUserByObject(User user) {
		return userDAO.insertUserByObject(user);
	}
	
	public User getLastUser() {
		return userDAO.selectLastUser();
	}
	
	public List<User> getUserList() {
		return userDAO.selectUserList();
	}
	
	public boolean isDuplicateEmail(String email) {
		int count = userDAO.selectCountEmail(email);
		
		if(count == 0) {
			// 중복되지 않았다
			return false;
		} else {
			return true;
		}
	}
	
	
	
	
	

}
