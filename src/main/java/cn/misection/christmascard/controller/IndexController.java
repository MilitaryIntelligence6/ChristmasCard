package cn.misection.christmascard.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Military Intelligence 6 root
 * @version 1.0.0
 * @ClassName IndexController
 * @Description TODO
 * @CreateTime 2021年12月24日 13:48:00
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String index() {
        return "index";
    }
}
