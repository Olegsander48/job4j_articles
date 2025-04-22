package ru.job4j.articles.service.generator;

import ru.job4j.articles.model.Article;

import java.util.List;

public interface ArticleGenerator {
    Article generate(List<String> words);
}
