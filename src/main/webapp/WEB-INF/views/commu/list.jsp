<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Community List Page</title>
</head>
<body>
         <!-- if 로그인이 되어있다면 -->
         <!-- <c:if test="${member != null && member.adminCheck == 1}"> -->
	        
         <!-- </c:if> -->
 	
 	<table width="100%" class="table table-striped table-bordered table-hover" id="dataTables-example">
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>작성일</th>
				<th>수정일</th>
			</tr>
		</thead>
		<a href="/commu/write"><input type="button" value="글쓰기"></a>
		<c:forEach items="${list}" var="list">
			<tr>
				<td>
					<c:out value="${list.cm_bno}" />
				</td>
				<td>							
					<a class="move" href="<c:out value="${list.cm_bno}" />">
						<c:out value="${list.cm_title}" />
					</a>
				</td>
				<td>
					<fmt:formatDate value="${list.cm_date}" pattern="yyyy-MM-dd" />
				</td>
			</tr>
		</c:forEach>
	</table>
 
	   <form id="moveForm" method="get"></form>
        
    </div>
    
	<script>
		$(document).ready(function() {
			
			let result = '<c:out value="${result}"/>';
			
			checkAlert(result);
			
			function checkAlert(result) {
				
				if(result === ''){
					return;
				}
				if(result === "insert success"){
					alert("글 등록이 완료되었습니다.");
				}
			    if(result === "modify success"){
		            alert("수정이 완료되었습니다.");
		        }
			    if(result === "delete success"){
		            alert("삭제가 완료되었습니다.");
		        }
			}
			
		});
		
	    let moveForm = $("#moveForm");
	    
	    $(".move").on("click", function(e){
	        e.preventDefault();
	        
	        moveForm.empty();
	        moveForm.append("<input type='hidden' name='bno' value='"+ $(this).attr("href")+ "'>");
	        moveForm.attr("action", "/commu/read");
	        moveForm.submit();
	    });
	</script>
	
</body>
</html>