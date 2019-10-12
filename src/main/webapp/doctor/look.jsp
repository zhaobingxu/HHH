<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <title>查看---2015</title>
    <meta charset="UTF-8">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/Css/bootstrap.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/Css/bootstrap-responsive.css" />
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath }/Css/style.css" />
    <script type="text/javascript" src="${pageContext.request.contextPath }/Js/jquery.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/Js/jquery.sorted.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/Js/bootstrap.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/Js/ckform.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/Js/common.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath }/Js/ckeditor/ckeditor.js"></script>
 

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
		$('#backid').click(function(){
				window.location.href="${pageContext.request.contextPath }/list_doctor.do";
		 });
    });
    </script>
</head>
<body>
<form action="index.html" method="post" class="definewidth m20">
<table class="table table-bordered table-hover definewidth m10">
    <tr>
        <td width="10%" class="tableleft">姓名</td>
        <td>${u.name }</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">证件类型</td>
        <td>
         <c:choose>
            <c:when test="${u.certificate_type==1 }">
                                       身份证
            </c:when>
             <c:when test="${u.certificate_type==2 }">
                                       军人证
            </c:when>
            <c:otherwise>
                                       护照
            </c:otherwise>
          </c:choose>
        
        
       </td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">证件号</td>
        <td>${u.ID_num }</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">手机</td>
        <td>${u.phone }</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">座机</td>
        <td>${u.special_plane }</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">性别</td>
        <td>${u.sex }</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">年龄</td>
        <td>${u.age }</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">出生年月</td>
        <td><fmt:formatDate value="${u.time}" pattern="yyyy/MM/dd HH:mm:ss"/></td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">电子邮箱</td>
        <td>${u.email }</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">所属科室</td>
        <td>${u.section}</td>
    </tr>
    <tr>
        <td width="10%" class="tableleft">学历</td>
        <td>
        <c:choose>
            <c:when test="${u.education==1 }">
             	 博士后                         
            </c:when>
             <c:when test="${u.education==2 }">
                 	研究生
            </c:when>
             <c:when test="${u.education==3 }">
                                      本科
            </c:when>
             <c:when test="${u.education==4 }">
                                       大专
            </c:when>
             <c:when test="${u.education==5 }">
                                       高中
            </c:when>
            <c:otherwise>
                                       初中
            </c:otherwise>
          </c:choose>
        
        ${ education}</td>
    </tr>
	<tr>
        <td width="10%" class="tableleft">备注</td>
        <td>${u.noted }</td>
	</tr>
    <tr>
        <td colspan="2">
			<center>
				<button type="button" class="btn btn-success" name="backid" id="backid">返回列表</button>
			</center>
		</td>
    </tr>
</table>
</form>
                                                                                            
</body>
</html>