package com.husbandry.struggle.controller.husbandry.dao;


import com.husbandry.struggle.controller.husbandry.model.entity.Test;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.context.annotation.Bean;


import java.util.List;

@Mapper
public interface TestDao {
   // @Select("select id, name, age, time, version from wt_java_test")
    List<Test> getData();

    Test getDataById(Integer id);

    int upDate(Test info);
}