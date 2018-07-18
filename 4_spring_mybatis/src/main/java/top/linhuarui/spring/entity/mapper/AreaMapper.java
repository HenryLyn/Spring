package top.linhuarui.spring.entity.mapper;

import top.linhuarui.spring.entity.Area;

/**
* @author LHR
* @date 2018/7/18
* @desc area entity mapper
*/
public interface AreaMapper {

    /**
    * @author LHR
    * @date 2018/7/18
    * @desc get area from db.
    * @params [id]
    * @returns top.linhuarui.spring.entity.Area
    */
    public Area getArea (int id);

    /**
    * @author LHR
    * @date 2018/7/18
    * @desc insert area into db.
    * @params [area]
    * @returns int
    */
    public int insertArea (Area area);

    /**
    * @author LHR
    * @date 2018/7/18
    * @desc delete area from db.
    * @params [id]
    * @returns int
    */
    public int deleteArea (int id);
}
