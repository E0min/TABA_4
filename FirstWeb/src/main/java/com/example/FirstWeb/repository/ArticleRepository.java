package com.example.FirstWeb.repository;

import com.example.FirstWeb.entity.Article;
import org.springframework.data.repository.CrudRepository;

public interface ArticleRepository extends CrudRepository<Article,Long> { // JPA에서 제공해주는 Repository 인터페이스를 사용한다.
}
