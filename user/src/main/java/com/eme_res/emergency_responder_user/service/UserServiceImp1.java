/*
Developed by Ishan Jogalekar
 */
package com.eme_res.emergency_responder_user.service;

import com.eme_res.emergency_responder_user.repository.UserRepository;
import com.eme_res.emergency_responder_user.model.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

//Creating Spring service with PWA (Progressive web app)
@Service
public class UserServiceImp1 implements UserService {
    @Autowired
    private UserRepository userRepository;
    @Override
    public List<User> getAllUser() {
        // TODO Auto-generated method stub
        return userRepository.findAll();
    }

    @Override
    public void saveUser(User user) {
        // TODO Auto-generated method stub
        this.userRepository.save(user);

    }

    @Override
    public User getUserById(Long id) {
        // TODO Auto-generated method stub
        Optional<User> optional = userRepository.findById(id);
        User user = null;
        if (optional.isPresent()) {
            user = optional.get();
        } else {
            throw new RuntimeException("User not found by id: " + id);
        }
        return user;
    }

    @Override
    public void deleteUserById(Long id) {
        // TODO Auto-generated method stub
        this.userRepository.deleteById(id);
    }

    @Override
    public Page<User> findPaginated(int pageNo, int pageSize, String sortField, String sortDirection) {
        // TODO Auto-generated method stub
        Sort sort = sortDirection.equalsIgnoreCase(Sort.Direction.ASC.name()) ? Sort.by(sortField).ascending()
                : Sort.by(sortField).descending();
        Pageable pageable = PageRequest.of(pageNo - 1, pageSize, sort);
        return this.userRepository.findAll(pageable);
    }
}
