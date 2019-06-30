<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp" />
<body>
	<div class="container">
		<div class="row">
			<div class="frame">
				<div>
					<table class="table table-hover" id="acc_table">
						<tr>
							<th>Farm ID</th>
							<th>Name</th>
							<th>Address</th>
							<th>Account</th>
						</tr>
						<c:forEach var="farm" items="${farms}">
							<tr>
								<td>${farm.id}</td>
								<td>${farm.name}</td>
								<td>${farm.address}</td>
								<td>${farm.account.username}</td>
							</tr>
						</c:forEach>
					</table>
				</div>
			</div>
		</div>
	</div>
</body>
<jsp:include page="footer.jsp" />