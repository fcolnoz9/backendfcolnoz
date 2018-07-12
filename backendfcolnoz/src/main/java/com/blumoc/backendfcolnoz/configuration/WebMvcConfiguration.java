package com.blumoc.backendfcolnoz.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.blumoc.backendfcolnoz.component.RequestTimeIntercertor;

@Configuration
public class WebMvcConfiguration implements WebMvcConfigurer{
	
	@Autowired
	@Qualifier("requestTimeInterceptor")
	private RequestTimeIntercertor rti;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// TODO Auto-generated method stub
		registry.addInterceptor(rti);
		
	}

	
}
