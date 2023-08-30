<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
   <style>
        table{
            border: 1px solid black;

        }
        tr{
            border: 1px solid black;
        }
        td{
            border: 1px solid black;
        }
        
    </style>
</head>

<body>
       
    <table>
        <tr>
            <td >참가자 id</td>
            <td colspan="6"><input type="text">

            </td>
            
        </tr>

        <tr>
            <td>참가자이름</td>
            <td colspan="6"><input type="text">

            </td>
        </tr>

        <tr>
            <td>1321</td>
            <td colspan="6"><input type="text">년
                <input type="text">월
                <input type="text">일
            </td>
        </tr>
        <tr>
            <td>성별</td>
            <td colspan="6"> <input type="radio" name="gender" >남자<input type="radio"name="gender" >여자</td>
         
        </tr>
        <tr>
            <td>1321</td>
            <td>
                <select>
                    <option>선택</option>
                    <option>V</option>
                    <option>D</option>
                    <option>R</option>
                </select></td>
        </tr>
        <tr>
            <td >매력무대</td>
            <td colspan="6"><input type="text">

            </td>
            
        </tr>
        <tr>
          
            <td colspan="6">
                <button>저장</button>
                <button>취소</button>
            </td>
            
        </tr>


    </table>

</body>
</html>
