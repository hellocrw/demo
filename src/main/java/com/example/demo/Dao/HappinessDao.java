package com.example.demo.Dao;

import com.example.demo.domain.Happiness;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface HappinessDao {
    @Select(("select * from happiness where city =#{city}"))
    Happiness findHappinessByCity(@Param("city") String city);

    @Insert("insert into happiness(id,city,num) values(#{id},#{city},#{num})")
    int insertHappiness(@Param("id") int id, @Param("city") String city, @Param("num") Integer num);
}
