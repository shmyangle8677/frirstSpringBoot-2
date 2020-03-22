package com.example.demo.controller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.example.demo.service.PersonService;

@Controller
public class IndexController {
	@Autowired
	private PersonService personService;
	/*HttpservletRequest对象：
	 * 1、凡是通过HTTP协议访问服务器的，都会有这个对象。
	 * 2、HTTP请求头的所有信息都封装在这个对象中	
	*/
	@RequestMapping("/str")
	@ResponseBody
	public String str(HttpServletRequest request) {
		System.out.println(request.getParameter("name")+
				"::"+request.getParameter("age"));
		return "你好，中国";
	}
	
	@RequestMapping("/index")
	public String index() {
		return "index";
	}
	
	@RequestMapping("/str2")	
	public String str2(HttpServletRequest request,Map<String,Object> map) {
		map.put("mail", "xyl@163.com");
		map.put("personObj", personService.persionXx());
		return "index2";
	}
	
	@ResponseBody
	@RequestMapping("/str3")	
	public Object str3(HttpServletRequest request,Map<String,Object> map) {
		return personService.persionXx();
	}
}
