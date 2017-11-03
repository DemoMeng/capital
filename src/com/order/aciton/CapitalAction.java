package com.order.aciton;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.capital.entity.Capital;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.order.service.CapitalService;

@Controller
@RequestMapping("/capital")
public class CapitalAction extends ActionSupport{
	
	@Autowired
	private CapitalService capitalService;
	
	@RequestMapping("/indexshow_json")
	public @ResponseBody Capital show(){
		System.out.println("capitalService:"+capitalService);
		Capital o = new Capital();
		o.setOrderId(123);
		o.setName("我的订单1");
		o.setPrice(555);
		return o;
	}

	
	@RequestMapping("/indexshow")
	public String index(Model model){
		List<Capital> capitalList = capitalService.getAllCapital();
		model.addAttribute("capitalList", capitalList);
		
		for (Capital c:capitalList){
			
			System.out.println("名字:"+c.getName());
		}
		
		return "index";
	}

	//把list整个返回到jsp，前端页面就是一个json对象
	@RequestMapping("/indexshow")
	public @ResponseBody List<Capital> index(Model model){
		List<Capital> capitalList = capitalService.getAllCapital();
		model.addAttribute("capitalList", capitalList);
		
		for (Capital c:capitalList){
			
			System.out.println("名字:"+c.getName());
		}
		
		return capitalList;
	}	



}
