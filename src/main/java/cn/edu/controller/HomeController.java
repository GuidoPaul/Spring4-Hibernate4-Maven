package cn.edu.controller;

import cn.edu.model.dao.UserDAO;
import cn.edu.model.pojo.User;
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
public class HomeController {

    @Autowired
    private UserDAO userDAO;

    @RequestMapping(value = "/home.htm", method = RequestMethod.GET)
    public ModelAndView home() {
        ModelAndView mv = new ModelAndView("home");

        try {
            List<User> listUsers = userDAO.list();
            mv.addObject("userList", listUsers);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return mv;
    }

}
