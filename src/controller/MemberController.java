package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import pool.Constant;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("======> 맴버 서블릿 입장");
		String cmd = request.getParameter("cmd");
		System.out.println("cmd :: "+cmd);
		
		String page = request.getParameter("page");
		System.out.println("page :: "+page);
		if(page == null) {page="main";}
		String dir = request.getParameter("dir");
		System.out.println("dir = "+dir);
		if(dir == null) {
			String sPath =  request.getServletPath();
			sPath = sPath.replace(".do", "");
			dir=sPath.substring(1);
		}
		
		switch((cmd == null) ? "move" : cmd) {
		case "login": 
			System.out.println("스위치 오면서  ==="+dir);
			System.out.println("case = login ,액션이 ="+cmd);
			String id = request.getParameter("id");
			String pass = request.getParameter("pass");

			if(id.equals("test")&&pass.equals("test")) {
				System.out.println("1====맴버서블릿에서 OUT");
				Command.move(request, response, dir+"/"+page);
			}else {
				System.out.println("2====맴버서블릿에서 OUT");
				Command.move(request, response, "index");
			}
			break;
		case "move" : 
			System.out.println("case = move ,액션이 ="+cmd);
			System.out.println("3====맴버서블릿에서 OUT");
				Command.move(request, response, dir+"/"+page);
				break;

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
