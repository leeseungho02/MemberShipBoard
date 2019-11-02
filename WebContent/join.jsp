<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>회원가입페이지</title>
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/style.css">
	<script src="js/jquery-3.3.1.min.js"></script>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container">
            <a class="navbar-brand" href="#">Cafe</a>

            <div class="collapse navbar-collapse">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">카페 목록</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">카페 생성</a>
                    </li>
                </ul>
                <a href="#" class="btn btn-link btn-sm">회원가입</a>
                <a href="#" class="btn btn-link btn-sm" style="margin-left: 10px;">로그인</a>
                <a href="#" class="btn btn-link btn-sm">로그아웃</a>
            </div>
        </div>
    </nav>

    <div class="container">
        <h1 style="margin: 100px 0;">회원가입</h1>
        <form>
            <div class="form-group row">
                <label for="id" class="col-sm-2 col-form-label">아이디</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="id" placeholder="아이디">
                </div>
            </div>
            <div class="form-group row">
                <label for="name" class="col-sm-2 col-form-label">이름</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="name" placeholder="이름">
                </div>
            </div>
            <div class="form-group row">
                <label for="password" class="col-sm-2 col-form-label">비밀번호</label>
                <div class="col-sm-10">
                    <input type="password" class="form-control" id="password" placeholder="비밀번호">
                </div>
            </div>
            <div class="form-group row">
                <label for="passwordc" class="col-sm-2 col-form-label">비밀번호 확인</label>
                <div class="col-sm-10">
                    <input type="password" class="form-control" id="passwordc" placeholder="비밀번호 확인">
                </div>
            </div>
            <div class="form-group row">
                <div class="col-sm-12">
                    <button type="submit" class="btn btn-primary" style="float: right;">회원가입</button>
                </div>
            </div>
        </form>
    </div>

    <footer class="bg-dark">Copyright &copy; 2019 MembershipBoard</footer>

</body>
</html>