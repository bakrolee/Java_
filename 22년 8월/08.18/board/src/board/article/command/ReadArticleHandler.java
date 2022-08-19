package board.article.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.article.service.ArticleContentNotFoundException;
import board.article.service.ArticleData;
import board.article.service.ArticleNotFoundException;
import board.article.service.ReadArticleService;
import board.mvc.command.CommandHandler;

public class ReadArticleHandler implements CommandHandler {
	private ReadArticleService readService = new ReadArticleService();
	
	@Override
	public String process(HttpServletRequest req, HttpServletResponse resp) throws Exception {
		String noVal = req.getParameter("no");
		int articleNum = Integer.parseInt(noVal);
		try {
			ArticleData articleData = readService.getArticle(articleNum, true);
			req.setAttribute("articleData", articleData);
			return "/WEB-INF/view/readArticle.jsp";
		} catch (ArticleNotFoundException | ArticleContentNotFoundException e) {
			req.getServletContext().log("no article", e);
			resp.sendError(HttpServletResponse.SC_NOT_FOUND);
			return null;
		}
	}

}
