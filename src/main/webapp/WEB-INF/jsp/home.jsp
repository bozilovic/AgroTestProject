<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<jsp:include page="header.jsp" />
<body>
	<div class="container">
		<div class="row">
			<div class="frame">
				<p id="welcome_title">Welcome <b>${user.firstName} ${user.lastName}</b></p>
				<p>
					<button class="btn btn-primary" type="button"
						data-toggle="collapse" data-target="#collapseExample"
						aria-expanded="false" aria-controls="collapseExample">
						Accounts</button>
				</p>
				<div class="collapse" id="collapseExample">
					<div>
						<table class="table table-hover" id="acc_table">
							<tr>
								<th>Account name</th>
								<th>Owner</th>
								<th>Address</th>
								<th></th>
							</tr>
							<c:forEach var="account" items="${user.accounts}">
							<tr>
								<td><a href="/accounts/${account.id}">${account.username}</a></td>
								<td>${account.customer.name}</td>
								<td>${account.customer.address}</td>
								<td>
									<form action=<c:url value="/accounts/${account.id}/farms" /> method="post">
									<button type="submit" class="btn btn-outline-primary">Farms</button>
									</form>
								</td>
							</tr>
							</c:forEach>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
</body>
<jsp:include page="footer.jsp" />