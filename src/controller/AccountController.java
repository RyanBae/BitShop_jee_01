package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;

/**
 * Servlet implementation class AccountController
 */
@WebServlet("/account.do")
public class AccountController extends HttpServlet {
	private static final long serialVersionUID = 1L;
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("======> 계좌 서블릿 입장");
		String cmd = request.getParameter("cmd");
		cmd = (cmd==null)? "move" : cmd;
		
		String dir = request.getParameter("dir");
		if(dir==null) {
			String sPath = request.getServletPath();
			System.out.println("1. sPath :::" + sPath);
			sPath = sPath.replace(".do","");
			System.out.println("2. sPath :::" + sPath);
			dir = sPath.substring(1);
			System.out.println("3. dir :: "+dir);
		}
		
		String page = request.getParameter("page");
		if(page==null) {page="main";}
		System.out.println("cmd :: "+cmd);
		System.out.println("dir :: "+dir);
		System.out.println("page :: "+page);
		System.out.println("2. page :: "+page);
		
		switch(cmd) {
		case "move": 
			System.out.println("case = move,액션이 ="+cmd);
			Command.move(request, response, dir,page);
			break;
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
