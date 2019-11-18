<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<jsp:include page="../include/header.jsp" />

    <div class="container">
        <jsp:include page="../include/sideBar.jsp" />
        <table class="table table-hover cafe-table">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">제목</th>
                    <th scope="col">작성자</th>
                    <th scope="col">등록날짜</th>
                    <th scope="col">조회수</th>
                </tr>
            </thead>
            <tbody>
            <c:forEach var="board" items="${boardList}">
                <tr>
                    <th scope="row"><c:out value="${board.idx}" /></th>
                    <td><a href="/boardSelect.do?idx=${ board.idx }"><c:out value="${board.title}" /></a></td>
                    <td><c:out value="${board.name}" /></td>
                    <td><c:out value="${board.insert_date}" /></td>
                    <td><c:out value="${board.view}" /></td>
                </tr>
           	</c:forEach>
            </tbody>
        </table>
    </div>

<jsp:include page="../include/footer.jsp" />