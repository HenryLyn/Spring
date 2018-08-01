package top.linhuarui.spring.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import top.linhuarui.spring.entity.User;


@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class UserDaoTest {

    @Autowired(required = true)
    private UserDao userDao;

    @Test
    public void findUserBasicInfoById() {
        User user = userDao.findUserBasicInfoById(1L);
        System.out.println(user.toString());
    }

    @Test
    public void findUserWithAddress() {
        User user = userDao.findUserWithAddress(2L);
        System.out.println(user.toString());
    }

    @Test
    public void findUserWithCar() {
        User user = userDao.findUserWithCar(3L);
        System.out.println(user.toString());
    }

    @Test
    public void findUserAllInfoById() {

        User user = userDao.findUserAllInfoById(4L);
        System.out.println(user.toString());
    }
}