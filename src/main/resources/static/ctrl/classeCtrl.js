app.controller("classeController", function($scope, nivelService) {

	function novo() {
		$scope.nivel = {};
	}
	$scope.create = function(nivel) {
		nivelService.salvar(nivel).then(alert("Classe SaLva com Sucesso"));

		novo();listar();
	};
	listar();
	function listar() {
		nivelService.listar().then(function(resp) {
			$scope.nivels = resp.data;
		});
	}
	;

	$scope.alterar = function(nivel ) {
		$scope.nivel = nivel;
	};
});
