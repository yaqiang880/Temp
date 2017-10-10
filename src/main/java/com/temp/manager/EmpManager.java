package com.temp.manager;

import com.temp.entity.Emp;
import com.temp.exception.ExceptionLogger;

public interface EmpManager {

	 void insert(Emp emp)throws ExceptionLogger;
	
}
