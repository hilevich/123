<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<aside  class="main_admin">
	<table class="table_iphone">
    	<tr >
        	<td colspan="5" align="center">
          	<h3>Цвет</h3>
	        </td>
        </tr>
    	<form action="/admin/formColor" method="POST" modelAttribute="formColor">
    	<tr>
        	<td width="185" >
             <select name="select_color">
             <c:forEach items="${colors}"  var="colorN">
  			  <option >${colorN.color}</option>
   			 
   			 </c:forEach>
  			</select>
            </td>
            <td colspan="2" width="510">
           <input placeholder="Введить цвет" name="color" width="495">
            </td>
            
            <td width="145">
            <input type="submit" value="Добавить" name="save_color" class="save_btn">
            </td>
            <td width="145">
            <input type="submit" value="Удалить" name="delete_color" class="delete_btn">
            </td>
        </tr> 
          </form>
      
    </table>
    
    <table class="table_iphone">
    	<tr >
        	<td colspan="5" align="center">
          	<h3>RAM</h3>
	        </td>
        </tr>
    	<form action="formRam" method="post">
    	<tr>
        	<td width="200">
             <select name="select_ram" class="sel_opt">
             <c:forEach items="${rams}"  var="ram">
  			  <option >${ram.value} GB</option>
   			 
   			 </c:forEach>
   			 
   			 
  			</select>
            </td>
            <td width="130">
           <input placeholder="Введить число" name="value_ram" pattern="^[ 0-9]+$">
            </td>
             <td width="370">
           <input placeholder="Введить опис" name="description_ram" >
            </td >
            <td width=" 150px">
            <input type="submit" value="Добавить" name="save_ram" class="save_btn">
            </td>
            <td width=" 150px">
            <input type="submit" value="Удалить" name="delete_ram" class="delete_btn">
            </td>
        </tr> 
          </form>
      
    </table>
    
     <table class="table_iphone">
    	<tr >
        	<td colspan="5" align="center">
          	<h3>Пам'ять</h3>
	        </td>
        </tr>
    	<form action="formMemory" method="post">
    	<tr>
        	<td width="200">
             <select name="select_memory" class="sel_opt">
  			  <option >16GB</option>
   			 <option>32GB</option>
  			</select>
            </td>
            <td width="130">
           <input placeholder="Введить число" name="value_memory" pattern="^[ 0-9]+$" >
            </td>
             <td width="370">
           <input placeholder="Введить опис" name="description_memory" >
            </td >
            <td width=" 150px">
            <input type="submit" value="Добавить" name="save_memory" class="save_btn">
            </td>
            <td width=" 150px">
            <input type="submit" value="Удалить" name="delete_memory" class="delete_btn">
            </td>
        </tr> 
          </form>
      
    </table>
    
    
     <table class="table_iphone">
    	<tr >
        	<td colspan="5" align="center">
          	<h3>Процесор</h3>
	        </td>
        </tr>
    	<form action="formProcesor" method="post">
    	<tr>
        	<td width="200">
             <select name="select_procesor" class="sel_opt">
  			  <option >16GB</option>
   			 <option>32GB</option>
  			</select>
            </td>
            <td width="130">
           <input placeholder="Введить число" name="value_procesor" pattern="^[ 0-9]+$" >
            </td>
             <td width="370">
           <input placeholder="Введить опис" name="description_procesor" >
            </td >
            <td width=" 150px">
            <input type="submit" value="Добавить" name="save_procesor" class="save_btn">
            </td>
            <td width=" 150px">
            <input type="submit" value="Удалить" name="delete_procesor" class="delete_btn">
            </td>
        </tr> 
          </form>
      
    </table>
    
     <table class="table_iphone">
    	<tr >
        	<td colspan="5" align="center">
          	<h3>Дисплей</h3>
	        </td>
        </tr>
    	<form action="formDisplay" method="post">
    	<tr>
        	<td width="200">
             <select name="select_Display" class="sel_opt">
  			  <option >4"</option>
   			 <option>4.7"</option>
  			</select>
            </td>
            <td width="130">
           <input placeholder="Введить число" name="value_Display" pattern="\d+(\.\d{1})?">
            </td>
             <td width="370">
           <input placeholder="Введить опис" name="description_Display" >
            </td >
            <td width=" 150px">
            <input type="submit" value="Добавить" name="save_Display" class="save_btn">
            </td>
            <td width=" 150px">
            <input type="submit" value="Удалить" name="delete_Display" class="delete_btn">
            </td>
        </tr> 
          </form>
      
    </table>
    
   <table class="table_iphone">
    	<tr >
        	<td colspan="5" align="center">
          	<h3>Другие характеристинки</h3>
	        </td>
        </tr>
    	<form action="formAddCh" method="post">
    	<tr>
        	<td width="200">
             <select name="select_AddCh" class="sel_opt">
  			  <option >123</option>
   			 <option>4354f</option>
  			</select>
            </td>
            <td width="130">
           <input placeholder="Введить назву" name="value_AddCh" >
            </td>
             <td width="370">
           <input placeholder="Введить опис" name="description_AddCh" >
            </td >
            <td width=" 150px">
            <input type="submit" value="Добавить" name="save_AddCh" class="save_btn">
            </td>
            <td width=" 150px">
            <input type="submit" value="Удалить" name="delete_AddCh" class="delete_btn">
            </td>
        </tr> 
          </form>
      
    </table>

	<table class="table_iphone">
    	<tr >
        	<td colspan="5" align="center">
          	<h3>Назва телефона</h3>
	        </td>
        </tr>
    	<form action="formPhone" method="post">
    	<tr>
        	<td width="185" >
             <select name="select_phone">
  			  <option >IPhone 3g</option>
   			 <option>IPhone 4</option>
             <option>IPhone 4g</option>
  			</select>
            </td>
            <td colspan="2" width="510">
           <input placeholder="Введить назву" name="phone_name" >
            </td>
            
            <td width="145">
            <input type="submit" value="Добавить" name="save_phone" class="save_btn">
            </td>
            <td width="145">
            <input type="submit" value="Удалить" name="delete_phone" class="delete_btn">
            </td>
        </tr> 
          </form>
      
    </table>
</aside>