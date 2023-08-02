<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>write</title>
</head>
<body>
            <form id="insertCommu" action="/commu/write" method="post">
                <div class="frameWrap">
                    <div>Write</div>
                    <div>
                        <input type="text" name="title" class="" placeholder="제목">
                    </div>
                    <div class="n3">
                        <textarea row="50" placeholder="내용" name="content"></textarea>
                    </div>
                    <div class="n4">
                        <button
                            class="button button--ujarak button--border-thin button--text-thick btnRegister">등록</button>
                        <button
                            class="button button--ujarak button--border-thin button--text-thick btnRegister" id="cancle">취소</button>
                    </div>
                </div>
            </form>
 <script type="text/javascript">
 
 $("#cancle").click(function(){
	 
	 var title = $("input[name='title']").val();
     var content = $("textarea[name='content']").val();
     
     if (title !== '' || content !== '') {
         event.preventDefault();
         var result = confirm("작성을 취소하십니까?");
         if (result) {
             window.location.href = "/commu/list";
	 	}
     } else {
         event.preventDefault();
         var result = confirm("작성을 취소하십니까?");
         if (result) {
             window.location.href = "/commu/list";
	 	}
     }
     
 });

 </script>
</body>
</html>