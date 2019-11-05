package com.mb.vo;

public class PostVO {
	private String idx;							// post idx
	private String title;						// post title
	private String content;						// post content
	private String writer;						// post writer
	private String bidx;						// post board idx
	private String insert_date;					// post insert_date
	private String update_date;					// post update_date
	private String view;						// post view
	
	public String getIdx() {
		return idx;
	}
	
	public void setIdx(String idx) {
		this.idx = idx;
	}
	
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getContent() {
		return content;
	}
	
	public void setContent(String content) {
		this.content = content;
	}
	
	public String getWriter() {
		return writer;
	}
	
	public void setWriter(String writer) {
		this.writer = writer;
	}
	
	public String getBidx() {
		return bidx;
	}

	public void setBidx(String bidx) {
		this.bidx = bidx;
	}
	
	public String getInsert_date() {
		return insert_date;
	}
	
	public void setInsert_date(String insert_date) {
		this.insert_date = insert_date;
	}
	
	public String getUpdate_date() {
		return update_date;
	}
	
	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}
	
	public String getView() {
		return view;
	}
	
	public void setView(String view) {
		this.view = view;
	}
}