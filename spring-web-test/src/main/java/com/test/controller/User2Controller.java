package com.test.controller;

import com.test.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@Controller
public class User2Controller {

    @GetMapping({"/rest.htm", "/re.htm"})
    public String rest() {
        Map<String, String> data = new HashMap<>(2);
        data.put("haha", "hehe");
        return  "list.html";
    }



    @PostMapping("/rest2.htm")
    @ResponseBody
    public Map<String, String> rest2(@RequestBody User user) {
        Map<String, String> data = new HashMap<>(2);
        data.put("haha", user.getUsername());
        data.put("haha2", user.getAge()+"");
        return  data;
    }
}
