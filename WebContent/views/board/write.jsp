<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:include page="../include/header.jsp" />

	<div class="container">
		<jsp:include page="../include/sideBar.jsp" />
		<div class="card cafe-card">
			<div class="card-header">
				글 쓰기
			</div>
			<div class="card-body">
				<form action="/boardInsert.do" method="post" enctype="multipart/form-data" id="form">
					<input type="hidden" name="writer" value="<%= session.getAttribute("member") %>">
		            <div class="form-group row">
		                <label for="name" class="col-sm-2 col-form-label">글 제목</label>
		                <div class="col-sm-10">
		                    <input type="text" class="form-control" id="name" name="title" placeholder="글 제목" required="required">
		                </div>
		            </div>
		            <div class="form-group row">
		                <label for="content" class="col-sm-2 col-form-label">글 내용</label>
		                <div class="col-sm-10">
		                    <textarea class="form-control" id="content" name="content" placeholder="글 내용" required="required"></textarea>
		                </div>
		            </div>
		            <div class="form-group row">
		                <label for="file" class="col-sm-2 col-form-label">이미지첨부</label>
		                <div class="col-sm-10">
		                    <input type="file" class="form-control-file border" id="file" name="file" accept="image/*">
		                </div>
		            </div>
		            <div class="form-group row">
		                <div class="col-sm-12">
		                    <button class="submit btn btn-outline-primary" style="float: right;">작성</button>
		                </div>
		            </div>
		        </form>
			</div>
		</div>
	</div>
	
<jsp:include page="../include/footer.jsp" />