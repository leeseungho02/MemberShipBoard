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
				<a href="#" class="list-group-item list-group-item-action">글쓰기</a>
				<a href="#" class="list-group-item list-group-item-action active">전체 글보기</a>
				<a href="#" class="list-group-item list-group-item-action">자유게시판</a>
				<a href="#" class="list-group-item list-group-item-action">등업게시판</a>
				<a href="#" class="list-group-item list-group-item-action">카페 관리</a>
				<a href="#" class="list-group-item list-group-item-action">가입하기</a>
				<a href="#" class="list-group-item list-group-item-action">탈퇴하기</a>
			</div>
		</div>

		<div class="card cafe-card">
			<div class="card-header">
				글 제목 : 첫번째 글
			</div>
			<div class="card-body">
				<h5 class="card-title">작성자 : user1</h5>
				<p class="card-text">글내용입니다.</p>
				<a href="#" class="btn btn-danger" style="float: right;">삭제</a>
			</div>
		</div>

		<form class="input-group comment">
			<input type="text" class="form-control">
			<div class="input-group-append">
				<button type="submit" class="btn btn-outline-secondary">댓글달기</button>
			</div>
		</form>

		<div class="list-group comment-list">
			<div class="list-title bg-dark">댓글 목록</div>
			<div class="list-group-item list-group-item-action flex-column align-items-start">
				<div class="d-flex w-100 justify-content-between">
					<h5 class="mb-1">작성자 : user1</h5>
				</div>
				<p class="mb-1">첫번째 댓글입니다.</p>
				<a href="#" class="btn comment-btn btn-danger btn-sm">삭제</a>
			</div>
			<div class="list-group-item list-group-item-action flex-column align-items-start">
				<div class="d-flex w-100 justify-content-between">
					<h5 class="mb-1">작성자 : user1</h5>
				</div>
				<p class="mb-1">두번째 댓글입니다.</p>
				<a href="#" class="btn comment-btn btn-danger btn-sm">삭제</a>
			</div>
			<div class="list-group-item list-group-item-action flex-column align-items-start">
				<div class="d-flex w-100 justify-content-between">
					<h5 class="mb-1">작성자 : user2</h5>
				</div>
				<p class="mb-1">세번째 댓글입니다.</p>
			</div>
		</div>
	</div>

<jsp:include page="footer.jsp" />