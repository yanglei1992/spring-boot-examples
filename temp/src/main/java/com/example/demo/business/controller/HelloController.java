package com.example.demo.business.controller;

import com.example.demo.business.entity.Person;
import com.example.demo.business.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 湖北金鹏信息技术有限公司 版权所有 Copyright 2018<br>
 *
 * @Description: <br>
 * @Project: hades <br>
 * @CreateDate: Created in 2019/7/9 15:54 <br>
 * @Author: chenx
 */
//@Api(value = "/device", tags = "设备管理服务模块")
/*
 * @RestController
 * 
 * @RequestMapping("/hello")
 * 
 * @CrossOrigin public class HelloController {
 * 
 * @Autowired PersonService personService;
 * 
 * @RequestMapping(value = "/sync", method = RequestMethod.GET) public Object
 * sync() { List<Person> list = personService.getAll(); return list; } }
 */