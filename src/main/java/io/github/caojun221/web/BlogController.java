package io.github.caojun221.web;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.sun.deploy.net.HttpResponse;
import com.sun.deploy.util.SystemUtils;

import io.github.caojun221.domain.Article;
import io.github.caojun221.service.BlogService;

@RestController
public class BlogController {

    private BlogService blogService;

    @RequestMapping(value = "/article/create", method = RequestMethod.POST)
    public void addArticle(@RequestBody @Valid Article article, Errors bindingResult) {
        if (bindingResult.hasErrors()) {
            System.out.println("!!!!!");
        }

        if (article.getId() == null) {
            blogService.addArticle(article);
        }
    }

    @Autowired(required=true)
    @Qualifier("blogServiceImpl")
    public void setBlogService(BlogService blogService) {
        this.blogService = blogService;
    }
}
