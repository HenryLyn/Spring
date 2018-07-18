package top.linhuarui.spring.entity;

import java.util.Date;

/**
* @author LHR
* @date 2018/7/18
* @desc Area entiry
*/
public class Area {
    private int area_id;
    private String area_name;
    private int priority;
    private Date create_time;
    private Date last_edit_time;

    public Area() {
    }

    public Area(int area_id, String area_name, int priority, Date create_time, Date last_edit_time) {
        this.area_id = area_id;
        this.area_name = area_name;
        this.priority = priority;
        this.create_time = create_time;
        this.last_edit_time = last_edit_time;
    }

    public int getArea_id() {
        return area_id;
    }

    public void setArea_id(int area_id) {
        this.area_id = area_id;
    }

    public String getArea_name() {
        return area_name;
    }

    public void setArea_name(String area_name) {
        this.area_name = area_name;
    }

    public int getPriority() {
        return priority;
    }

    public void setPriority(int priority) {
        this.priority = priority;
    }

    public Date getCreate_time() {
        return create_time;
    }

    public void setCreate_time(Date create_time) {
        this.create_time = create_time;
    }

    public Date getLast_edit_time() {
        return last_edit_time;
    }

    public void setLast_edit_time(Date last_edit_time) {
        this.last_edit_time = last_edit_time;
    }

    @Override
    public String toString() {
        return "Area{" +
                "area_id=" + area_id +
                ", area_name='" + area_name + '\'' +
                ", priority=" + priority +
                ", create_time=" + create_time +
                ", last_edit_time=" + last_edit_time +
                '}';
    }
}
