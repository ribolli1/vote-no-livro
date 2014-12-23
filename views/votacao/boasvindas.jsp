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
<link href="resources/css/styles.css" type="text/css" rel="stylesheet">

</head>

<script src="resources/js/jquery.js"></script>
<script src="resources/js/bootstrap.min.js"></script>

<body>

	<div class="container - fluid">
		<div id="loginbox" style="margin-top: 50px;"
			class="mainbox col-md-6 col-md-offset-3 col-sm-8 col-sm-offset-2">
			<div class="panel panel-info">
				<div class="panel-heading">
					<div class="panel-title">Muito Obrigado por participar da
						votação !</div>
				</div>
				<div style="padding-top: 30px" class="panel-body">

					<form action="adicionaUser" method="post" id="ranking"
						class="form-horizontal" role="form">

						<div style="margin-bottom: 25px" class="input-group">
							<span class="input-group-addon"> <i
								class="glyphicon glyphicon-user"></i></span> <input id="nome"
								type="text" class="form-control" name="nome" value=""
								placeholder="Nome" required>
						</div>

						<div style="margin-bottom: 25px" class="input-group">
							<span class="input-group-addon"><i
								class="glyphicon glyphicon-globe"></i></span> <input id="email"
								type="text" class="form-control" name="email"
								placeholder="Email" required>
						</div>
						<div style="margin-top: 10px" class="form-group">
							<div class="col-sm-12 controls">
								<button class="btn btn-lg btn-primary btn-block" type="submit"
									value="Ver Ranking">Ver Ranking</button>
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</div>

</body>

</html>