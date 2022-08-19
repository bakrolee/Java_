package board.article.service;

import board.article.model.Article;
import board.article.model.ArticleContent;

public class ArticleData {
	private Article article;
	private ArticleContent content;
	public ArticleData(Article article, ArticleContent content) {
		super();
		this.article = article;
		this.content = content;
	}
	public Article getArticle() {
		return article;
	}
	public String getContent() {
		return content.getContent();
	}
	
	
}
