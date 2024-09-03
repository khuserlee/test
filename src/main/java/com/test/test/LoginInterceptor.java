package com.test.test;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;

public class LoginInterceptor implements HandlerInterceptor {

	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		// 세션 확인
		HttpSession session = request.getSession(false);
		
		// 사용자 정보 확인
		boolean isValid = session != null
				&& ((UserDTO) session.getAttribute("user")) != null;

		if (isValid == false) {
			// 유효하지 않은 경우
			String url = request.getContextPath() + "/";
			response.sendRedirect(url);
			
			return false;
		}
		
		return true;
	}

}
