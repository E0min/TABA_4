package com.example.FirstWeb.controller;

import com.example.FirstWeb.DTO.ArticleForm;
import com.example.FirstWeb.entity.Article;
import com.example.FirstWeb.repository.ArticleRepository;
import org.hibernate.query.criteria.internal.expression.SizeOfPluralAttributeExpression;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ArticleController {
    @Autowired// 스프링부트가 미리 생성해놓은 객체를 가져다가 자동 연결
    private ArticleRepository articleRepository;

    @GetMapping("/articles/new")
    public String newArticleForm(){
        return "articles/new";
    }

    @PostMapping("/articles/create") //Postmapping 방식
    public String createArticle(ArticleForm form){
        System.out.println(form.toString());

        //1 . DTO를 Entitiy로 변환
        Article article = form.toEntity(); // ArticleForm 타입의 데이터를 article 타입으로 변환한다.
        System.out.println(article.toString());

        //2. Repository에게 Entity를 DB안에 저장하게 함
        Article saved = articleRepository.save(article); //Autowired된 articleRepository의 save메소드를 이용하여 article(Entity) 타입으로 변환된
        //폼데이터(DTO)를 Repository를 시킨다.
        System.out.println(saved.toString());

        return "";
    }
}
