package com.temp.manager;

import java.io.IOException;
import java.io.RandomAccessFile;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.temp.dao.EmpDao;
import com.temp.entity.Emp;
import com.temp.exception.ExceptionLogger;


@Service
@Transactional
public class EmpManagerImpl implements EmpManager{

    @Resource
	private EmpDao empDao;
	

	public void insert(Emp emp) throws ExceptionLogger{
		try{
			empDao.insert(emp);			
		}catch(Exception e){
			throw new ExceptionLogger("插入数据重复");
		}
	}

	
	private void logger(String message){
		RandomAccessFile randomFile = null;
		try {
			 randomFile = new RandomAccessFile("E:/1.txt", "rw");
             // 文件长度，字节数
             long fileLength = randomFile.length();
             //将写文件指针移到文件尾。
             randomFile.seek(fileLength);
             randomFile.writeBytes(message+"/n");
             randomFile.close();			
		} catch (IOException e) {
			e.printStackTrace();
		}finally{
			try {
				randomFile.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
}
