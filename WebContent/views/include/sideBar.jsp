<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
 <div class="box cafe-box">
    <div class="list-group" style="border-radius: 0;">
    	<% if(session.getAttribute("member") != null) { %>
        	<a href="/views/board/write.jsp" class="list-group-item list-group-item-action">글쓰기</a>
        <% } %>
        <a href="/boardSelectAll.do" class="list-group-item list-group-item-action">전체 글보기</a>
    </div>
</div>