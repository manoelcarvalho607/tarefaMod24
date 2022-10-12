/**
 * 
 */
package br.com.carvalho.service;

import br.com.carvalho.java.dao.IContratoDao;

/**
 * @author manoel.carvalho
 *
 */
public class ContratoService implements IContratoService {
	
	private IContratoDao contratoDao;

	public ContratoService(IContratoDao dao) {
		this.contratoDao = dao;
	}

	@Override
	public String salvar() {
		contratoDao.salvar();
		return "Sucesso ao salvar no DB";
	}

	@Override
	public String buscar() {
		contratoDao.buscar();
		return "Sucesso ao buscar no DB";
	}

	@Override
	public String alterar() {
		contratoDao.alterar();
		return "Sucesso ao alterar dados no DB";
	}

	@Override
	public String excluir() {
		contratoDao.excluir();
		return "Sucesso ao excluir dados no DB";
	}

}
