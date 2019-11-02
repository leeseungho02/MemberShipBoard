<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:include page="header.jsp" />

	<div class="container">
		<div class="box cafe-box">
			<div class="card" style="border-radius: 0;">
				<div class="card-body">
					<h5 class="card-title"><b>카페 이름</b></h5>
					<h6 class="card-subtitle mb-2 text-muted">관리자 : admin</h6>
					<p class="card-text">카페 설명입니다.</p>
					<p class="card-text" style="font-size: 14px;">자신 댓글 수 : 14개&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;자신 글 수 : 9개</p>
				</div>
			</div>
			<div class="list-group" style="border-radius: 0;">
				<a href="#" class="list-group-item list-group-item-action active">글쓰기</a>
				<a href="#" class="list-group-item list-group-item-action">전체 글보기</a>
				<a href="#" class="list-group-item list-group-item-action">자유게시판</a>
				<a href="#" class="list-group-item list-group-item-action">등업게시판</a>
				<a href="#" class="list-group-item list-group-item-action">카페 관리</a>
				<a href="#" class="list-group-item list-group-item-action">가입하기</a>
				<a href="#" class="list-group-item list-group-item-action">탈퇴하기</a>
			</div>
		</div>

		<div class="card cafe-card">
			<div class="card-header">
				글 쓰기
			</div>
			<div class="card-body">
				<form>
		            <div class="form-group row">
		                <label for="name" class="col-sm-2 col-form-label">글 제목</label>
		                <div class="col-sm-10">
		                    <input type="text" class="form-control" id="name" placeholder="글 제목">
		                </div>
		            </div>
		            <div class="form-group row">
		                <label for="content" class="col-sm-2 col-form-label">글 내용</label>
		                <div class="col-sm-10">
		                    <textarea class="form-control" id="content" placeholder="글 내용"></textarea>
		                </div>
		            </div>
		            <div class="form-group row">
		                <div class="col-sm-12">
		                    <button type="submit" class="btn btn-outline-primary" style="float: right;">작성</button>
		                </div>
		            </div>
		        </form>
			</div>
		</div>
	</div>

<jsp:include page="footer.jsp" />