package cn.weiyupeng.demo01.controllers;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weiyupeng
 * @create 2021/11/24 11:28
 */
@RequestMapping("")
@RestController
public class HomeController {
    @GetMapping("")
    @Pointcut("execution(public * cn.weiyupeng.demo01.controllers.HomeController.home())")
    public String home() throws Exception {
        throw new Exception();
        //return "hello weiyupeng!";
    }
}
