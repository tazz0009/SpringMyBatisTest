package com.tistory.tazz009.comment.service.impl;

import java.util.List;

import com.tistory.tazz009.comment.service.CommentVO;

public interface CommentMapper {

	public List<CommentVO> listComment();

	public int insertComment(CommentVO comment);
	
}
