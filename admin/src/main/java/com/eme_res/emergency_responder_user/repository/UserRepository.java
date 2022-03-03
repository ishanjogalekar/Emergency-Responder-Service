/*
Developed by Ishan Jogalekar
 */
package com.eme_res.emergency_responder_user.repository;

import com.eme_res.emergency_responder_user.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

// JPA repository with POJO class to hide data in Encapsulation to database
@Repository
public interface UserRepository extends JpaRepository<User, Long>{
}