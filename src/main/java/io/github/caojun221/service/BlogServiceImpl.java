package io.github.caojun221.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import io.github.caojun221.domain.Article;
import io.github.caojun221.repository.ArticleRepository;

@Service
public class BlogServiceImpl implements BlogService {

    private final ArticleRepository articleRepository;

    @Autowired
    public BlogServiceImpl(ArticleRepository articleRepository) {this.articleRepository = articleRepository;}

    @Override
    @Transactional
    public void addArticle(Article article) {
        articleRepository.save(article);
    }
}
