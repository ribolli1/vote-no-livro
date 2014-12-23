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
<link href="resources/css/text.css" type="text/css" rel="stylesheet">
<link href="resources/css/bootstrap.min.css" rel="stylesheet">

<link href="resources/font-awesome-4.1.0/css/font-awesome.min.css"
	rel="stylesheet" type="text/css">
<link href="http://fonts.googleapis.com/css?family=Montserrat:400,700"
	rel="stylesheet" type="text/css">
<link href='http://fonts.googleapis.com/css?family=Kaushan+Script'
	rel='stylesheet' type='text/css'>
<link
	href='http://fonts.googleapis.com/css?family=Droid+Serif:400,700,400italic,700italic'
	rel='stylesheet' type='text/css'>
<link
	href='http://fonts.googleapis.com/css?family=Roboto+Slab:400,100,300,700'
	rel='stylesheet' type='text/css'>
<body>

	<div class="col-xs-6 text-center">

		<h2>${livro.titulo}</h2>

		<h2>
			<img class="profile-img img-thumbnail" src="${livro.foto}" alt="">
		</h2>
		<div class="profile-img text-left">
			<p>
				<b>Nome:</b> ${livro.nome}
			</p>
			<p>
				<b>Autor:</b> ${livro.autor}
			</p>
			<p>
				<b>Ano:</b> ${livro.ano}
			</p>
			<p>
				<b>Genero:</b> ${livro.genero}
			</p>
			<p>
				<b>Sinopse:</b>
			</p>
			<p>${livro.sinopse}</p>
			</br>
			<ul class="list-inline social-buttons text-center">
				<li><a href="${livro.site}"><i class="fa fa-book"></i></a></li>
				<li><a href="${livro.facebook}"><i class="fa fa-facebook"></i></a></li>
				<li><a href="${livro.youtube}"><i class="fa fa-youtube"></i></a></li>
			</ul>
			</br>
			<blockquote>
				<p>${livro.citacao}</p>
				<footer>
					${livro.autorCitacao} <cite title="Source Title"></cite>
				</footer>
			</blockquote>

			</br>
			<form action="${livro.ano}" method="POST">

				<button type="submit"
					class="btn btn-primary btn-lg btn-success text-center">Vote
					em mim !</button>
			</form>
			</br> </br>
		</div>
	</div>

	<div class="col-xs-6 text-center">

		<h2>${livroDois.titulo}</h2>

		<h2>
			<img class="profile-img img-thumbnail" src="${livroDois.foto}" alt="">
		</h2>
		<div class="profile-img text-left">
			<p>
				<b>Nome:</b> ${livroDois.nome}
			</p>
			<p>
				<b>Autor:</b> ${livroDois.autor}
			</p>
			<p>
				<b>Ano:</b> ${livroDois.ano}
			</p>
			<p>
				<b>Genero:</b> ${livroDois.genero}
			</p>
			<p>
				<b>Sinopse:</b>
			</p>
			<p>${livroDois.sinopse}</p>
			</br>
			<ul class="list-inline social-buttons text-center">
				<li><a href="${livroDois.site}"><i class="fa fa-book"></i></a></li>
				<li><a href="${livroDois.facebook}"><i
						class="fa fa-facebook"></i></a></li>
				<li><a href="${livroDois.youtube}"><i class="fa fa-youtube"></i></a></li>
			</ul>
			</br>
			<blockquote>
				<p>${livroDois.citacao}</p>
				<footer>
					${livroDois.autorCitacao} <cite title="Source Title"></cite>
				</footer>
			</blockquote>

			</br>
			<form action="${livroDois.ano}" method="POST">
				<button type="submit"
					class="btn btn-primary btn-lg btn-success text-center">Vote
					em mim !</button>
			</form>
			</br> </br>
		</div>
	</div>

	<script src="resources/js/jquery.js"></script>
	<script src="resources/js/bootstrap.min.js"></script>

</body>
</html>