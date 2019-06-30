<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp" /> 
<body>
<div class="container">
		<div class="row">
			<div class="wrapper fadeInDown">
				<div id="formContent">
					<form action=<c:url value="/home" /> method="post">
						<input type="text" id="login" class="fadeIn second" name="username" placeholder="username" autocomplete="off">
						<input type="text" id="password" class="fadeIn third" name="password" placeholder="password" autocomplete="off">
						<input type="submit" class="fadeIn fourth" value="Log In">
					</form>
				</div>
			</div>
		</div>
	</div>
</body>
<jsp:include page="footer.jsp" />