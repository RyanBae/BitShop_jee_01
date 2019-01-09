package service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

import controller.AccountController;
import domain.AccountBean;

public class AccountServiceImpl implements AccountService {
	
	private static AccountServiceImpl instance = new AccountServiceImpl();
	private AccountServiceImpl() {}
	public static AccountServiceImpl getInstance() {return instance;}

	@Override
	public void createAccountNum(AccountBean account) {
		System.out.println("AccountServiceImpl 입장====");
		System.out.println("AccountNum :"+account.getAccountNum());
		System.out.println("findDate :"+ account.getToday());
		System.err.println("money :"+account.getMoney());
		
		AccountServiceImpl.instance.createAccountNum(account);
	
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
	public ArrayList<AccountBean> findAccountByAll() {
		ArrayList<AccountBean> list = new ArrayList<>();
		return list;
	}

	@Override
	public AccountBean findByAccountNum(String accountNum) {
		AccountBean accountBean = new AccountBean();
		
		return accountBean;
	}

	@Override
	public int countAccount() {
		 int count = 0;
		return count;
	}

	@Override
	public boolean existAccountNum(String accountNum) {
		boolean exist = false;
		return exist;
	}

	@Override
	public String findDate() {
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return sdf.format(date);
	}


	@Override
	public void withdrawMoney(int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void depositMoney(int money) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removeAccountNum(String accountNum) {
		// TODO Auto-generated method stub
		
	}

}
