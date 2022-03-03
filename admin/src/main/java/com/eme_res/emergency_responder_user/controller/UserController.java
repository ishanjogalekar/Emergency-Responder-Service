/*
Developed by Ishan Jogalekar
 */
package com.eme_res.emergency_responder_user.controller;

import com.eme_res.emergency_responder_user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import com.eme_res.emergency_responder_user.model.User;
import java.util.List;

//Controlling webpages with Java Spring backend
@Controller
public class UserController {
    @Autowired
    private UserService userService;

    //Display list of employees
    @GetMapping("/")
    public String viewHomePage(Model model) {
        // default page is 1
        return findPaginated(1, "RName", "asc", model);
    }

    @GetMapping("/showNewUserForm")
    public String showNewUserForm(Model model) {
        User user = new User();
        model.addAttribute("user", user);
        return "new_emergency";
    }

    @PostMapping("/saveUser")
    public String saveUser(@ModelAttribute("user") User user) {
        userService.saveUser(user);
        return "redirect:/";
    }
    @GetMapping("/showUserFormUpdate/{id}")
    public String showUserFormUpdate(@PathVariable(value = "id") Long id, Model model) {
        User user = userService.getUserById(id);
        model.addAttribute("user", user);
        return "update_user";
    }

    @GetMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable(value = "id") Long id) {
        this.userService.deleteUserById(id);
        return "redirect:/";
    }


    @GetMapping("/page/{pageNo}")
    public String findPaginated(@PathVariable(value = "pageNo") int pageNo,
                                @RequestParam(value = "sortField") String sortField, @RequestParam(value = "sortDir") String sortDir,
                                Model model) {
        int pageSize = 10;
        Page<User> page = userService.findPaginated(pageNo, pageSize, sortField, sortDir);
        List<User> listUser = page.getContent();

        model.addAttribute("currentPage", pageNo);
        model.addAttribute("totalPages", page.getTotalPages());
        model.addAttribute("totalItems", page.getTotalElements());
        model.addAttribute("sortField", sortField);
        model.addAttribute("sortDir", sortDir);
        model.addAttribute("reverseSortDir", sortDir.equals("asc") ? "desc" : "asc");
        model.addAttribute("listUser", listUser);
        return "index";
    }
}
