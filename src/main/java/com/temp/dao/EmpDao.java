package com.temp.dao;

import org.springframework.stereotype.Repository;

import com.temp.entity.Emp;

@Repository
public interface EmpDao {
	
   void insert(Emp emp);

}
