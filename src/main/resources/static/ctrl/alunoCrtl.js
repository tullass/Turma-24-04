app.controller("alunoController", function($scope, $routeParams,$http, alunoService) {

	function novo() {
		$scope.aluno = {};
	}
	$scope.create = function(aluno) {
		alunoService.salvar(aluno).then(alert("Aluno Sallvo com Sucesso"));
		listar();
		novo();
	};

	var id = $routeParams.id;
	if (id) {
		alunoService.getAluno(id).then(function(response) {
			$scope.aluno = response.data;
		});
	} else {
		$scope.aluno = {};

	}

	listar();
	function listar() {
		alunoService.listar().then(function(resp) {
			$scope.alunos = resp.data;
		});
	}
	;
	listarTurm();
	function listarTurm() {
		alunoService.listarTurma().then(function(resp) {
			$scope.alunos = resp.data;
		});
	};
	listarProv();
	function listarProv() {
		alunoService.listarProvincia().then(function(resp) {
			$scope.pronvicias = resp.data;
		});
	};
	

	$scope.alterar = function(aluno) {
		$scope.aluno = aluno;
	};

	
});
