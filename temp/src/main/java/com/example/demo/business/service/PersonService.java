package com.example.demo.business.service;

import com.example.demo.business.dao.PersonDao;
import com.example.demo.business.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 湖北金鹏信息技术有限公司 版权所有 Copyright 2018<br>
 *
 * @Description: <br>
 * @Project: hades <br>
 * @CreateDate: Created in 2019/7/10 22:33 <br>
 * @Author: chenx
 */
@Service
public class PersonService {
	@Autowired
	PersonDao personDao;

	public List<Person> getAll() {
		List<Person> list = personDao.getAll();
		return list;
	}
}
