<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<aside  class="main_admin">
	

	<table class="table_iphone">
    	<tr >
        	<td colspan="5" align="center">
          	<h3>Добавить ремонт</h3>
	        </td>
        </tr>
    	<form action="formAddRepair" method="post">
    	<tr>
        	<td width="185" >
             <select name="select_phone">
  			  <option >IPhone 3g</option>
   			 <option>IPhone 4</option>
             <option>IPhone 4g</option>
  			</select>
            </td>
            <td width="650">
           <input placeholder="Введить описание" name="discription_addRepair" >
            </td>
            <td width="150">
           <input placeholder="Введить цену грн" name="price_addRepair" pattern="^[ 0-9]+$">
            </td>
            <td width="145">
            <input type="submit" value="Добавить" name="save_phone" class="save_btn">
            </td>
            
        </tr> 
          </form>
      
    </table>
    
    <table class="table_iphone">
    <tr >
        	<td colspan="5" align="center">
          	<h3>Удалить ремонт</h3>
	        </td>
        </tr>
    	<form action="formDeleteRepair" method="post">
    	<tr>
        	<td width="870" >
             <select name="select_phone">
  			  <option >мпиарпарпа</option>
   			 <option>рпар  парпарпарп рп </option>
             <option>рпар пар апр апр а рпа</option>
  			</select>
            </td>
            
            <td width="135">
            <input type="submit" value="Удалить" name="delete_repair" class="delete_btn">
            </td>
            
        </tr> 
    
    </table>
</aside>