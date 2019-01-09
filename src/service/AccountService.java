package service;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountService {
	//String accountNum, today;
		//int money;
		
		/**
		 * CREATE
		 * */
		public void createAccountNum(AccountBean account); //신규생성
		public String AccNum(); //계좌번호
		
		/**
		 * READ
		 * */
		public ArrayList<AccountBean> findAccountByAll(); //계좌 전체 확인
		public AccountBean findByAccountNum(String accountNum); //계좌 금액 확인
		public int countAccount();
		public boolean existAccountNum(String accountNum);
		public String findDate();//날짜
		
		
		/**
		 * UPDATE
		 * */
		public void withdrawMoney(int money); //출금
		public void depositMoney(int money); //입금
		
		/**
		 * DELETE
		 * */
		public void removeAccountNum(String accountNum);
		
		
	}
