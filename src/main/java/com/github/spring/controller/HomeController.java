package com.github.spring.controller;

import com.github.spring.pojo.User;
import com.github.spring.service.UserService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author guido
 */
@Controller
@RequestMapping(value = "/*")
public class HomeController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "/addUser", method = RequestMethod.GET)
    public ModelAndView addUser() {
        User user = new User();
        user.setUsername("your username");
        user.setPassword("your passsword");
        user.setEmail("your email");
        return new ModelAndView("addUser", "user", user);
    }
    
    @RequestMapping(value = "/saveUser", method = RequestMethod.POST)
    public ModelAndView saveColumn(User user) {
        ModelAndView mv = new ModelAndView("listUsers");
        try {
            userService.add(user);
            List<User> userLists = userService.getAllList();
            mv.addObject("userLists", userLists);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mv;
    }

}
