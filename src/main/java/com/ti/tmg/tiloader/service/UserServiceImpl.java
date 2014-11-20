/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ti.tmg.tiloader.service;

import com.ti.tmg.tiloader.domain.User;
import com.ti.tmg.tiloader.repository.UserDao;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rashedul.hasan.khan
 */
@Service(value="userService")
public class UserServiceImpl implements UserService{
    @Autowired
    private UserDao userDao;
    public List<User> getAllUsers(){
        return userDao.getAllUsers();
    }
    
}
