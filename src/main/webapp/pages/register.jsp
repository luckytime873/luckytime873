<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2024/4/16
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE    html PUBLIC    "-//W3C//DTD XHTML 1.0 Strict//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <title>贵美商城</title>
    <link rel="stylesheet" type="text/css" href="../css/global.css"/>
    <link rel="stylesheet" type="text/css" href="../css/error.css"/>
    <link rel="stylesheet" type="text/css" href="../css/layout.css"/>
    <script type="text/JavaScript" src="../js/func.js"></script>

    <script type="text/javascript" src="../script/jquery-1.7.2.js"></script>
    <script type="text/javascript">
        $(function () {
            $("#sub_resp").click(function () {
                var usernameText=$("#username").val();
                var usernameRag=/^[a-zA-Z]\w{5,17}$/
                if (!usernameRag.test(usernameText)){
                    $("span.errorMsg").text("用户名不合法")
                    return false;
                }
            })
        })

    </script>
</head>
<body>
<div id="container">
    <iframe id="header" src="header.jsp" width="980" height="136" frameborder="0" scrolling="no"></iframe>
    <form id="form1" method="post" action="userServlet">
        <input type="hidden" name="action" value="register" />
        <table class="reg" cellspacing="0px" cellpadding="0px">
            <tbody>
            <tr>
                <td>
                    <!--错误信息显示地方 -->
                    <span class="errorMsg"></span>
                </td>
            </tr>
            <tr>
                <td class="a_r"><label for="username">登录名：</label></td>
                <td><input name="username" id="username" type="text"/>（以字母开头，长度在6~18之间，只能包含字母、数字和下划线）
                </td>
            </tr>
            <tr>
                <td class="a_r"><label for="password">密码：</label></td>
                <td><input name="password" id="password" type="password"/>（要求密码的长度在6到16个字符之间）</td>
            </tr>
            <tr>
                <td class="a_r"><label for="rpass">再次输入密码：</label></td>
                <td><input name="rpass" id="rpass" type="password"/></td>
            </tr>
            <tr>
                <td class="a_r"><label for="email">电子邮箱：</label></td>
                <td><input name="email" id="email" type="text"/>（必须包含 @ 字符）</td>
            </tr>
            <tr>
                <td class="a_r"><label for="gender">性别：</label></td>
                <td>
                    <input name="gender" id="gender" class="b0" type="radio" value="0" checked="checked"/>
                    <img src="../images/male.gif" alt="alt"/>男&nbsp;
                    <input name="gender" class="b0" type="radio" value="1"/>
                    <img src="../images/female.gif" alt="alt"/>女

                </td>
            </tr>
            <tr>
                <td class="a_r"><label for="hobby">爱好：</label></td>
                <td>
                    <input class="b0" type="checkbox" name="hobby" id="hobby" value="checkbox"/>&nbsp;运动&nbsp;&nbsp;
                    <input class="b0" type="checkbox" name="hobby2" value="checkbox"/>&nbsp;聊天&nbsp;&nbsp;
                    <input class="b0" type="checkbox" name="hobby3" value="checkbox"/>&nbsp;玩游戏

                </td>
            </tr>
            <tr>
                <td colspan="2" class="pl150"><input id="sub_resp" type="image" name="submit" class="b0"
                                                     src="../images/submit.gif"/></td>
            </tr>
            </tbody>
        </table>
    </form>
    <iframe id="footer" src="footer.htm" width="980" height="150" frameborder="0" scrolling="no"></iframe>
</div><!--container	end-->
</body>
