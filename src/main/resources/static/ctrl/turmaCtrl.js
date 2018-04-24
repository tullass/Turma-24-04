app.controller("turmaController", function($scope, turmaService) {

	function novo() {
		$scope.turma = {};
	}
	$scope.create = function(turma) {
		turmaService.salvar(turma).then(alert("Classe SaLva com Sucesso"));
		listar();
		novo();
	};
	listar();
	function listar() {
		turmaService.listar().then(function(resp) {
			$scope.turmas = resp.data;
		});
	}
	;
	listarClasses();
	function listarClasses() {
		turmaService.listarClasse().then(function(resp) {
			$scope.classes = resp.data;
		});
	}
	;
	$scope.alterar = function(turma) {
		$scope.turma = turma;
	};
	$scope.turnos = [ {
		nome : 'Matutuino',
		id : 1
	}, {
		nome : 'Verpestino',
		id : 2
	}, {
		nome : 'Pos-Laboral',
		id : 3
	}, ];
});
