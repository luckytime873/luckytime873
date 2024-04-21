package com.guimei.zyh.filter;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/***
 * 作者：朱宇欢
 */
public class LoginFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest req, ServletResponse res,
						 FilterChain chain) throws IOException, ServletException {
		req.setCharacterEncoding("utf-8");
		res.setCharacterEncoding("utf-8");
		HttpServletRequest request=(HttpServletRequest)req;
		HttpServletResponse response=(HttpServletResponse)res;
		HttpSession session = request.getSession();
		if(session.getAttribute("status")==null){
			req.getRequestDispatcher("./pages/register.jsp");
			
		}else{
			chain.doFilter(request, response);
		}

	}
	public void init(FilterConfig arg0) throws ServletException {

	}

}
