package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import command.Command;
import domain.MemberBean;
import service.MemberService;
import service.MemberServiceImpl;

/**
 * Servlet implementation class MemberController
 */
@WebServlet("/member.do")
public class MemberController extends HttpServlet {
	private static final long serialVersionUID = 1L;
  
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("======> 맴버 서블릿 입장");
		MemberBean member = null;
		String cmd = request.getParameter("cmd");
		cmd = (cmd == null) ? "move" : cmd;
		System.out.println("cmd :: "+cmd);
		
		String page = request.getParameter("page");
		if(page == null) {page="main";}
		System.out.println("page :: "+page);
		
		String dir = request.getParameter("dir");
		if(dir == null) {
			String sPath =  request.getServletPath();
			System.out.println("spath :: "+ sPath);
			sPath = sPath.replace(".do", "");
			System.out.println("2.spath :: "+ sPath);
			dir=sPath.substring(1);
			System.out.println("2. dir ::"+dir);
		}
		
		switch(cmd) {
		case "login": 
			System.out.println("스위치 오면서  ==="+dir);
			System.out.println("case = login ,액션이 ="+cmd);
			String id = request.getParameter("uid");
			String pass = request.getParameter("upw");

			if(!(id.equals("test")&&pass.equals("test"))) {
				System.out.println("1====맴버서블릿에서 OUT");
				dir = "";
				page = "index";
				System.out.println("2====맴버서블릿에서 OUT");
			}
			
			request.setAttribute("name", "test");
			request.setAttribute("compo", "login-success");
			Command.move(request, response, dir,page);
			break;
		case "move" : 
			System.out.println("case = move ,액션이 ="+cmd);
			System.out.println("3====맴버서블릿에서 OUT");
			String dest = request.getParameter("dest");
			if(dest ==null) { 
				dest = "NONE";
			}
			request.setAttribute("dest", dest);
			
			Command.move(request, response, dir,page);
			break;
		case "join" :
			System.out.println("조인?? 들어왔어?");
			member = new MemberBean();
			member.setId(request.getParameter("id"));
			member.setName(request.getParameter("name"));
			member.setPass(request.getParameter("pass"));
			member.setSsn(request.getParameter("ssn"));
			
			MemberServiceImpl.getInstance().createMember(member);
			request.setAttribute("dest", "mypage");
			request.setAttribute("member", MemberServiceImpl.getInstance().findMemberById((member.getId())));
			System.out.println("어디로 갈까"+dir+"/"+page);
			Command.move(request, response, dir, page);
			
			break;
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
