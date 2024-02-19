package springMVCScheduled.conponents.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import springMVCScheduled.conponents.service.UtilServices;

@Controller
@Slf4j
public class MainController {
    private final UtilServices utilServices;

    public MainController(UtilServices utilServices) {
        this.utilServices = utilServices;

        var s = "MainController bean created";
        log.info(s);
        System.out.println(s);
    }


    @RequestMapping(path = "/main.do")
    public String mainPage() {
        var s = "mainPage method is running";
        log.info(s);
        System.out.println(s);
        return "main.jsp";
    }

    @RequestMapping(path = "/")
    public String rootPage() {
        var s = "rootPage method is running";
        log.info(s);
        System.out.println(s);
        return "redirect:/";
    }
}
