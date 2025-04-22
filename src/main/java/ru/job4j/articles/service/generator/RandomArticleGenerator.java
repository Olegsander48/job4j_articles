package ru.job4j.articles.service.generator;

import ru.job4j.articles.model.Article;
import java.util.Collections;
import java.util.List;

public class RandomArticleGenerator implements ArticleGenerator {
    @Override
    public Article generate(List<String> words) {
        Collections.shuffle(words);
        var content = String.join(" ", words);
        return new Article(content);
    }
}
