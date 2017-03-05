package controller;

import model.UserModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import service.testService.UserService;

/**
 * Created by user on 2017/3/5.
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("HelloWord")
    public void insertUser(UserModel userModel)
    {
        userService.insertUser(userModel);
    }
}
