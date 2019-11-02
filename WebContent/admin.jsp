<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<jsp:include page="header.jsp" />

    <div class="container" style="margin-top: 100px;">
        <div class="card w-50" style="float: left;">
            <div class="card-body">
                <h5 class="card-title"><b>카페 이름 : 첫번째 카페</b></h5>
                <p class="card-content">사용자 : 12명</p>
                <p class="card-content">게시판 수 : 9개</p>
                <p class="card-content">게시된 글 수 : 67개</p>
            </div>
        </div>

        <div class="card w-50" style="border: none;">
            <div class="card-body" style="padding: 30px;">
                <div class="btn btn-outline-warning changeCafe">카페 이름 변경</div>
                <div class="btn btn-outline-info createBoard">게시판 생성</div>
                <div class="btn btn-outline-success removeBoard">게시판 삭제</div>
                <div class="btn btn-outline-primary removeContent">글 삭제</div>
                <div class="btn btn-outline-secondary checkUser">카페 회원 가입</div>
                <div class="btn btn-outline-danger removeUser">카페 회원 추방</div>
                <div class="btn btn-outline-dark userGrade">회원 등급 관리</div>
            </div>
        </div>

        <div class="card w-100" id="createBoard" style="margin-top: 30px; display: none;">
            <div class="card-body">
                <h5 class="card-title"><b>게시판 생성</b></h5>
                <form>
                    <div class="form-group row">
                        <label for="name" class="col-sm-2 col-form-label" style="text-align: center;">게시판 이름</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" name="name" id="name" placeholder="게시판 이름">
                        </div>
                    </div>
                    <div class="form-group row">
                        <label for="name" class="col-sm-2 col-form-label" style="text-align: center;">게시판 등급</label>
                        <select name="grade" class="form-control col-sm-9" style="margin-left: 15px;">
                            <option value="1">1등급</option>
                            <option value="2">2등급</option>
                            <option value="3">3등급</option>
                            <option value="4">4등급</option>
                            <option value="5">5등급</option>
                        </select>
                    </div>
                    <div class="form-group row">
                        <label for="name" class="col-sm-2 col-form-label" style="text-align: center;"></label>
                    </div>
                    <div class="form-group row">
                        <div class="col-sm-12" style="margin-top: 10px;">
                            <button type="submit" class="btn btn-info" style="float: right;">게시판 생성</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>

        <div class="card w-100" id="changeCafe" style="margin-top: 30px; display: none;">
            <div class="card-body">
                <h5 class="card-title"><b>카페 이름 변경</b></h5>
                <form>
                    <div class="form-group row">
                        <label for="name" class="col-sm-2 col-form-label" style="text-align: center;">카페 이름</label>
                        <div class="col-sm-9">
                            <input type="text" class="form-control" name="name" id="name" placeholder="카페 이름">
                        </div>
                    </div>
                    <div class="form-group row">
                        <div class="col-sm-12" style="margin-top: 10px;">
                            <button type="submit" class="btn btn-info" style="float: right;">변경</button>
                        </div>
                    </div>
                </form>
            </div>
        </div>

        <div class="card w-100" id="removeBoard" style="margin-top: 30px; display: none;">
            <div class="card-body">
                <h5 class="card-title"><b>게시판 삭제</b></h5>
                <ul class="list-group">
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        등업게시판<a href="#" class="btn btn-danger btn-sm">삭제</a>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        2등급게시판<a href="#" class="btn btn-danger btn-sm">삭제</a>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        3등급게시판<a href="#" class="btn btn-danger btn-sm">삭제</a>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        4등급게시판<a href="#" class="btn btn-danger btn-sm">삭제</a>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        5등급게시판<a href="#" class="btn btn-danger btn-sm">삭제</a>
                    </li>
                </ul>
            </div>
        </div>

        <div class="card w-100" id="removeContent" style="margin-top: 30px; display: none;">
            <div class="card-body">
                <h5 class="card-title"><b>글 삭제</b></h5>
                <ul class="list-group">
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        첫번째 글<a href="#" class="btn btn-danger btn-sm">삭제</a>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        두번째 글<a href="#" class="btn btn-danger btn-sm">삭제</a>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        세번째 글<a href="#" class="btn btn-danger btn-sm">삭제</a>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        네번째 글<a href="#" class="btn btn-danger btn-sm">삭제</a>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        다섯번째 글<a href="#" class="btn btn-danger btn-sm">삭제</a>
                    </li>
                </ul>
            </div>
        </div>

        <div class="card w-100" id="checkUser" style="margin-top: 30px; display: none;">
            <div class="card-body">
                <h5 class="card-title"><b>카페 회원 가입</b></h5>
                <ul class="list-group">
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        user10
                        <div>
                            <a href="#" class="btn btn-success btn-sm">승인</a>
                            <a href="#" class="btn btn-danger btn-sm">거절</a>
                        </div>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        user11
                        <div>
                            <a href="#" class="btn btn-success btn-sm">승인</a>
                            <a href="#" class="btn btn-danger btn-sm">거절</a>
                        </div>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        user12
                        <div>
                            <a href="#" class="btn btn-success btn-sm">승인</a>
                            <a href="#" class="btn btn-danger btn-sm">거절</a>
                        </div>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        user13
                        <div>
                            <a href="#" class="btn btn-success btn-sm">승인</a>
                            <a href="#" class="btn btn-danger btn-sm">거절</a>
                        </div>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        user14
                        <div>
                            <a href="#" class="btn btn-success btn-sm">승인</a>
                            <a href="#" class="btn btn-danger btn-sm">거절</a>
                        </div>
                    </li>
                </ul>
            </div>
        </div>

        <div class="card w-100" id="removeUser" style="margin-top: 30px; display: none;">
            <div class="card-body">
                <h5 class="card-title"><b>회원 추방</b></h5>
                <ul class="list-group">
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        user1<a href="#" class="btn btn-danger btn-sm">추방</a>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        user2<a href="#" class="btn btn-danger btn-sm">추방</a>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        user3<a href="#" class="btn btn-danger btn-sm">추방</a>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        user4<a href="#" class="btn btn-danger btn-sm">추방</a>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        user5<a href="#" class="btn btn-danger btn-sm">추방</a>
                    </li>
                </ul>
            </div>
        </div>

        <div class="card w-100" id="userGrade" style="margin-top: 30px; display: none;">
            <div class="card-body">
                <h5 class="card-title"><b>등급 관리</b></h5>
                <ul class="list-group">
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        <span>user1&nbsp;&nbsp;<small>글 수 : 3개&nbsp;&nbsp;댓글 수 : 5개</small></span>
                        <div>
                            <a href="#" class="btn btn-primary btn-sm">1등급</a>
                            <a href="#" class="btn btn-outline-success btn-sm">2등급</a>
                            <a href="#" class="btn btn-outline-info btn-sm">3등급</a>
                            <a href="#" class="btn btn-outline-warning btn-sm">4등급</a>
                            <a href="#" class="btn btn-outline-danger btn-sm">5등급</a>
                        </div>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        <span>user2&nbsp;&nbsp;<small>글 수 : 3개&nbsp;&nbsp;댓글 수 : 5개</small></span>
                        <div>
                            <a href="#" class="btn btn-outline-primary btn-sm">1등급</a>
                            <a href="#" class="btn btn-outline-success btn-sm">2등급</a>
                            <a href="#" class="btn btn-outline-info btn-sm">3등급</a>
                            <a href="#" class="btn btn-warning btn-sm">4등급</a>
                            <a href="#" class="btn btn-outline-danger btn-sm">5등급</a>
                        </div>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        <span>user3&nbsp;&nbsp;<small>글 수 : 3개&nbsp;&nbsp;댓글 수 : 5개</small></span>
                        <div>
                            <a href="#" class="btn btn-outline-primary btn-sm">1등급</a>
                            <a href="#" class="btn btn-outline-success btn-sm">2등급</a>
                            <a href="#" class="btn btn-outline-info btn-sm">3등급</a>
                            <a href="#" class="btn btn-outline-warning btn-sm">4등급</a>
                            <a href="#" class="btn btn-danger btn-sm">5등급</a>
                        </div>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        <span>user4&nbsp;&nbsp;<small>글 수 : 3개&nbsp;&nbsp;댓글 수 : 5개</small></span>
                        <div>
                            <a href="#" class="btn btn-outline-primary btn-sm">1등급</a>
                            <a href="#" class="btn btn-success btn-sm">2등급</a>
                            <a href="#" class="btn btn-outline-info btn-sm">3등급</a>
                            <a href="#" class="btn btn-outline-warning btn-sm">4등급</a>
                            <a href="#" class="btn btn-outline-danger btn-sm">5등급</a>
                        </div>
                    </li>
                    <li class="list-group-item d-flex justify-content-between align-items-center">
                        <span>user5&nbsp;&nbsp;<small>글 수 : 3개&nbsp;&nbsp;댓글 수 : 5개</small></span>
                        <div>
                            <a href="#" class="btn btn-outline-primary btn-sm">1등급</a>
                            <a href="#" class="btn btn-outline-success btn-sm">2등급</a>
                            <a href="#" class="btn btn-info btn-sm">3등급</a>
                            <a href="#" class="btn btn-outline-warning btn-sm">4등급</a>
                            <a href="#" class="btn btn-outline-danger btn-sm">5등급</a>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </div>

    <script src="js/app.js"></script>
    
<jsp:include page="footer.jsp" />