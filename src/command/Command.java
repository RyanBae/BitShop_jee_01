package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pool.Constant;

public class Command {
	
	public static void move(HttpServletRequest request, 
			HttpServletResponse response, String path) throws ServletException, IOException {
		String dispatcher = "";
		if(path.equals("index")) {
			dispatcher = "/index.jsp";
		} else {
			dispatcher = Constant.VIEW + path + Constant.JSP;
		}
	//	request.getRequestDispatcher((path.equals("index")) ? "/index.jsp" : Constant.VIEW + "path" + Constant.JSP).
		RequestDispatcher rd = request.getRequestDispatcher(dispatcher);
		rd.forward(request, response);
	}
	
	public static void dir(HttpServletRequest request, 
			HttpServletResponse response, String letcmd, String letdir, String letpage) throws ServletException, IOException {
		System.out.println("커맨더 dir 으로 진입 ==");
		String cmd = request.getParameter("cmd");
		String dir = request.getParameter("dir");
		String page = request.getParameter("page");
		System.out.println("cmd :: "+cmd);
		System.out.println("dir :: "+dir);
		System.out.println("page :: "+page);
		if(page==null) {page="main";}
		System.out.println("2. page :: "+page);
		if(dir==null) {
			String sPath = request.getServletPath();
			System.out.println("1. sPath :::" + sPath);
			sPath = sPath.replace(".do","");
			System.out.println("2. sPath :::" + sPath);
			dir = sPath.substring(1);
			System.out.println("3. dir :: "+dir);
		}
		
		switch((cmd==null)? "move" : cmd) {
		case "move": 
			System.out.println("case = move,액션이 ="+cmd);
			Command.move(request, response, dir+"/"+page);
			break;
		}	
	}
}
