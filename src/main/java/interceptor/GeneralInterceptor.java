package interceptor;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;


@Component
public class GeneralInterceptor implements HandlerInterceptor  {
	
	
		private Logger Log = LoggerFactory.getLogger(GeneralInterceptor.class);
	
	   @Override
	   public boolean preHandle(
	      HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
	      System.out.println("Pre handle invoked...{}..{}");
		   Log.info("Pre handle invoked...{}..{}"+request.getRequestURI()+request.getMethod());
	      return true;
	   }
	   @Override
	   public void postHandle(
	      HttpServletRequest request, HttpServletResponse response, Object handler, 
	      ModelAndView modelAndView) throws Exception {
		   Log.info("Post handle invoked...{}..{}"+request.getRequestURI()+request.getMethod());
	   }
	   
	   @Override
	   public void afterCompletion(HttpServletRequest request, HttpServletResponse response, 
	      Object handler, Exception ex) throws Exception {
		   
		   if(ex!=null) {
			   Log.error("Exception inside after completion "+ ex.getMessage());
		   }
		   Log.info("AfterCompletion handle invoked...{}..{}"+request.getRequestURI()+request.getMethod());
	   }
}
