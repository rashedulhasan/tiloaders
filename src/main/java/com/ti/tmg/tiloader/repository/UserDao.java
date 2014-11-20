/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ti.tmg.tiloader.repository;

import java.util.List;
import com.ti.tmg.tiloader.domain.User;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rashedul.hasan.khan
 */
@Repository
public interface UserDao {    
    List<User> getAllUsers();
    
}
