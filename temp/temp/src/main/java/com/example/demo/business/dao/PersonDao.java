package com.example.demo.business.dao;

import com.example.demo.business.entity.Person;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * 湖北金鹏信息技术有限公司 版权所有  Copyright 2018<br>
 *
 * @Description: <br>
 * @Project: hades <br>
 * @CreateDate: Created in 2019/7/10 22:30 <br>
 * @Author: chenx
 */
@Mapper
public interface PersonDao {
    @Select("select id,name,age from person")
    List<Person> getAll();
}
