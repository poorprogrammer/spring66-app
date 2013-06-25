/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring66.tutorial.dao;

import com.spring66.toturial.entity.Users;
import java.util.List;

/**
 *
 * @author Phongsak
 */
public interface UserDao {
    public List<Users> listAllUsers();
    public Users getUserById(String userId);
    public void addUser(Users userInstance);
    
}
