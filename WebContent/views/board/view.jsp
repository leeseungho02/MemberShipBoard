<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<jsp:include page="../include/header.jsp" />

	<div class="container">
		<jsp:include page="../include/sideBar.jsp" />
		<div class="card cafe-card">
			<div class="card-header">
				글 제목 : ${board.title}
			</div>
			<div class="card-body">
				<h5 class="card-title">작성자 : ${board.name}</h5>
				<c:if test="${board.fileUrl != ''}">
					<img src="/file/${board.fileUrl}" alt="img" width="400" height="250">
				</c:if>
				<p class="card-text">${board.content}</p>
				<div class="d-flex justify-content-end">
					<a href="/boardUpdate.do?idx=${board.idx}" class="btn btn-primary mr-3">수정</a>
					<a href="/boardDelete.do?idx=${board.idx}" class="btn btn-danger">삭제</a>
				</div>
			</div>
		</div>

		<!-- <form class="input-group comment">
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
		</div> -->
		
	</div>

<jsp:include page="../include/footer.jsp" />