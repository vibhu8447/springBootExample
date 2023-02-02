
package com.vibhu.demo.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.vibhu.demo.interceptor.GeneralInterceptor;


//@Configuration
@Component
public class interceptorConfig  implements WebMvcConfigurer {

	@Autowired
	GeneralInterceptor generalInterceptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {

//	      registry.addInterceptor(generalInterceptor).addPathPatterns("/student/**");
//	      registry.addInterceptor(generalInterceptor).addPathPatterns("/course/**");
	      registry.addInterceptor(generalInterceptor).addPathPatterns("/**");
//	      registry.addInterceptor(generalInterceptor);
	      
	   }
}
