<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<aside  class="main_admin">
	<table class="table_iphone">
    	
    	<form action="formShopPhone" method="post">
    		
        
        <tr>
        	<td width="250" >
            <span>Модель</span>
             <select name="select_ShopPhone">
  			  <option value="">IPhone 3g</option>
   			 <option value="">IPhone 4</option>
             <option value="">IPhone 4g</option>
  			</select>
            </td>
            <td  width="250">
            <span>Цвет</span>
            <select name="select_color_ShopPhone" class="sel_opt">
  			  <option value="">Silver</option>
   			 <option value="">Black</option>
  			</select>
            </td>
            <td  width="250">
            <span>памьяти</span>
            <select name="select_memory_ShopPhone" class="sel_opt">
  			  <option value="">16GB</option>
   			 <option value="">32GB</option>
  			</select>
            </td>
            <td width="250">
            <span>Оперативная памьять</span>
            <select name="select_procesor_ShopPhone" class="sel_opt">
  			  <option value="">16GB</option>
   			 <option value="">32GB</option>
  			</select>
            </td>
           
        </tr> 
        
        <tr height="80">
        	<td width="250" >
            <span>Дисплей</span>
              <select name="select_Display_ShopPhone" class="sel_opt">
  			  <option value="">4"</option>
   			 <option value="">4.7"</option>
  			</select>
            </td>
            <td  width="250">
            <span>Другие характеристики</span>
            <select name="select_AddCh_ShopPhone" class="sel_opt" multiple size="3">
  			  <option value="">123</option>
   			 <option value="">4354f</option>
             <option value="">123</option>
   			 <option value="">4354f</option>
  			</select>
            </td>
            <td  width="250">
            <span>Картинки телефона</span>
             <input placeholder="URL картинки телефона" name="url_ShopPhone" value="">
            </td>
            <td width="250">
            <span>Цена</span>
             <input placeholder="Введить цeну в доларах " name="price_ShopPhone" value="" pattern="^[ 0-9]+$" >
            </td>
           
        </tr> 
        
        <tr>
        	<td width="250" >
            <span>Описание Заголовок</span>
              <input placeholder="Введить заголовок опису" name="title_ShopPhone" value="">
            </td>
            <td  width="250">
            <span>Описание</span>
            <input placeholder="Введить Опис" name="description_ShopPhone" value="">
            </td>
            <td  width="250">
            <span>Видео</span>
            <input placeholder="URl видео опису" name="url_video_ShopPhone" value="">
            </td>
            <td width="250">
            <span>Описание Картинки</span>
             <input placeholder="URL картинки опису" name="url_picture_ShopPhone"  value="">
            </td>
           
        </tr> 
        
        <tr>
        	<td width="250" colspan="2">
            <span></span>
              <input type="submit" value="Добавить/изменить" name="save_AddCh" class="save_btn" >
            </td>
            
            <td width="250" colspan="2">
            <span></span>
            <input type="submit" value="Удалить" name="delete_AddCh" class="delete_btn">
            </td>
            
        </tr> 
          </form>
      
    </table>
    
    
</aside>