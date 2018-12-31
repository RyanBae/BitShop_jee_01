package service;

import java.util.ArrayList;

public interface ArticleService {
	//private String seq, title, content, writer, regdate;
	/**
	 * CREATE
	 * */
	public void createArticles(String seq, String title, String content, String writer, String regdate);
	
	/**
	 * READ
	 * */
	public ArrayList[] list();
	public ArrayList[] findByTitle(String title);
	public ArrayList[] findByWriter(String writer);
	public boolean existArticleCheck(String title, String writer);
	public String articleCount();
	/**
	 * UPDATE
	 * */
	public void updateContent(String title, String writer, String newcontent);
	/**
	 * DELETE
	 * */
	public void deleteContent(String seq, String writer);
	
}
