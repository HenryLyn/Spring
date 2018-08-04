package top.linhuarui.spring.entity;

import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
* @author LHR
* @date 2018/8/1
* @desc user entity
*/
public class User {

    private Long id;
    private  String nickName;

    //地址信息，和用户是一对一的关系
    private Address address;
    //地址id
    private Long addressId;
    //用户拥有的车，和用户是一对多的关系
    private List<Car> cars;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Long getAddressId() {
        return addressId;
    }

    public void setAddressId(Long addressId) {
        this.addressId = addressId;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }


    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", nickName='" + nickName + '\'' +
                ", address=" + (null == address ? "null" : address.toString()) +
                ", addressId=" + addressId +
                ", cars=" + (null == cars ? "null" : cars.size()) +
                '}';
    }
}
