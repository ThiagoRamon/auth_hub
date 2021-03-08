<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Login Registration</title>
<link rel="stylesheet" type="text/css" href="assets/css/style.css"/>
</head>
<body>

	<header class="header">
		<article class="article">
			
			<section class="section">
				<nav class="nav-bar">
					<div class="logo-wrap">
						<h1 class="logo"><a href="index.jsp" class="link">LOGO</a></h1>
					</div>
					<div class="menu-wrap">
						<div class="menu">
							<a href="signin.jsp" class="menu-item link">Sign In</a> |
							<a href="signup.jsp" class="menu-item link">Sign Up</a>
						</div>
					</div>
				</nav>
			</section>
		</article>
	</header>
	<main class="main">
		
		<article class="article">
			<section class="section"><h1>Sign In</h1></section>
			<section class="section">
				<div class="form-wrap">
					<form action="" class="form">
						<div class="input-wrap input-line">
							<input type="email" name="email" placeholder="Email" class="input"/>
						</div>
						<div class="input-wrap input-line">
							<input type="password" name="password" placeholder="Password" class="input"/>
						</div>
						<div class="input-wrap input-line">
							<input type="submit"	value="Sign in" class="input"/>
						</div>
					</form>
				</div>
			</section>
		</article>
		
	</main>
	
</body>
</html>