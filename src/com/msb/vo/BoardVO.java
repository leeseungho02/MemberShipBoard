package com.msb.vo;

public class BoardVO {
	private String idx;							// post idx
	private String title;						// post title
	private String content;						// post content
	private String writer;						// post writer
	private String fileUrl;						// post fileUrl
	private String fileName;					// post fileName
	private String insert_date;					// post insert_date
	private String update_date;					// post update_date
	private int view;							// post view
	private String name;						// post writer name
	
//	BoardVO Constructor
	public BoardVO() {
		super();
	}
	
//	Post Information BoardVO Constructor
	public BoardVO(String title, String content) {
		super();
		this.title = title;
		this.content = content;
	}

//	Post img Information BoardVO Constructor
	public BoardVO(String title, String content, String writer, String fileUrl, String fileName) {
		super();
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.fileUrl = fileUrl;
		this.fileName = fileName;
	}
	
//	Post img Information BoardVO Constructor
	public BoardVO(String idx, String title, String content, String writer, String fileUrl, String fileName) {
		super();
		this.idx = idx;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.fileUrl = fileUrl;
		this.fileName = fileName;
	}
	
//	Post view Information BoardVO Constructor
	public BoardVO(String idx, String title, String content, String writer, String fileUrl, String fileName, String insert_date, String update_date, String name, int view) {
		super();
		this.idx = idx;
		this.title = title;                                                                                                                                                                                                                                                                                                                                   
		this.content = content;
		this.writer = writer;
		this.fileUrl = fileUrl;
		this.fileName = fileName;
		this.insert_date = insert_date;
		this.update_date = update_date;
		this.name = name;
		this.view = view;
	}
	
	/**
	 * BoardVO getter setter
	*/
	
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
	
	public int getView() {
		return view;
	}
	
	public void setView(int view) {
		this.view = view;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getFileUrl() {
		return fileUrl;
	}

	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

}