package com.tistory.tazz009.comment;

import static org.junit.Assert.*;
import static org.junit.Assert.fail;

import java.util.Date;
import java.util.List;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.tistory.tazz009.comment.service.CommentVO;
import com.tistory.tazz009.comment.service.impl.CommentMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={  
		"classpath:spring/context-common.xml",   
        "classpath:spring/context-datasource.xml",   
        })
public class CommentDaoTest {

	@Autowired
	private CommentMapper commentMapper;
	
//	@Before
//	public void setup() {
//		
//	}
	
	@Test
	public void test001_listComment() throws Exception {
		CommentVO comment = new CommentVO();
		comment.setCommentNo(1L);
		comment.setUserId("tester001");
		comment.setRegDate(new Date());
		comment.setCommentContent("first content");
		int result = commentMapper.insertComment(comment);
		
		List<CommentVO> listComment = commentMapper.listComment();
		for (CommentVO commentVO : listComment) {
			System.out.println(commentVO.toString());
		}
	}
	
}
