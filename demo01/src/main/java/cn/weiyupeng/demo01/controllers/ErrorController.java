package cn.weiyupeng.demo01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author weiyupeng
 * @create 2021/11/24 15:05
 */
@RestController
public class ErrorController {
    @GetMapping("/error")
    public String errorPage() {
        return "error page";
    }
}
