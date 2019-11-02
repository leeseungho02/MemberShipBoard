<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<title>ȸ������������</title>
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
                        <a class="nav-link" href="#">ī�� ���</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">ī�� ����</a>
                    </li>
                </ul>
                <a href="#" class="btn btn-link btn-sm">ȸ������</a>
                <a href="#" class="btn btn-link btn-sm" style="margin-left: 10px;">�α���</a>
                <a href="#" class="btn btn-link btn-sm">�α׾ƿ�</a>
            </div>
        </div>
    </nav>

    <div class="container">
        <h1 style="margin: 100px 0;">ȸ������</h1>
        <form>
            <div class="form-group row">
                <label for="id" class="col-sm-2 col-form-label">���̵�</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="id" placeholder="���̵�">
                </div>
            </div>
            <div class="form-group row">
                <label for="name" class="col-sm-2 col-form-label">�̸�</label>
                <div class="col-sm-10">
                    <input type="text" class="form-control" id="name" placeholder="�̸�">
                </div>
            </div>
            <div class="form-group row">
                <label for="password" class="col-sm-2 col-form-label">��й�ȣ</label>
                <div class="col-sm-10">
                    <input type="password" class="form-control" id="password" placeholder="��й�ȣ">
                </div>
            </div>
            <div class="form-group row">
                <label for="passwordc" class="col-sm-2 col-form-label">��й�ȣ Ȯ��</label>
                <div class="col-sm-10">
                    <input type="password" class="form-control" id="passwordc" placeholder="��й�ȣ Ȯ��">
                </div>
            </div>
            <div class="form-group row">
                <div class="col-sm-12">
                    <button type="submit" class="btn btn-primary" style="float: right;">ȸ������</button>
                </div>
            </div>
        </form>
    </div>

    <footer class="bg-dark">Copyright &copy; 2019 MembershipBoard</footer>

</body>
</html>