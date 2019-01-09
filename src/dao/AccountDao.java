package dao;

import java.util.ArrayList;

import domain.AccountBean;

public interface AccountDao {
	public void insertAccountNum(AccountBean account); //신규생성
	public String AccNum(); //계좌번호
	
	/**
	 * READ
	 * */
	public ArrayList<AccountBean> selectAccountByAll(); //계좌 금액 확인
	public AccountBean selectByAccountNum(String accountNum); //계좌 금액 확인
	public int countAccount();
	public String selectDate();//날짜
	
	
	/**
	 * UPDATE
	 * */
	public void withdrawMoney(int money); //출금
	public void depositMoney(int money); //입금
	
	/**
	 * DELETE
	 * */
	public void deleteAccountNum(String accountNum);
	
}
