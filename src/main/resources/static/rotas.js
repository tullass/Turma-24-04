var app = angular.module('bancoo', [ 'ngRoute' ]);

app.config(function($routeProvider) {

	$routeProvider.when('/bancoa/:id', {
		controller : 'bancooController',
		templateUrl : 'pages/bancoa.html'

	}).when('/bancoa', {
		controller : 'bancooController',
		templateUrl : 'pages/bancoa.html'

	}).when('/tabela', {
		controller : 'tabelaController',
		templateUrl : 'pages/tabela.html'

	}).when('/adiantadoo', {
		controller : 'adiantadoController',
		templateUrl : 'pages/adiantado.html'

	}).when('/adiantadoo/:id', {
		controller : 'adiantadoController',
		templateUrl : 'pages/adiantado.html'

	}).when('/classe', {
		controller : 'classeController',
		templateUrl : 'pages/classe.html'

	}).when('/turma', {
		controller : 'turmaController',
		templateUrl : 'pages/turma.html'

	}).when('/aluno', {
		controller : 'alunoController',
		templateUrl : 'pages/aluno.html'

	}).when('/adiantadoReport', {
		controller : 'adiantadoTabelaController',
		templateUrl : 'pages/adiantadoRelatorios.html'

	}).otherwise('/tabela');

});
