<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<aside  class="main_admin">
	<table class="table_iphone">
    	<tr >
        	<td colspan="5" align="center">
          	<h3>Добавить админа</h3>
	        </td>
        </tr>
    	<form action="formEdit" method="post">
    	<tr>
        	
            <td width="450">
           <input placeholder="Введите логин" name="login_Edit" >
            </td>
            <td width="250">
           <input placeholder="Введите пароль" name="password_Edit">
            </td>
            <td width="250">
           <input placeholder="Повторите пароль" name="re-password_Edit">
            </td>
            <td width="145">
            <input type="submit" value="Добавить" name="save_Edit" class="save_btn">
            </td>
            
        </tr> 
          </form>
      
    </table>



 <table class="table_iphone">
    <tr >
        	<td colspan="5" align="center">
          	<h3>Удалить админа</h3>
	        </td>
        </tr>
    	<form action="formDeleteAdmin" method="post">
    	<tr>
        	<td width="870" >
             <select name="select_admin">
  			  <option >admin1</option>
   			 <option>admin2</option>
             <option>admin3</option>
  			</select>
            </td>
            
            <td width="135">
            <input type="submit" value="Удалить" name="delete_admin" class="delete_btn">
            </td>
            
        </tr> 
    
    </table>
    
    <table class="table_iphone">
    	<tr >
        	<td colspan="5" align="center">
          	<h3>Сменить пароль</h3>
	        </td>
        </tr>
    	<form action="formEditPassword" method="post">
    	<tr>
        	
            <td width="450">
          <select name="select_admin">
  			  <option >admin1</option>
   			 <option>admin2</option>
             <option>admin3</option>
  			</select>
            </td>
            <td width="250">
           <input placeholder="Введите пароль" name="password_EditPassword">
            </td>
            <td width="250">
           <input placeholder="Повторите пароль" name="re-password_EditPassword">
            </td>
            <td width="145">
            <input type="submit" value="Сменить" name="save_EditPassword" class="save_btn">
            </td>
            
        </tr> 
          </form>
      
    </table>
	
</aside>