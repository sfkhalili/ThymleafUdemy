package ThymeleafUdemy.ThymeleafUdemy.controller;

import ThymeleafUdemy.ThymeleafUdemy.entity.Student;
import ThymeleafUdemy.ThymeleafUdemy.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
public class ThymeleafControllerTable {

private List<Employee> list;

private void createEmployee(){

    list=new ArrayList<>();
    Employee e1=new Employee("elham","khalili","elham@gmail.com");
    Employee e2=new Employee("elnaz","khalil","elnaz@gmail.com");
    Employee e3=new Employee("fateme","khodaei","fatima@gmail.com");
    list.add(e1);
    list.add(e2);
    list.add(e3);
}

//http://localhost:9080/showtable
    @GetMapping("/showtable")
public String getTable(Model model){
   createEmployee();
    model.addAttribute("list",list);
    return "showTable";

    }
//http://localhost:9080/showTableBootstrap
    @GetMapping("/showTableBootstrap")
    public String getTableBootstrap(Model model){
        createEmployee();
        model.addAttribute("list",list);
        return "showTableBootstrap";

    }




}
