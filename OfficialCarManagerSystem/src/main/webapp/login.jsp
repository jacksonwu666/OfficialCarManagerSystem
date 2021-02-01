<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
		<title>登录页</title>
		<!-- 引入css样式 -->

		<link rel="stylesheet" href="css/base.css" />
		<link rel="stylesheet" href="css/login.css" />
		<link rel="stylesheet" href="layui/css/layui.css">
		<link rel="stylesheet" href="layer/skin/layer.css">

		<script type="text/javascript" src="js/jquery-1.7.1.min.js"></script>
		<script type="text/javascript" src="js/jquery.cookie.js"></script>
		<script type="text/javascript" src="layui/layui.js"></script>
		<script type="text/javascript" src="layer/layer.js"></script>

		<style>
			html{height: 100%}
        body{
			margin: 0 ;height: 100%;
            background: #2171BB;
			background:url(img/login1.jpg) no-repeat ;
			background-size: 100% 100%;
			}
        canvas{
			display: block;width: 100%;height: 100%;
			}
        .body_content{
            position: absolute;
            top:30%;
            left: 20%;
            height: 20%;
            background: palevioletred;
            width: 20%;
        }
        /* 	验证码 隐藏滚动条 */
		.imgcode{
			width: 95px;
			position: absolute;
			right: 0;
			top: 0px;
			cursor: pointer;
			height: 46px;
			font-size: 24px;
			text-align: center;
			line-height: 46px; 
		}
		::-webkit-scrollbar{
			display:none;
		}
    </style>
	</head>
	<body onload="changeImg()" onkeydown="keyLogin()">
		<div id="content" class="content">

			<div class="banner-box">

				<form id="mainForm" class="main-form">
					<div class="tab-title">
						<a class="linkABlue" id="toAccountLogin" href="login.jsp">账号登录</a>
						<span class="register-line"></span>
						<a class="linkAGray" id="toVCodeLogin" href="register.jsp">账号注册</a>
					</div>
					<div id="errorMsg" class="tip-box visiblility-hidden">
						<i class="err-ico"></i>
						<span class="tip-font" id="tipMsg">请填写完整的登录信息</span>
						<span id="closeErrorMsg" class="close-ico"></span>
					</div>

					<!-- 用户名 -->
					<div class="normalInput" id="cycode-box">
						<input class="ipt-account inp-focus" name="account" id="account" maxlength="50" placeholder="邮箱/用户名" autocomplete="off"
						 onfocus="closeErrorMsg()" />
					</div>
					<!-- 密 码 -->
					<div class="normalInput ">
						<input type="password" class="inp-focus" name="password" id="password" maxlength="16" autocomplete="off"
						 placeholder="密码" onfocus="closeErrorMsg()" />

					</div>
					<!-- 验证码 -->
					<div class="normalInput " id="cycode-box">
						<input class="ipt-account inp-focus" name="verify" id="verify" maxlength="50" placeholder="验证码" autocomplete="off"
						 onfocus="closeErrorMsg()" />
						<span id="code" class="imgcode"></span>
						<!-- 		   <img src="test.jpg" class="imgcode" id="code"> -->
					</div>


					<!-- 记住登录信息 -->
					<div class="layui-form">
						<input type="checkbox" name="remember" id="remember" lay-skin="primary" title="记住登录信息" checked>
					</div>
					<br />

					<a id="login" class="fullBtnBlue">登录</a>
					<div class="transferField">
						<a class="go2forgetpwd linkABlue rememberFieldForA" href="#">忘记密码?</a>
					</div>

				</form>

			</div>

		</div>


		<canvas id="canvas"></canvas>
		<script src="js/index.js"></script>
		<script type="text/javascript">
			//一加载就执行填充信息  用于记住登录信息
			$(document).ready(function() {
				if ($.cookie("password") != '') {
					$("#password").val($.cookie("password"));
				}
				if ($.cookie("account") != '') {
					$("#account").val($.cookie("account"));
				}

			})


			//不加这个复选框样式不会改变
			layui.use('form', function() {
				var form = layui.form; //只有执行了这一步，部分表单元素才会自动修饰成功
			});


			//回车登录
			function keyLogin() {
				if (event.keyCode == 13) { //回车键的键值为13
					//document.getElementById("login").click(); //调用登录按钮的登录事件
					//或者使用jquery实现
					$("#login").click();
				}
			}

			//用于验证码
			var code; //声明一个变量用于存储生成的验证码  
			document.getElementById("code").onclick = changeImg;

			function changeImg() {
				//alert("换图片");  
				var arrays = new Array(
					'1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
					'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j',
					'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't',
					'u', 'v', 'w', 'x', 'y', 'z',
					'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J',
					'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T',
					'U', 'V', 'W', 'X', 'Y', 'Z'
				);
				code = ''; //重新初始化验证码  
				//alert(arrays.length);  
				//随机从数组中获取四个元素组成验证码
				for (var i = 0; i < 4; i++) {
					//随机获取一个数组的下标  
					var r = parseInt(Math.random() * arrays.length);
					code += arrays[r];
					//alert(arrays[r]);  
				}
				//alert(code);  
				document.getElementById('code').innerHTML = code; //将验证码写入指定区域  
			}

			//点击登录事件
			$("#login").click(function() {
				var account = $("#account").val();
				var password = $("#password").val();
				var verify = $("#verify").val();
				if (account == "" || password == "" || verify == "") {
					var obj = document.getElementById("errorMsg");
					$("#tipMsg").html("请填写完整的登录信息！");
					obj.setAttribute("class", "tip-box visiblility-show");
					return;
				}
				//验证码不对
				if (code.toLowerCase() != verify) {
					//提示错误信息
					var obj = document.getElementById("errorMsg");
					//修改提示文字
					$("#tipMsg").html("请填写正确的验证码！");
					obj.setAttribute("class", "tip-box visiblility-show");
					return;
				}
				//判断是否勾选记住登录信息
				if ($("#remember").prop("checked") == true) {
					//记录信息
					var account = $("#account").val();
					var password = $("#password").val();
					//alert(passWord);
					$.cookie("account", account);
					$.cookie("password", password, {
						expires: 7
					}); // 存储一个带7天期限的 cookie 如果{ expires: 7 } 
				} else {
					$.cookie("account", "");
					$.cookie("password", "");
				}

				//发送ajax请求
				$.ajax({
					type: 'POST',
					url: 'login.action',
					data: 'account=' + account + '&password=' + password,
					dataType: 'JSON',
					success: function(data) {
						//如果密码错误，则把cookie中的password清空同时表单内容设置为空,同时清空验证码，刷新验证码
						if (data == "!0") {
							$("#password").val("");
							$.cookie("password", "");
							$("#verify").val("")
							changeImg();
							alert("密码错误");
						} else { //登录成功跳转页面
							window.location.href = '';
						}
					},
				});


			});

			//点击错误信息关闭按钮
			$("#closeErrorMsg").click(function() {
				var obj = document.getElementById("errorMsg");
				obj.setAttribute("class", "tip-box visiblility-hidden");
			});

			//关闭错误提示
			function closeErrorMsg() {
				var obj = document.getElementById("errorMsg");
				obj.setAttribute("class", "tip-box visiblility-hidden");
			};

			//验证码提示
			$('.imgcode').hover(function() {
				layer.tips("点击更换验证码", '#code', {
					time: 2000,
					tips: [2, "#3c3c3c"]
				});
			});
		</script>

	</body>
</html>
