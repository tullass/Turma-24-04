package com.Sample.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.Sample.Entity.Fatura;
import com.Sample.Service.AlunoService;
import com.Sample.Service.BancoService;
import com.Sample.Service.FaturaService;
import com.Sample.Service.TipoService;

@RestController
@RequestMapping("fatura")
public class FaturaController {

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
	public Object index() {
		return faturaService.findAll();
	}
	@RequestMapping(value = "/listarBoolean", method = RequestMethod.GET)
	@ResponseBody
	public Object indexs() {
		return faturaService.Querry();
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

	@RequestMapping(value = "/", method = RequestMethod.POST)
	public ResponseEntity<?> create(@RequestBody Fatura areaa) {
		faturaService.save(areaa);
		return new ResponseEntity<>(areaa, HttpStatus.OK);
	}

	@RequestMapping(value = "/a", method = RequestMethod.POST)
	public ResponseEntity<?> adianta(@RequestBody Fatura areaa) {
		areaa.setAdiantamento(true);
		faturaService.save(areaa);
		return new ResponseEntity<>(areaa, HttpStatus.OK);
	}
	@GetMapping(path = "aa/{id}")
	public ResponseEntity<?> hsj(@PathVariable("id") Long id) {
		Fatura p =faturaService.findById(id);

		return new ResponseEntity<>(p, HttpStatus.OK);
	}
	@PutMapping
	public ResponseEntity<?> updd(@RequestBody Fatura aluno) {
		faturaService.save(aluno);
		return new ResponseEntity<>(HttpStatus.OK);

	}

}
