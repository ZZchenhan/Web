package com.ch.controller;

import com.ch.entity.AccountEntity;
import com.ch.service.AccountService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 86936
 * Date: 2017-08-15
 * Time: 14:15
 */
@Controller
@RequestMapping("/account")
public class AccountController {
    @Resource
    AccountService accountService;
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public String login(HttpServletRequest httpServletRequest, Model model){
        AccountEntity accountEntity = accountService.selectByName(httpServletRequest.getParameter("userName"));
        if(accountEntity == null){
            model.addAttribute("result","用户不存在");
        }else if(accountEntity.getPsw().equals(httpServletRequest.getParameter("passWorld"))){
            model.addAttribute("result","登陆成功");
        }else{
            model.addAttribute("result","密码错误");
        }
        return "result";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(HttpServletRequest httpServletRequest, Model model){
        AccountEntity accountEntity = new AccountEntity();
        accountEntity.setUserName(httpServletRequest.getParameter("userName"));
        accountEntity.setPsw(httpServletRequest.getParameter("psw"));
        accountEntity.setEmail(httpServletRequest.getParameter("email"));
        accountEntity.setMobile(httpServletRequest.getParameter("mobile"));
        try {
            if (accountService.insert(accountEntity) == 1) {
                model.addAttribute("result", "新增用户成功");
            }else{
                model.addAttribute("result", "新增失败");
            }
            return "result";
        }catch (Exception e){
            model.addAttribute("result", "新增失败");
            return "result";
        }
    }
}
