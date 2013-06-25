/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring66.tutorial.dao;

import com.spring66.toturial.entity.Users;
import com.spring66.tutorial.HelloWorld;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.test.AbstractDependencyInjectionSpringContextTests;

/**
 *
 * @author Phongsak
 */
public class UserDaoTest extends AbstractDependencyInjectionSpringContextTests {

    @Override
    protected String[] getConfigLocations() {
        setAutowireMode(AUTOWIRE_BY_NAME);
        return new String[]{
                    "classpath:/applicationContext.xml"
                //  "classpath*:/applicationContext.xml", // for modular projects
                // "classpath:**/applicationContext*.xml" // for web projects
                };
    }

    public void testLoadBean() {
        UserDao userDao = (UserDao) super.applicationContext.getBean("userDao");
        assertNotNull(userDao);
    }

    public void testListAllUsers() {
        UserDao userDao = (UserDao) super.applicationContext.getBean("userDao");
        List users = userDao.listAllUsers();
        assertNotNull(users);
        assertEquals(ArrayList.class.toString(), users.getClass().toString());
        assertNotSame(0, users.size());
        assertEquals(2, users.size());

    }

    public void testGetUserById() {
        UserDao userDao = (UserDao) super.applicationContext.getBean("userDao");
        Users user = userDao.getUserById("1");
        assertNotNull(user);
        assertEquals(user.getUsrId(), "1");
        assertEquals("user1", user.getUsrName());

    }

    public void testAddUser() {
        UserDao userDao = (UserDao) super.applicationContext.getBean("userDao");
        int usersSize = userDao.listAllUsers().size();
        Users user = new Users();
        user.setUsrId("123");
        user.setUsrName("user123");
        user.setUsrLevel(2);
        user.setUsrPwd("password");
        user.setUsrFirstLogin(new Date());
        user.setLogDate(new Date());
        user.setRegDate(new Date());
        assertNotNull(user);
        userDao.addUser(user);
        List<Users> users = userDao.listAllUsers();
        assertEquals(users.size(), usersSize + 1);

    }
}
