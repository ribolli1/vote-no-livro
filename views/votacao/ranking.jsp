<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>

<head>

<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="description"
	content="Projeto pessoal Filipe Santiago Ribolli">
<meta name="author" content="Filipe Santiago Ribolli">
<link rel="icon" href="resources/img/logos/favicon.jpg">

<title>Filipe S. Ribolli</title>

<link href="resources/css/bootstrap.min.css" type="text/css"
	rel="stylesheet">

</head>

<script src="resources/js/jquery.js"></script>
<script src="resources/js/bootstrap.min.js"></script>
<link href="resources/css/styleslivro.css" type="text/css"
	rel="stylesheet">

<body>

	<div class="container">
		<div id="loginbox" style="margin-top: 50px;"
			class="col-md-6 col-md-offset-3">

			<div class="panel panel-info">

				<div class="panel-heading">
					<div class="panel-title text-center">
						<span class="glyphicon glyphicon-star-empty" aria-hidden="true"></span> Ranking
					</div>
				</div>

				<div style="padding-top: 30px" class="panel-body">
					<form>
						<div style="float: left;" class="col-md-2">
							<table class="table table-striped">
								<thead>
									<th>Colocação</th>
								</thead>
								<tr>
									<td><c:forEach begin="1" end="4">
											<span class="glyphicon glyphicon-star" aria-hidden="true"></span>
										</c:forEach></td>
								</tr>
								<tr>
									<td><c:forEach begin="1" end="3">
											<span class="glyphicon glyphicon-star" aria-hidden="true"></span>
										</c:forEach></td>
								</tr>
								<tr>
									<td><c:forEach begin="1" end="2">
											<span class="glyphicon glyphicon-star" aria-hidden="true"></span>
										</c:forEach></td>
								</tr>
								<tr>
									<td><span class="glyphicon glyphicon-star"
										aria-hidden="true"></span></td>
								</tr>
								<tr>
									<td><span class="glyphicon glyphicon-thumbs-down"
										aria-hidden="true"></span></td>
								</tr>
							</table>

						</div>
						<div style="float: right;" class="col-md-10">

							<table class="table text-center table-striped">
								<thead>
									<th class="text-center">Livro</th>
									<th class="text-center">Votos</th>
								</thead>

								<c:forEach items="${pontuacao}" var="pontuacao">
									<tr>
										<td>${pontuacao.nome}</td>
										<td>${pontuacao.pontos}</td>
									</tr>
								</c:forEach>

							</table>

						</div>
						<div class="col-md-6 text-center">
							<a href="vote-no-livro"><span
								class="glyphicon glyphicon-share" aria-hidden="true"></span>
								Votar Novamente ! </a>

						</div>
						<div class="col-md-6 text-center">
							<a href="index.jsp"><span class="glyphicon glyphicon-home"
								aria-hidden="true"></span> Ir para Home </a>
						</div>

					</form>
				</div>
			</div>
		</div>
	</div>

</body>
</html>