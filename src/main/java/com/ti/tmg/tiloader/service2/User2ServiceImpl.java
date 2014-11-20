/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ti.tmg.tiloader.service2;

import com.ti.tmg.tiloader.repository2.User2Dao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author rashedul.hasan.khan
 */
@Service(value="user2Service")
public class User2ServiceImpl implements User2Service{
    @Autowired
    private User2Dao user2Dao;
    public int insertUser(String firstName, String lastName, String userId, String password){
        return user2Dao.insertUser(firstName, lastName, userId, password);
    }
    
}
