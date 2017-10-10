package com.temp.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.temp.entity.EmpResult;
import com.temp.service.EmpService;

@Controller
@RequestMapping("/temp")
public class AddEmpController {
    @Resource	
	private EmpService empService; 
	
    @RequestMapping("/addtemp.do")
    @ResponseBody
    public EmpResult execute(String name){
    	return empService.addEmp(name);  	
    }
    
}
