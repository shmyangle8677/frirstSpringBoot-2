package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {
	
	@RequestMapping("/str")
	@ResponseBody
	/*HttpservletRequest对象：
	 * 1、凡是通过HTTP协议访问服务器的，都会有这个对象。
	 * 2、HTTP请求头的所有信息都封装在这个对象中	
	*/
	public String str(HttpServletRequest request) {
		System.out.println(request.getParameter("name")+
				"::"+request.getParameter("age"));
		return "你好，中国";
	}
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
}
