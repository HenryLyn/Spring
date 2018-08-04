package top.linhuarui.spring.dao;

import org.apache.ibatis.annotations.*;
import top.linhuarui.spring.entity.User;

/**
* @author LHR
* @date 2018/8/1
* @desc user dao
*/
@Mapper
public interface UserDao {

    @Select("SELECT * FROM `user` WHERE id = #{id}")
    @Results(
            id = "userBasic",
            value = {
                    @Result(property = "id", column = "id"),
                    @Result(property = "nickName", column = "nick_name"),
                    @Result(property = "addressId", column = "address_id")
            }
    )
    User findUserBasicInfoById (Long id);

    @Select("SELECT * FROM `user` WHERE id = #{id}")
    @Results(value = {
            @Result(property = "id", column = "id"),
            @Result(property = "nickName", column = "nick_name"),
            @Result(property = "addressId", column = "address_id"),
            @Result(property = "address",
                    column = "address_id",
                    one = @One(select = "top.linhuarui.spring.dao.AddressDao.findAddressById"))
        })
    User findUserWithAddress (Long id);

    @Select("SELECT * FROM `user` WHERE id = #{id}")
    @Results(id = "userWithCar",
            value = {
                @Result(property = "id", column = "id"),
                @Result(property = "nickName", column = "nick_name"),
                @Result(property = "addressId", column = "address_id"),
                @Result(
                        property = "cars",
                        column = "id",
                        many = @Many(select = "top.linhuarui.spring.dao.CarDao.findCarByUserId")
                )
            })
    User findUserWithCar (Long id);

    @Select("SELECT * FROM `user` WHERE id = #{id}")
    @Results({
            @Result(property = "id", column = "id"),
            @Result(property = "nickName", column = "nick_name"),
            @Result(property = "addressId", column = "address_id"),
            @Result(
                    property = "address",
                    column = "address_id",
                    one = @One(select = "top.linhuarui.spring.dao.AddressDao.findAddressById")
            ),
            @Result(
                    property = "cars",
                    column = "id",
                    many = @Many(select = "top.linhuarui.spring.dao.CarDao.findCarByUserId")
            )
    })
    User findUserAllInfoById (Long id);
}
