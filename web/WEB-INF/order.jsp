<%@ page contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <meta charset="ISO-8859-1">
    <title>Đặt hàng</title></head>
<body><h1>Đặt hàng</h1>
<form method='post' action='/Order'>
    <table>
        <tr>
            <td>Họ tên:</td>
            <td><input name='name'/></td>
        </tr>
        <tr>
            <td>Địa chỉ:</td>
            <td><textarea name='address' cols='40' rows='5'></textarea></td>
        </tr>
        <tr>
            <td>Thành phố:</td>
            <td><select name='city'>
                <option>Hà Nội</option>
                <option>TP Hồ Chí Minh</option>
            </select></td>
        </tr>
        <tr>
            <td>Vận chuyển:</td>
            <td><input type='radio' name='deliveryMethod' value='HanoiPost'/>Hà Nội Post
                <input type='radio' name='deliveryMethod' value='GiaoHangTietKiem'/>Giao Hàng Tiết Kiệm
            </td>
        </tr>
        <tr>
            <td>Ghi chú:</td>
            <td><textarea name='note' cols='40' rows='5'></textarea></td>
        </tr>
        <tr>
            <td>Đăng ký nhận bản tin:</td>
            <td><input type='checkbox' name='catalogRequest'/></td>
        </tr>
        <tr>
            <td>&nbsp;</td>
            <td><input type='reset' value='Nhập lại'/><input type='submit' value='Xác nhận'/></td>
        </tr>
    </table>
</form>
</body>
</html>