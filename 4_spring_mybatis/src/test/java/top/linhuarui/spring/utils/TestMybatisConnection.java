package top.linhuarui.spring.utils;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.BlockJUnit4ClassRunner;
import top.linhuarui.spring.entity.Area;
import top.linhuarui.spring.entity.mapper.AreaMapper;

/**
* @author LHR
* @date 2018/7/18
* @desc test mybatis connection settings.
*/
@RunWith(BlockJUnit4ClassRunner.class)
public class TestMybatisConnection {

    @Test
    public void testGetArea () {
        SqlSession sqlSession = null;
        try {
            sqlSession = MybatisUtils.openSqlSession();
            AreaMapper areaMapper = sqlSession.getMapper(AreaMapper.class);
            Area area = areaMapper.getArea(11);
            System.out.println(area.toString());
            sqlSession.commit();
        } catch (Exception e) {
            e.printStackTrace();
            sqlSession.rollback();
        } finally {
            if (sqlSession != null) {
                sqlSession.close();
            }
        }
    }

}
