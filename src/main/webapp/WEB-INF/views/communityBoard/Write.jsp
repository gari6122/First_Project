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
<%
	MemberVO memberVo = (MemberVO) session.getAttribute("member");
%>
<script>
	var userId = '<%= memberVo == null ? "" : memberVo.getUser_id() %>';

	function saveBoard() {
		var title = $("#title").val();
		var content = $("#content").val();

		if (title == "") {
			alert("제목을 입력하세요");
			document.form1.title.focus();
			return;
		} else if (content == "") {
			alert("내용을 입력하세요");
			document.form1.content.focus();
			return;
		}
		
		$('#userId').val(userId);
		document.form1.submit();
	}

</script>
</head>
<body>
	<form name="form1" method="post" action="/relay/board/insert">
		<input type="hidden" id="userId" name="userId" />
			<div class="write_input01">
				제목 :
				<input class="write_input02" name="title" id="title" size="80">
				<br /> <br />
				<textarea class="write_input03" name="content" id="content" rows="4"
					cols="80" placeholder="내용">
				</textarea>
			</div>
			<div>
				<button class="btn btn-outline-secondary" id="btnSave" onclick="saveBoard()">작성</button>
			</div>
	</form>
</body>
</html>