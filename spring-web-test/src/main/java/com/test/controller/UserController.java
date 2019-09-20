package com.test.controller;


import com.test.model.User;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;


import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

public class UserController extends AbstractController {


    @Override
    protected ModelAndView handleRequestInternal(HttpServletRequest request, HttpServletResponse response) throws Exception {
        List<User> lists = new ArrayList<>();
        User usera = new User();
        User userb = new User();

        usera.setUsername("zhangsan");
        usera.setAge(11);

        userb.setUsername("lisi");
        userb.setAge(12);

        lists.add(usera);
        lists.add(userb);

        return new ModelAndView("userlist","users", lists);
    }
}
