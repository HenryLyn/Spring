package top.linhuarui.spring.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.linhuarui.spring.entity.Car;

import java.util.List;

/**
* @author LHR
* @date 2018/8/1
* @desc car dao
*/
@Mapper
public interface CarDao {

    @Select("SELECT * FROM `car` WHERE user_id = #{userId}")
    List<Car> findCarByUserId (Long userId);

}
