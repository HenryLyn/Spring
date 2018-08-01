package top.linhuarui.spring.entity;

/**
* @author LHR
* @date 2018/8/1
* @desc car entity
*/
public class Car {
    private Long id;
    private String color;
    private String name;
    //用户id
    private Long userId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
