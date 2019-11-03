<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="header.jsp" />

    <div class="container">
        <h1 style="margin: 120px 0;">로그인</h1>
        <form action="member/login" method="post">
            <div class="form-group row">
                <label for="id" class="col-sm-2 col-form-label">아이디</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="id" name="id" placeholder="아이디">
                </div>
            </div>
            <div class="form-group row">
                <label for="password" class="col-sm-2 col-form-label">비밀번호</label>
                <div class="col-sm-10">
                    <input type="password" class="form-control" id="password" name="password" placeholder="비밀번호">
                </div>
            </div>
            <div class="form-group row">
                <div class="col-sm-12">
                    <button type="submit" class="btn btn-primary" style="float: right;">로그인</button>
                </div>
            </div>
        </form>
    </div>

<jsp:include page="footer.jsp" />