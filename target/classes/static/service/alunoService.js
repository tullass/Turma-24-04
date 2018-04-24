app.service('alunoService', function($http) {
	var urlb = 'http://localhost:8080/aluno';

	this.salvar = function(aluno) {
		if (aluno.id) {
			return $http.put(urlb, aluno);
		} else {
			return $http.post(urlb + '/', aluno);
		}
	};

	this.getAluno = function(id) {
		return $http.get(urlb + '/a/' + id);
	};
	this.listar = function() {
		return $http.get(urlb + '/listar');
	};
	this.listarTurma = function() {
		return $http.get(urlb + '/listarTurmas');
	};
	this.listarProvincia = function() {
		return $http.get(urlb + '/userr/pronvicia');
	};

});