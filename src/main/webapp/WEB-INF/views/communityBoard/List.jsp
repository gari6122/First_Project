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
	<p><a href="commu/insert"><input type="button" class="btn btn-light" value="글작성"></a></p>
	${communityVO.cm_bno }<br />
	${communityVO.cm_title }<br />
	${communityVO.cm_content }<br />
	${communityVO.cdm_date }<br />
</body>
</html>