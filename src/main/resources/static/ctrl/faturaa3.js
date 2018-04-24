angular.module("factura", []);
angular.module("factura").controller(
		"facturaController",
		function($scope, $http) {
			var urlBase = 'http://localhost:8080/fatura';
			var items = [];
			$scope.items = [ {
				nome : '5%',
				valuei : 0.05
			}, {
				nome : '10%',
				valuei : 0.10
			}, {
				nome : '15%',
				valuei : 0.15
			}, {
				nome : '25%',
				valuei : 0.25
			}, {
				nome : '50%',
				valuei : 0.50
			}, {
				nome : '100%',
				valuei : 0.100
			}, ];

			$scope.meses = [ {
				id : 1,
				nome : 'Janeiro'
			}, {
				id : 2,
				nome : 'Fevereiro'
			}, {
				id : 3,
				nome : 'Marco'
			}, {
				id : 4,
				nome : 'Abril'
			}, {
				id : 5,
				nome : 'Maio'
			}, {
				id : 6,
				nome : 'Junho'
			}, {
				id : 7,
				nome : 'Julho'
			}, {
				id : 8,
				nome : 'Agosto'
			}, {
				id : 9,
				nome : 'Setembro'
			}, {
				id : 10,
				nome : 'Outubro'
			}, {
				id : 11,
				nome : 'Novembro'
			}, {
				id : 12,
				nome : 'Dezembro'
			} ];
			$scope.pesquisa = true;
			$scope.prestacao = [ {
				nome : '2-Prestacoes',
				valuei : 2
			}, {
				nome : '3-Prestacoes',
				valuei : 3
			}, {
				nome : '5-Prestacoes',
				valuei : 5
			}, {
				nome : '6-Prestacoes',
				valuei : 6
			}, {
				nome : '7-Prestacoes',
				valuei : 7

			}, {
				nome : '8-Prestacoes',
				valuei : 8

			}, {
				nome : '9-Prestacoes',
				valuei : 9

			}, {
				nome : '10-Prestacoes',
				valuei : 7

			}, {
				nome : '10-Prestacoes',
				valuei : 7

			}, ];

			$scope.time = new Date();
			var totalfatur = 1000;
			$scope.fatura = {};
			var novo = function() {
				$scope.fatura = {};
			}
			$scope.add = function() {
				var metodo = 'POST';
				if ($scope.fatura.id) {
					metodo = 'PUT';
				}
				$http({
					method : metodo,
					url : urlBase + '/',
					data : $scope.fatura
				}).then(function successCallback(response) {
					alert("Sucesso");
					novo();

				}, function errorCallback(response) {
					alert("Erro");
					console.log(response);
				});
			};
			var listaAlunoa = function() {
				$http({
					method : 'GET',
					url : urlBase + '/listar/'
				}).then(function successCallback(response) {
					$scope.faturas = response.data;
					$scope.aluno = undefined;
				}, function errorCallback(response) {
				});
			};

			listaAlunoa();
			var listaAluno = function() {
				$http({
					method : 'GET',
					url : urlBase + '/aluno/'
				}).then(function successCallback(response) {
					$scope.alunos = response.data;
					$scope.aluno = undefined;
				}, function errorCallback(response) {
				});
			};

			listaAluno();
			var listabancoo = function() {
				$http({
					method : 'GET',
					url : urlBase + '/uservico/'
				}).then(function successCallback(response) {
					$scope.bancos = response.data;
				}, function errorCallback(response) {
				});
			};

			listabancoo();

			var listatipo = function() {
				$http({
					method : 'GET',
					url : urlBase + '/listarr/'
				}).then(function successCallback(response) {
					$scope.tipos = response.data;
				}, function errorCallback(response) {
				});
			};

			listatipo();

			$scope.alterar = function(aluno) {
				$scope.fatura.aluno = aluno;

			};
			$scope.refresh = function() {
				alert("Methodo ainda em construcao");
			};

			$scope.exportToPdf = function() {
				html2canvas(document.getElementById('customers'), {
					onrendered : function(canvas) {
						var data = canvas.toDataURL();
						var docDefinition = {
							content : [ {
								image : data,
								width : 550,
							} ]
						};
						pdfMake.createPdf(docDefinition)
								.download("example.pdf");
					}
				});
			}

			$scope.cal = function() {

				var multa = $scope.fatura.aluno.nivel.valor
						* $scope.fatura.desconto;
				$scope.fatura.multa = multa;

				var total = $scope.fatura.aluno.nivel.valor * 1
						+ $scope.fatura.multa * 1;
				$scope.fatura.caixa = total;

				var banco = $scope.fatura.aluno.nivel.valor * 1
						+ $scope.fatura.multa * 1;
				$scope.fatura.banco.valor = banco;
			};

		});