package br.com.compliancesoftware.control.dao.filtros;

import java.util.Calendar;

/**
 * Auxilio na listagem de registros
 * @author Compliance Software (by Douglas Fernandes)
 *
 */
public class FiltroRegistro 
{
	public static final int AMBOS = 2;
	public static final int ATIVOS = 1;
	public static final int DESATIVADOS = 0;
	
	private String cliente = null;
	
	private String software = null;
	
	private double desconto = 0;
	
	private double valor = 0;

	private Calendar validadeInicio = null;
	private Calendar validadeFim = null;
	
	private Calendar dtInclusaoInicio = null;
	private Calendar dtInclusaoFim = null;
	
	private String quemIncluiu = null;
	
	private int vencimentoInicio = 1;
	private int vencimentoFim = 30;
	
	private int ativo = AMBOS;
	
	/**
	 * @return Retorna ativo
	 */
	public int getAtivo() {
		return this.ativo;
	}
	/**
	 * @param Nova configura��o para ativo
	 */
	public void setAtivo(int ativo) {
		this.ativo = ativo;
	}
	/**
	 * @return Retorna cliente
	 */
	public String getCliente() {
		return this.cliente;
	}
	/**
	 * @param Nova configura��o para cliente
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}
	/**
	 * @return Retorna software
	 */
	public String getSoftware() {
		return this.software;
	}
	/**
	 * @param Nova configura��o para software
	 */
	public void setSoftware(String software) {
		this.software = software;
	}
	/**
	 * @return Retorna desconto
	 */
	public double getDesconto() {
		return this.desconto;
	}
	/**
	 * @param Nova configura��o para desconto
	 */
	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	/**
	 * @return Retorna valor
	 */
	public double getValor() {
		return this.valor;
	}
	/**
	 * @param Nova configura��o para valor
	 */
	public void setValor(double valor) {
		this.valor = valor;
	}
	/**
	 * @return Retorna validadeInicio
	 */
	public Calendar getValidadeInicio() {
		return this.validadeInicio;
	}
	/**
	 * @param Nova configura��o para validadeInicio
	 */
	public void setValidadeInicio(Calendar validadeInicio) {
		this.validadeInicio = validadeInicio;
	}
	/**
	 * @return Retorna validadeFim
	 */
	public Calendar getValidadeFim() {
		return this.validadeFim;
	}
	/**
	 * @param Nova configura��o para validadeFim
	 */
	public void setValidadeFim(Calendar validadeFim) {
		this.validadeFim = validadeFim;
	}
	/**
	 * @return Retorna dtInclusaoInicio
	 */
	public Calendar getDtInclusaoInicio() {
		return this.dtInclusaoInicio;
	}
	/**
	 * @param Nova configura��o para dtInclusaoInicio
	 */
	public void setDtInclusaoInicio(Calendar dtInclusaoInicio) {
		this.dtInclusaoInicio = dtInclusaoInicio;
	}
	/**
	 * @return Retorna dtInclusaoFim
	 */
	public Calendar getDtInclusaoFim() {
		return this.dtInclusaoFim;
	}
	/**
	 * @param Nova configura��o para dtInclusaoFim
	 */
	public void setDtInclusaoFim(Calendar dtInclusaoFim) {
		this.dtInclusaoFim = dtInclusaoFim;
	}
	/**
	 * @return Retorna quemIncluiu
	 */
	public String getQuemIncluiu() {
		return this.quemIncluiu;
	}
	/**
	 * @param Nova configura��o para quemIncluiu
	 */
	public void setQuemIncluiu(String quemIncluiu) {
		this.quemIncluiu = quemIncluiu;
	}
	/**
	 * @return Retorna vencimentoInicio
	 */
	public int getVencimentoInicio() {
		return this.vencimentoInicio;
	}
	/**
	 * @param Nova configura��o para vencimentoInicio
	 */
	public void setVencimentoInicio(int vencimentoInicio) {
		this.vencimentoInicio = vencimentoInicio;
	}
	/**
	 * @return Retorna vencimentoFim
	 */
	public int getVencimentoFim() {
		return this.vencimentoFim;
	}
	/**
	 * @param Nova configura��o para vencimentoFim
	 */
	public void setVencimentoFim(int vencimentoFim) {
		this.vencimentoFim = vencimentoFim;
	}
	
	
}