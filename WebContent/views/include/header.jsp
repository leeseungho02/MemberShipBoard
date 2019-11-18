<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html lang="ko">
<head>
	<meta charset="UTF-8">
	<title>MemberShipBoard</title>
	<link rel="stylesheet" type="text/css" href="/views/assets/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="/views/assets/css/style.css">
	<script src="/views/assets/js/jquery-3.3.1.min.js"></script>
	<script src="/views/assets/js/app.js"></script>
</head>
<body>

	<nav class="navbar navbar-expand-lg navbar-dark bg-dark">
        <div class="container">
            <a class="navbar-brand" href="/views/include/index.jsp">MemberShipBorad</a>

            <div class="collapse navbar-collapse">
                <ul class="navbar-nav mr-auto">
                    <li class="nav-item active">
                        <a class="nav-link" href="/boardSelectAll.do">글 목록</a>
                    </li>
                </ul>
                
                <% if(session.getAttribute("member") != null){ %>
                	<a href="/memberLogout.do" class="btn btn-link btn-sm">로그아웃</a>
                <% } else { %>
	                <a href="/views/member/join.jsp" class="btn btn-link btn-sm">회원가입</a>
	                <a href="/views/member/login.jsp" class="btn btn-link btn-sm" style="margin-left: 10px;">로그인</a>
                <% } %>
                
            </div>
        </div>
    </nav>