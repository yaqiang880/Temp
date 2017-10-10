package com.temp.service;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.temp.entity.Emp;
import com.temp.entity.EmpResult;
import com.temp.exception.ExceptionLogger;
import com.temp.manager.EmpManager;

@Service
public class EmpServiceImpl implements EmpService{

	@Resource
	private EmpManager empManager;
	
	@Override
	public EmpResult addEmp(String name) {
		EmpResult result = new EmpResult();
		Emp emp = new Emp();
		emp.setName(name);
		try {
			empManager.insert(emp);
			result.setStatus(0);
			result.setMsg("保存成功");
			result.setData(emp.getName());
			System.out.println("service");
			return result;
		} catch (ExceptionLogger e) {
			e.printStackTrace();
			result.setStatus(0);
			result.setMsg("保存失败");
			result.setData(emp.getName());
			System.out.println("service");
			return result;
		}		
		
	}

}
