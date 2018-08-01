package top.linhuarui.spring.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import top.linhuarui.spring.entity.Address;

/**
* @author LHR
* @date 2018/8/1
* @desc address dao
*/
@Mapper
public interface AddressDao {

    @Select("SELECT * FROM `address` WHERE id = #{id}")
    Address findAddressById(Long id);

}
