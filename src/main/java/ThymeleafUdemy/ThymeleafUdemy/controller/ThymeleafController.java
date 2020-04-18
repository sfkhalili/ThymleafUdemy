package ThymeleafUdemy.ThymeleafUdemy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Date;

@Controller
public class ThymeleafController {

    @GetMapping("/test")
    public String getHello(){
       return "Time in the server is"+" "+new Date();

    }

    @GetMapping("/getTime")
    public String getTime(Model model){

        model.addAttribute("date", new Date());//date is the rabete between ui and server
        return "getTime";
    }

    //http://localhost:9080/getTimeCss
    @GetMapping("/getTimeCss")
    public String getTimeCss(Model model){

        model.addAttribute("date", new Date());//date is the rabete between ui and server
        return "getTimeCss";
    }
}
