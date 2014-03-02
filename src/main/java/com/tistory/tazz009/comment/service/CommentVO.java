package com.tistory.tazz009.comment.service;

import java.io.Serializable;
import java.util.Date;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

public class CommentVO implements Serializable {

	private static final long serialVersionUID = -2254267684412631207L;
	private Long commentNo;
	private String userId;
	private Date regDate;
	private String commentContent;

	public CommentVO() {
	}

	public Long getCommentNo() {
		return commentNo;
	}

	public void setCommentNo(Long commentNo) {
		this.commentNo = commentNo;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public Date getRegDate() {
		return regDate;
	}

	public void setRegDate(Date regDate) {
		this.regDate = regDate;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	@Override  
    public int hashCode() {  
        return HashCodeBuilder.reflectionHashCode(this);  
    }  
      
    @Override  
    public boolean equals(Object obj) {  
        return EqualsBuilder.reflectionEquals(this, obj);  
    }  
      
    @Override  
    public String toString() {  
        return ToStringBuilder.reflectionToString(this, ToStringStyle.MULTI_LINE_STYLE);  
    } 
}
