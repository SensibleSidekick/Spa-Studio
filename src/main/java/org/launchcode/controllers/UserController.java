package org.launchcode.controllers;


import ch.qos.logback.core.model.Model;
import org.launchcode.models.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("user")
@ResponseBody
public class UserController {

    @GetMapping("/user/add")
    public String displayAddUserForm() {
        return "resources/templates/user/add.html";
    }

    public String processAddUserForm(Model model, @ModelAttribute User user, String verify) {
        return ":P";
    }



}
