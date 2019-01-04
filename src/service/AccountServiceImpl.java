package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import controller.AccountController;
import domain.AccountBean;

public class AccountServiceImpl implements AccountService {
	private ArrayList<AccountBean> list;
	
	public AccountServiceImpl() {
		list = new ArrayList<>();
	}
	
	
	@Override
	public String createAccountNum(int money) {
		String accountNum="";
		AccountBean abean = new AccountBean();
		abean.setAccountNum(AccNum());
		abean.setToday(findDate());
		abean.setMoney(0);
		list.add(abean);
		System.out.println(accountNum);
		return accountNum;
		
	}

	@Override
	public String AccNum() {
		String accNum = "";
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			if (i == 2) {
				accNum += random.nextInt(10) + "-";
			} else {
				accNum += random.nextInt(10);
			}
		}
		return accNum;
	}


	@Override
	public ArrayList<AccountBean> findByAll() {

		return null;
	}

	@Override
	public AccountBean findByAccountNem(String accountNum) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int countAccount() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public String findDate() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}

	@Override
	public AccountBean today() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void withdrawMoney(String accountNum, int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositMoney(String accountNum, int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		
	}

}
