package ThymeleafUdemy.ThymeleafUdemy.controller;

import ThymeleafUdemy.ThymeleafUdemy.entity.Student;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;
@Controller
public class ThymeleafControllerDB {

    private EntityManager entityManager;

    @Autowired
    public ThymeleafControllerDB(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    //http://localhost:9080/showTableFromDB
    @GetMapping("/showTableFromDB")
    public String getShowTableFromDB(Model model) {
        List<Student> list = new ArrayList<>();
        Query query=entityManager.createQuery("select s from Student s ");
        list=query.getResultList();
        model.addAttribute("listDB", list);
        return "showTableDB";

    }


}
