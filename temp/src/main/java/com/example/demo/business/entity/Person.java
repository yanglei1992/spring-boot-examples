package com.example.demo.business.entity;

/**
 * 湖北金鹏信息技术有限公司 版权所有 Copyright 2018<br>
 *
 * @Description: <br>
 * @Project: hades <br>
 * @CreateDate: Created in 2019/7/10 22:28 <br>
 * @Author: chenx
 */
public class Person {
	private Integer id;
	private String name;
	private Integer age;

	public Person() {
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
