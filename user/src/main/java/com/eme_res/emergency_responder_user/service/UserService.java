/*Developed by Ishan Jogalekar
*/
package com.eme_res.emergency_responder_user.service;
import com.eme_res.emergency_responder_user.model.User;
import org.springframework.data.domain.Page;
import java.util.List;

//Interface is used to hide main function to avoid SQL-Injection attacks

public interface UserService {
    List<User> getAllUser();
    void saveUser(User user);
    User getUserById(Long id);
    void deleteUserById(Long id);
    Page<User> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection);
}
