package com.qztc.demo.controller;

import io.swagger.annotations.Api;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author wangxl
 * @ClassName HomeController
 * @Description TODO
 * @date 2019/9/7 9:38
 * @Version 1.0
 */
@Api(tags = "首页接口")
@RequestMapping("/home")
@Controller
public class HomeController {

  @GetMapping("/index")
  public String toIndex(){
    return "/index";
  }
}
