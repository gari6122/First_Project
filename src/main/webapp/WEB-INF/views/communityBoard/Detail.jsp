<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html lang="ko">
<head>
<link rel="canonical" href="https://getbootstrap.com/docs/5.1/examples/list-groups/">
<link href="/resources/css/community/css/bootstrap.min.css">
<link href="/resources/js/community/js/bootstrap.bundle.min.js">
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Community Detail</title>
</head>
<body>
	<div class="list-group">
	  <a href="#" class="list-group-item list-group-item-action d-flex gap-3 py-3" aria-current="true">
	    <img src="https://github.com/twbs.png" alt="twbs" width="32" height="32" class="rounded-circle flex-shrink-0">
	    <div class="d-flex gap-2 w-100 justify-content-between">
	      <div>
	        <h6 class="mb-0">List group item heading</h6>
	        <p class="mb-0 opacity-75">Some placeholder content in a paragraph.</p>
	      </div>
	      <small class="opacity-50 text-nowrap">now</small>
	    </div>
	  </a>
	  <a href="#" class="list-group-item list-group-item-action d-flex gap-3 py-3" aria-current="true">
	    <img src="https://github.com/twbs.png" alt="twbs" width="32" height="32" class="rounded-circle flex-shrink-0">
	    <div class="d-flex gap-2 w-100 justify-content-between">
	      <div>
	        <h2 class="mb-0"><c:out value="${communotyVO.cm_title }" /></h2>
	        <p class="mb-0 opacity-75">${communotyVO.cm_content }</p>
	      </div>
	      <small class="opacity-50 text-nowrap">3d</small>
	    </div>
	  </a>
	  <a href="#" class="list-group-item list-group-item-action d-flex gap-3 py-3" aria-current="true">
	    <img src="https://github.com/twbs.png" alt="twbs" width="32" height="32" class="rounded-circle flex-shrink-0">
	    <div class="d-flex gap-2 w-100 justify-content-between">
	      <div>
	        <h6 class="mb-0">Third heading</h6>
	        <p class="mb-0 opacity-75">Some placeholder content in a paragraph.</p>
	      </div>
	      <small class="opacity-50 text-nowrap">1w</small>
	    </div>
	  </a>
	</div>
</body>
</html>