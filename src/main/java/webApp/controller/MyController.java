package webApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyController {

//    @RequestMapping("/")
//    public String showRootView() {
//        return "myView"; // возвращает myView.html для корневого пути
//    }
    @RequestMapping("/view")
    public String showView() { // возвращает myView.html для /view
        return "myView";
    }

}

