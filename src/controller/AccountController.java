package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import domain.AccountBean;
import service.AccountService;
import service.AccountServiceImpl;

/**
 * Servlet implementation class AccountController
 */
@WebServlet("/account.do")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("======> 계좌 서블릿 입장");
		AccountService accountService = null;
		AccountBean account = null;
		String cmd = request.getParameter("cmd");
		cmd = (cmd==null)? "move" : cmd;
		System.out.println("cmd::" + cmd);
		String dir = request.getParameter("dir");
		if(dir==null) {
			String sPath = request.getServletPath();
			sPath = sPath.replace(".do","");
			dir = sPath.substring(1);
		}
		
		String page = request.getParameter("page");
		if(page==null) {page="main";}
		String dest = request.getParameter("dest");
		if(dest == null) {dest="NONE";}

		switch(cmd) {
		case "move": 
			System.out.println("case = move,액션이 ="+cmd);
			
			request.setAttribute("dest", dest);
			Command.move(request, response, dir,page);
			break;
		case "open-account":
			System.out.println("open-account 입장====");
			account = new AccountBean();
			account.setAccountNum(accountService.AccNum());
			account.setMoney(Integer.parseInt((request.getParameter("money"))));
			account.setToday(accountService.findDate());
			
			AccountServiceImpl.getInstance().createAccountNum(account);
			request.setAttribute("account", AccountServiceImpl.getInstance().findByAccountNum(account.getAccountNum()));
			System.out.println("어디로 갈까~?"+dir+"/"+page);
			Command.move(request, response, dir, page);
			
			break;
/*			String money = request.getParameter("money");
			System.out.println("돈은 ::"+money);
			dest = request.getParameter("dest");
			if(dest==null) {
				dest = "open-result";
			}
			request.setAttribute("dest", dest);
			System.out.println("dest::::"+dest);
			
			AccountBean acc = accountService.findByAccountNum(accountBean.getAccountNum());
			System.out.println("acc:::"+acc);
			request.setAttribute("acc", acc);
			page = "main";
			System.out.println("dir+ page ::"+dir+page);
			Command.move(request, response, dir,page);*/
			
/*			String[] cans = can.split(",");
			System.out.println(cans[0]);
			System.out.println(cans[1]);
			System.out.println(cans[2]);
			
			String acc = cans[0];
			money = cans[2];
			String date = cans[1];
			
			System.out.println("계좌::"+acc);
			System.out.println("돈::"+money);
			System.out.println("날짜::"+date);
			request.setAttribute("money", money);
			request.setAttribute("num", acc);
			request.setAttribute("date", date);
*/			
			
			//accountService.createAccountNum(money);
		case "account-detail" : 
			
			
			break;
		
	
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
