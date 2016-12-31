package io.github.caojun221.repository;

import org.springframework.data.repository.CrudRepository;

import io.github.caojun221.domain.Article;

public interface ArticleRepository extends CrudRepository<Article, Long> {
}
