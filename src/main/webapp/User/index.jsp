<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title></title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/Css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/Css/style.css" />
     <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/Css/main.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath }/Js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/Js/jquery.sorted.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/Js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/Js/ckform.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/Js/common.js"></script>

 

    <style type="text/css">
        body {
            padding-bottom: 40px;
        }
        .sidebar-nav {
            padding: 9px 0;
        }

        @media (max-width: 980px) {
            /* Enable use of floated navbar text */
            .navbar-text.pull-right {
                float: none;
                padding-left: 5px;
                padding-right: 5px;
            }
        }


    </style>
    <script type="text/javascript">
     $(function () {
		$('#newNav').click(function(){
				window.location.href="User/addUser.jsp";
		 });
    });
	
	
    function checkall(){
			var alls=document.getElementsByName("check");
			var ch=document.getElementById("checkall");
			if(ch.checked){
				for(var i=0;i<alls.length;i++){
					alls[i].checked=true;	
				}	
			}else{
				for(var i=0;i<alls.length;i++){
					alls[i].checked=false;	
				}	
			}
		}
		function delAll(){
			var alls=document.getElementsByName("check");
			var ids=new Array();
			for(var i=0;i<alls.length;i++){
				if(alls[i].checked){
					ids.push(alls[i].value);
				}		
			}
			if(ids.length>0){
				if(confirm("确认删除?")){
					alert("删除成功!");
				}
			}else{
				alert("请选中要删除的项");
			}
		}
    </script>
</head>
<body>
<form class="form-inline definewidth m20" action="${pageContext.request.contextPath }/user_list.do" method="post">    
    用户名称：
    <input type="text" name="na" id="username" class="abc input-default" placeholder="" value="">&nbsp;&nbsp;  
    <input type="submit" class="btn btn-primary" value="查询">
</form>
<table class="table table-bordered table-hover definewidth m10">
    <thead>
    <tr>
    	<th width="5%"><input type="checkbox" id="checkall" onChange="checkall();"></th>
        <th>用户账户</th>
        <th>真实姓名</th>
        <th>角色</th>
        <th  width="10%">操作</th>
    </tr>
    </thead>
    <c:forEach var="l" items="${user}" >
	     <tr>
         	<td style="vertical-align:middle;"><input type="checkbox" name="check" value="1"></td>
            <td>${l.userName }</td>
            <td>${l.real_name }</td>
            <td>${l.ro }</td>
            <td>
                <a href="${pageContext.request.contextPath }/user_edit.do?username=${l.userName }">编辑</a>&nbsp;&nbsp;&nbsp;
                <a href="${pageContext.request.contextPath }/user_delete.do?username=${l.userName }">删除</a>             
            </td>
        </tr>	
        </c:forEach>
</table>
<table class="table table-bordered table-hover definewidth m10" >
  	<tr><th colspan="5">  <div class="inline pull-right page">
          <ul class="pagination">
    <li>
     <c:choose>
     	<c:when test="${pageNo==1 }">
     	<a href="#" aria-label="Previous">
     	<span aria-hidden="true"></span>
	     上一页
	     </a>
     	</c:when>
     	<c:otherwise>
     		<a href="<c:url value='/user_list.do?pageNo=${page.pageNum-1 }&na=${us }' /> " >
     		<span aria-hidden="true"></span>
       		 上一页
      		</a>
     	</c:otherwise>
     </c:choose>
     
      
    </li>
    <c:forEach var="i" begin="1" end="${page.pages }" step="1">
    <li><a href="<c:url value='/user_list.do?pageNo=${i }&na=${us}' /> ">${i}</a></li>
    </c:forEach>
    <li>
      <c:choose>
      	<c:when test="${pageNo == page.pages }">
      	<a href="#" aria-label="Previous">
      	<span aria-hidden="true"></span>
      		下一页
      	</a>
      	</c:when>
      	<c:otherwise>
      		<a href="<c:url value='/user_list.do?pageNo=${page.pageNum +1 }&na=${us } ' /> " >
      		<span aria-hidden="true"></span>
      		下一页  
      		</a>
      	</c:otherwise>
      </c:choose>
    </li>
  </ul>
</nav>
		  &nbsp;&nbsp;&nbsp;共<span class='current'>${total }</span>条记录<span class='current'> ${page.pageNum }/${page.pages} </span>页
		  </div>
         
         <div><button type="button" class="btn btn-success" id="newNav">添加用户</button>&nbsp;&nbsp;&nbsp;<button type="button" class="btn btn-success" id="delPro" onClick="delAll();">删除选中</button></div></th></tr>
  </table>
                                                                                            
</body>
</html>