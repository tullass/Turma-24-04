package com.Sample.Entity;

import java.io.Serializable;
import java.util.Date;
import java.util.GregorianCalendar;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Fatura implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5268803107908071310L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	GregorianCalendar calendar = new GregorianCalendar();
	private int data = calendar.getWeekYear();
	private String subtotal;
	private String multa;
	private String total;
	private String caixa;
	private String mes;
	private String desconto;
	private String prestacao;
	private Boolean adiantamento;
	private Date datainicio;
	private Date datafim;
	private Boolean inscrito;

	@ManyToOne
	private Aluno aluno;

	@ManyToOne
	private Banco banco;

	@ManyToOne
	private TipoDoc tipo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public GregorianCalendar getCalendar() {
		return calendar;
	}

	public void setCalendar(GregorianCalendar calendar) {
		this.calendar = calendar;
	}

	public int getData() {
		return data;
	}

	public void setData(int data) {
		this.data = data;
	}

	public String getSubtotal() {
		return subtotal;
	}

	public void setSubtotal(String subtotal) {
		this.subtotal = subtotal;
	}

	public String getMulta() {
		return multa;
	}

	public void setMulta(String multa) {
		this.multa = multa;
	}

	public String getTotal() {
		return total;
	}

	public void setTotal(String total) {
		this.total = total;
	}

	public String getCaixa() {
		return caixa;
	}

	public void setCaixa(String caixa) {
		this.caixa = caixa;
	}

	public String getMes() {
		return mes;
	}

	public void setMes(String mes) {
		this.mes = mes;
	}

	public String getDesconto() {
		return desconto;
	}

	public void setDesconto(String desconto) {
		this.desconto = desconto;
	}

	public String getPrestacao() {
		return prestacao;
	}

	public void setPrestacao(String prestacao) {
		this.prestacao = prestacao;
	}

	public Boolean getAdiantamento() {
		return adiantamento;
	}

	public void setAdiantamento(Boolean adiantamento) {
		this.adiantamento = adiantamento;
	}

	public Date getDatainicio() {
		return datainicio;
	}

	public void setDatainicio(Date datainicio) {
		this.datainicio = datainicio;
	}

	public Date getDatafim() {
		return datafim;
	}

	public void setDatafim(Date datafim) {
		this.datafim = datafim;
	}

	public Boolean getInscrito() {
		return inscrito;
	}

	public void setInscrito(Boolean inscrito) {
		this.inscrito = inscrito;
	}

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Banco getBanco() {
		return banco;
	}

	public void setBanco(Banco banco) {
		this.banco = banco;
	}

	public TipoDoc getTipo() {
		return tipo;
	}

	public void setTipo(TipoDoc tipo) {
		this.tipo = tipo;
	}

}
