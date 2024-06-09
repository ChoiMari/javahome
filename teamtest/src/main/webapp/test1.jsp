<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link href="./sketchstyle.css" rel="stylesheet" type="text/css">
<%--CSS와 연결함 --%>
<meta charset="UTF-8">
<title>여행</title>
</head>
<body>
    <nav class="navbar navbar-expand-lg bg-light" data-bs-theme="light">
        <div class="container-fluid">
            <a class="navbar-brand" href="#">tasteP</a>
            <button class="navbar-toggler" type="button"
                data-bs-toggle="collapse"
                data-bs-target="#navbarColor03"
                aria-controls="navbarColor03" aria-expanded="false"
                aria-label="Toggle navigation">
                <span class="navbar-toggler-icon"></span>
            </button>
            <div class="collapse navbar-collapse" id="navbarColor03">
                <ul class="navbar-nav me-auto">
                    <li class="nav-item"><a class="nav-link active"
                        href="#">Home<span class="visually-hidden">(current)</span>
                    </a></li>

                    <li class="nav-item"><a class="nav-link"
                        href="#">planning</a></li>
                    <li class="nav-item"><a class="nav-link"
                        href="#">Gallery</a></li>
                    <li class="nav-item"><a class="nav-link"
                        href="#">Community</a></li>
                    <li class="nav-item dropdown"><a
                        class="nav-link dropdown-toggle"
                        data-bs-toggle="dropdown" href="#" role="button"
                        aria-haspopup="true" aria-expanded="false">My
                            Page</a>
                        <div class="dropdown-menu">
                            <a class="dropdown-item" href="#">Action</a>
                            <a class="dropdown-item" href="#">Another
                                action</a> <a class="dropdown-item" href="#">Something
                                else here</a>
                            <div class="dropdown-divider"></div>
                            <a class="dropdown-item" href="#">Separated
                                link</a>
                        </div></li>
                </ul>
                <form class="d-flex">
                    <input class="form-control me-sm-2" type="search"
                        placeholder="Search">
                    <button class="btn btn-secondary my-2 my-sm-0"
                        type="submit">Search</button>
                </form>
                &nbsp;&nbsp; <%--2칸 공백 --%>
                <div class="btn-group" role="group"
                    aria-label="Basic example">
                    <button type="button" class="btn btn-light">♡</button>
                    <button type="button" class="btn btn-light">최근</button>
                    <button type="button" class="btn btn-light">로그인</button>
                </div>
            </div>
        </div>
    </nav>
    <br />
    <div class="btn-group-vertical">
        <button type="button" class="btn btn-primary">전체 보기</button>
        <button type="button" class="btn btn-primary">테마별</button>
        <button type="button" class="btn btn-primary">상황별</button>
        <button type="button" class="btn btn-primary">누구랑?</button>
        <button type="button" class="btn btn-primary">즉흥여행</button>
        <button type="button" class="btn btn-primary">재미</button>
        
    </div>
    
    
    
    
</body>
</html>