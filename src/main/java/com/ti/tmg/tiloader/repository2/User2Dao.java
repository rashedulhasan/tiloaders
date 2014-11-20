/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ti.tmg.tiloader.repository2;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author rashedul.hasan.khan
 */
@Repository
public interface User2Dao {    
    int insertUser(@Param("firstName") String firstName, @Param("lastName") String lastName, @Param("userId") String userId, @Param("password") String password);    
}
