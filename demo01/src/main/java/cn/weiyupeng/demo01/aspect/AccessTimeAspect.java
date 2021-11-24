package cn.weiyupeng.demo01.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * @author weiyupeng
 * @create 2021/11/24 11:37
 */
@Aspect
@Component
public class AccessTimeAspect {
    @Before("cn.weiyupeng.demo01.controllers.HomeController.home()")
    public void before(JoinPoint joinPoint) {
        System.out.println("start to request home()");
        System.out.println(joinPoint.toLongString());
    }
}
