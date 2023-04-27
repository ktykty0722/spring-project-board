package com.fastcampus.springprojectboard.repository;

import com.fastcampus.springprojectboard.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}