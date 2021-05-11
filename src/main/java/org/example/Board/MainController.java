package org.example.Board;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {
    @Autowired
    ArticleRepository articleRepository;

    @GetMapping("/write")
    public String write(){
        return "write";
    }

    @PostMapping("/write")
    public String postWrite(@ModelAttribute("article")Article article){
        articleRepository.save(article);

        return "rediect:/";
    }
}
