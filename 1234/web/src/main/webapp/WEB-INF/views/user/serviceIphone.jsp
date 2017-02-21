<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<aside  class="main">
<div class="main_midle_ser">
<h3>Ремонт ${phone}</h3>
<a href="/service">← Назад</a>
<div class="serv"><p>ПЕРЕЛІК СЕРВІСНИХ РОБІТ ДЛЯ АЙФОН</p></div>

		<table>
        	
            <c:forEach items="${lists}" var="list">
          
                <tr>
                	<td width="80%"> ${list.description} </td>
                   
                    <td width="20%"> ${list.price} </td>
                    	
                </tr>
              
            </c:forEach>
        </table>
       




</div>

</aside>