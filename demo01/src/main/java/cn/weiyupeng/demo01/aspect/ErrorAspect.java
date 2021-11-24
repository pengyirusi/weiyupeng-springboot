package cn.weiyupeng.demo01.aspect;

import cn.weiyupeng.demo01.controllers.ErrorController;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weiyupeng
 * @create 2021/11/24 14:57
 */
@Aspect
@Component
@RestController
public class ErrorAspect {
    @AfterThrowing("cn.weiyupeng.demo01.controllers.HomeController.home()")
    public String getError() {
        System.out.println("error page");
        return new ErrorController().errorPage();
    }
}
