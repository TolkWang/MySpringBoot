package com.company.project.web;

import com.company.project.core.Result;
import com.company.project.core.ResultGenerator;
import com.company.project.model.User;
import com.company.project.service.UserService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by CodeGenerator on 2020/04/15.
 */
@RestController
@RequestMapping("/user")
public class UserController {
    @Resource
    private UserService userService;

    @PostMapping("/saveNow")
    public Result saveNow(@RequestBody User user) {
        userService.saveNow(user);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/insert")
    public Result add(@RequestBody User user) {
        userService.save(user);
        return ResultGenerator.genSuccessResult();
    }

    @PostMapping("/insertMultiple")
    public Result addMultiple(@RequestBody List<User> user) {
        userService.save(user);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/delete/{id}")
    public Result delete(@PathVariable Integer id) {
        userService.deleteById(id);
        return ResultGenerator.genSuccessResult();
    }

    @DeleteMapping("/deleteMultiple/{ids}")
    public Result deleteMultiple(@PathVariable String ids) {
        userService.deleteByIds(ids);
        return ResultGenerator.genSuccessResult();
    }

    @PutMapping("/update")
    public Result update(@RequestBody User user) {
        userService.update(user);
        return ResultGenerator.genSuccessResult();
    }

    @GetMapping("/findById/{id}")
    public Result detail(@PathVariable Integer id) {
        User user = userService.findById(id);
        return ResultGenerator.genSuccessResult(user);
    }

    @GetMapping("/getAll")
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<User> list = userService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }

    @GetMapping("/selectByNameAndSex")
    public Result selectByNameAndSex(@RequestParam(defaultValue = "") String name, @RequestParam(defaultValue = "1") Integer sex) {
        List<User> list = userService.selectByNameAndSex(name, sex);
        return ResultGenerator.genSuccessResult(list);
    }

    @GetMapping("/count")
    public Result count() {
        int count = userService.count();
        return ResultGenerator.genSuccessResult(count);
    }

    @GetMapping("/findNameById")
    public Result findNameById(@RequestParam(defaultValue = "0") int id) {
        return ResultGenerator.genSuccessResult(userService.findNameById(id));
    }

    @GetMapping("/queryUserClassroom")
    public Result queryUserClassroom() {
        return ResultGenerator.genSuccessResult(userService.queryUserClassroom());
    }

    @GetMapping("/queryTest")
    public Result queryOrder() {
        return ResultGenerator.genSuccessResult(userService.getUser3());
    }

    @RequestMapping("/login")
    public String login(String username, String password, Model model){
        //获取当前用户
        Subject subject = SecurityUtils.getSubject();
        //封装用户登录数据
        UsernamePasswordToken token = new UsernamePasswordToken(username,password);
        try{
            subject.login(token);
            return "登录成功";
        }catch (UnknownAccountException e){//用户名不存在
            model.addAttribute("msg","用户名错误");
            return "用户名错误";
        }catch (IncorrectCredentialsException e){
            model.addAttribute("msg","密码错误");
            return "密码错误";
        }
    }

    @GetMapping("/noauth")
    public String unauthorized(){
        return "未授权";
    }
}
