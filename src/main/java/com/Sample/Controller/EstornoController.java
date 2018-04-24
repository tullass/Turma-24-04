package com.Sample.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Sample.Entity.Estorno;
import com.Sample.Service.AlunoService;
import com.Sample.Service.BancoService;
import com.Sample.Service.EstornoService;
import com.Sample.Service.FaturaService;
import com.Sample.Service.TipoService;

@RestController
@RequestMapping("estorno")
public class EstornoController {

	@Autowired
	private EstornoService estornoService;
	@Autowired
	private FaturaService faturaService;

	@Autowired
	private TipoService tipoService;

	@Autowired
	private AlunoService alunoService;

	@Autowired
	private BancoService bancoService;

	@RequestMapping(value = "/listarTodos", method = RequestMethod.GET)
	@ResponseBody
	public Object indexs() {
		return faturaService.findAll();
	}

	@RequestMapping(value = "/listarAtivos", method = RequestMethod.GET)
	@ResponseBody
	public Object indesx() {
		return faturaService.findByAdiantamentos(true);
	}

	@RequestMapping(value = "/listarBanco", method = RequestMethod.GET)
	@ResponseBody
	public Object indexss() {
		return bancoService.findAll();
	}

	@RequestMapping(value = "/listarTipo", method = RequestMethod.GET)
	@ResponseBody
	public Object indexx() {
		return tipoService.findAll();
	}

	@RequestMapping(value = "/listarAluno", method = RequestMethod.GET)
	@ResponseBody
	public Object indexxx() {
		return alunoService.findAll();
	}

	@RequestMapping(value = "/listar", method = RequestMethod.GET)
	@ResponseBody
	public Object index() {
		return estornoService.findAll();
	}

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<?> create(@RequestBody Estorno areaa) {
		estornoService.save(areaa);
		return new ResponseEntity<>(areaa, HttpStatus.OK);
	}

	@PutMapping
	public ResponseEntity<?> updd(@RequestBody Estorno estorno) {
		estornoService.save(estorno);
		return new ResponseEntity<>(HttpStatus.OK);

	}

}
