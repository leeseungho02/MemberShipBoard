<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:include page="../include/header.jsp" />

    <div class="container">
        <h1 style="margin: 100px 0;">회원가입</h1>
        <form action="/memberInsert.do" method="post">
            <div class="form-group row">
                <label for="id" class="col-sm-2 col-form-label">아이디</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="id" name="id" placeholder="아이디" required="required">
                </div>
            </div>
            <div class="form-group row">
                <label for="name" class="col-sm-2 col-form-label">이름</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="name" name="name" placeholder="이름" required="required">
                </div>	
            </div>
            <div class="form-group row">
                <label for="password" class="col-sm-2 col-form-label">비밀번호</label>
                <div class="col-sm-10">
                    <input type="password" class="form-control" id="password" name="password" placeholder="비밀번호" required="required">
                </div>
            </div>
            <div class="form-group row">
                <label for="passwordCheck" class="col-sm-2 col-form-label">비밀번호 확인</label>
                <div class="col-sm-10">
                    <input type="password" class="form-control" id="passwordCheck" name="passwordCheck" placeholder="비밀번호 확인" required="required">
                </div>
            </div>
            <div class="form-group row">
                <div class="col-sm-12">
                    <button type="submit" class="btn btn-primary" style="float: right;">회원가입</button>
                </div>
            </div>
        </form>
    </div>
    
<jsp:include page="../include/footer.jsp" />