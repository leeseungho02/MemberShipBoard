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
        <table class="table table-hover cafe-table">
            <thead>
                <tr>
                    <th scope="col">#</th>
                    <th scope="col">제목</th>
                    <th scope="col">작성자</th>
                    <th scope="col">날짜</th>
                    <th scope="col">조회수</th>
                </tr>
            </thead>
            <tbody>
                <tr>
                    <th scope="row">1</th>
                    <td><a href="#">첫번째 글</a></td>
                    <td>user1</td>
                    <td>2019-04-01</td>
                    <td>26</td>
                </tr>
                <tr>
                    <th scope="row">2</th>
                    <td><a href="#">두번째 글</a></td>
                    <td>user2</td>
                    <td>2019-04-01</td>
                    <td>53</td>
                </tr>
                <tr>
                    <th scope="row">3</th>
                    <td><a href="#">세번째 글</a></td>
                    <td>user3</td>
                    <td>2019-04-01</td>
                    <td>18</td>
                </tr>
                <tr>
                    <th scope="row">4</th>
                    <td><a href="#">네번째 글</a></td>
                    <td>user4</td>
                    <td>2019-04-01</td>
                    <td>42</td>
                </tr>
                <tr>
                    <th scope="row">5</th>
                    <td><a href="#">다섯번째 글</a></td>
                    <td>user5</td>
                    <td>2019-04-01</td>
                    <td>91</td>
                </tr>
                <tr>
                    <th scope="row">6</th>
                    <td><a href="#">여섯번째 글</a></td>
                    <td>user6</td>
                    <td>2019-04-01</td>
                    <td>8</td>
                </tr>
            </tbody>
        </table>
    </div>

<jsp:include page="footer.jsp" />