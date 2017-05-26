package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import pojo.TbCanteenWorker;
import service.canteenWorkerService.CanteenWorkerService;

/**
 * Created by user on 2017/5/22.
 */
@Controller
@RequestMapping("/canteenWorker")
public class CanteenWorkerController {

    @Autowired
    private CanteenWorkerService canteenWorkerService;

    @RequestMapping("/signUp")
    public @ResponseBody String SignUp(String phone,String password,String address){

        if(canteenWorkerService.signUp(phone,password,address))
            return "success";
        else
            return "failed";
    }

    @RequestMapping("/signIn")
    public @ResponseBody
    TbCanteenWorker SignIn(String phone,String password){
        TbCanteenWorker canteenWorker=canteenWorkerService.signIn(phone,password);
        return canteenWorker;
    }

    @RequestMapping("/add")
    public @ResponseBody String add(String cwid,String studentNumber){
        canteenWorkerService.add(cwid,studentNumber);
        return "success";
    }

    @RequestMapping("/confirm")
    public @ResponseBody String confirm(String studentNumber){
        canteenWorkerService.confrim(studentNumber);
        return "success";
    }
}
