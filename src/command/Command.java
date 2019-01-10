package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pool.Constant;

public class Command {
	
	public static void move(HttpServletRequest request, 
			HttpServletResponse response, String dir, String page) throws ServletException, IOException {
		System.out.println("====> 커멘더 입장.");
		System.out.println("들어온 조합은 :::"+Constant.VIEW + dir+"/"+page + Constant.JSP);
		
		request.getRequestDispatcher((page.equals("index")) 
				? "index"+Constant.JSP : Constant.VIEW + dir+"/"+page + Constant.JSP)
					.forward(request, response);
	}
	
	
	public static void dirPath(HttpServletRequest request, 
			HttpServletResponse response, String letcmd, String letdir, String letpage) throws ServletException, IOException {
		System.out.println("커맨더 dir 으로 진입 ==");
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
		

	}
}
