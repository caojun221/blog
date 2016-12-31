package io.github.caojun221.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "articles")
@JsonIgnoreProperties(ignoreUnknown=true)
public class Article {
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    @JsonProperty
    private Long id;

    @Column( nullable = false)
    @JsonProperty
    @Size(max=2)
    private String title;

    @Column (nullable = false)
    @JsonProperty
    private String body;

    public Article() {}

    public Article(String title, String body) {
        this.body = body;
        this.title = title;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }
}
