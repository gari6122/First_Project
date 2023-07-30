<%@page import="com.spring.main.domain.CommunityVO"%>
<%@page import="com.spring.main.domain.MemberVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>write</title>
<script src="http://code.jquery.com/jquery-latest.js"></script>

</head>
<body>
	<form method="post" action="write">
		<input type="hidden" id="user_id" name="user_id" />
			<div class="write_input01">
				제목 :
				<input class="write_input02" name="cm_title" id="cmtitle" size="80">
				<br /> <br />
				<textarea class="write_input03" name="cm_content" id="cm_content" rows="4"
					cols="80" placeholder="내용">
				</textarea>
			</div>
			<div>
				<button class="btn btn-outline-secondary" >작성</button>
			</div>
	</form>
</body>
</html>