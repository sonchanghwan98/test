package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.AccountDAO;
import com.example.demo.vo.AccountVO;

@Service
public class AccountService {
	
	@Autowired
	private AccountDAO dao;

	public int addAccount(AccountVO input) {
		return dao.insertAccount(input);
		
	}

	public AccountVO selectOne(AccountVO input) {
		
		return dao.selectOne(input);
	}

}
