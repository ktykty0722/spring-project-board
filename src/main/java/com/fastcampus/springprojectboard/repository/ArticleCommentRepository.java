package com.fastcampus.springprojectboard.repository;

import com.fastcampus.springprojectboard.domain.ArticleComment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleCommentRepository extends JpaRepository<ArticleComment, Long> {
}