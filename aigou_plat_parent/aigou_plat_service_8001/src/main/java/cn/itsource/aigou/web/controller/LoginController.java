package cn.itsource.aigou.web.controller;

import cn.itsource.aigou.domain.Employee;
import cn.itsource.aigou.util.AjaxResult;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {
    @RequestMapping(value = "/login" ,method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        if("dzc".equals(employee.getUsername())&&"123456".equals(employee.getPassword())){
            return AjaxResult.me();
        }else {
            return AjaxResult.me().setSuccsee(false).setMasg("错误操作");
        }
    }
    @RequestMapping(value = "/lget",method = RequestMethod.GET)
    public AjaxResult login2(){

        return AjaxResult.me();
    }
}
