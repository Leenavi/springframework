<%@ page language="java" contentType="text/html; charset=UTF-8"
   pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link rel="stylesheet" type="text/css" href="../resources/css/shopping.css">
<script type="text/javascript" src="../resources/board.js"></script>
</head>
<body>
   <div id="wrap" align="center">
      <h1>게시글 수정</h1>
      <form name="frm" method="post" action="/board/update">
         <input type="hidden" name="num" value="${board.num}">
         <table>
            <tr>
               <th>작성자</th>
               <td><input type="text" size="12" name="name" value="${board.name}"> * 필수</td>
            </tr>
            <tr>
               <th>비밀번호</th>
               <td><input type="password" size="12" name="pass"> * 필수 (게시물 수정 삭제시 필요합니다.)</td>
            </tr>
            <tr>
               <th>이메일</th>
               <td><input type="text" size="40" maxlength="50" name="email" value="${board.email}"></td>
            </tr>
            <tr>
               <th>제목</th>
               <td><input type="text" size="70" name="title" value="${board.title}"></td>
            </tr>
            <tr>
               <th>내용</th>
               <td><textarea cols="70" rows="15" name="content">${board.content}</textarea></td>
            </tr>
         </table>
         <br>
         <br>
         <input type="submit" value="등록" onclick="return boardCheck()">
         <input type="reset" value="다시 작성">
         <input type="button" value="목록" onclick="location.href='/board/boardList'">
      </form>
   </div>
</body>
</html>