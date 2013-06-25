/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring66.tutorial.dao.impl;

import com.spring66.toturial.entity.Users;
import com.spring66.tutorial.dao.UserDao;
import java.util.List;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

/**
 *
 * @author Phongsak
 */
public class UserDaoImpl extends SqlMapClientDaoSupport implements UserDao {

    public List<Users> listAllUsers() {
        SqlMapClientTemplate template = getSqlMapClientTemplate();
        List<Users> users = template.queryForList("selectAllUser");
        return users;
    }

    public Users getUserById(String userId) {
        SqlMapClientTemplate template = getSqlMapClientTemplate();
        return (Users) template.queryForObject("getUserById", userId);
    }

    public void addUser(Users userInstance) {
        getSqlMapClientTemplate().insert("insertUser", userInstance);
    }
}
