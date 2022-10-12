/**
 * 
 */
package br.com.carvalho.test;

import org.junit.Test;
import org.junit.Assert;

import br.com.carvalho.java.dao.ContratoDao;
import br.com.carvalho.java.dao.IContratoDao;
import br.com.carvalho.mock.ContratoDaoMock;
import br.com.carvalho.service.ContratoService;
import br.com.carvalho.service.IContratoService;


/**
 * @author manoel.carvalho
 *
 */
public class ContratoServiceTest {
	
	
	
	@Test
	public void salvarTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso ao salvar no DB", retorno);
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroNoSalvarNoBancodeDados() {
		IContratoDao dao = new ContratoDao();
		
		
		IContratoService service = new ContratoService(dao);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso ao salvar no DB", retorno);
	}
	
	
	@Test
	public void buscarTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.buscar();
		Assert.assertEquals("Sucesso ao buscar no DB", retorno);
		
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroNoBuscarNoBancoDeDados() {
		IContratoDao dao = new ContratoDao();
		
		IContratoService service = new ContratoService(dao);
		String retorno = service.salvar();
		Assert.assertEquals("Sucesso ao salvar no DB", retorno);
	}
	
	@Test
	public void alterarTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.alterar();
		Assert.assertEquals("Sucesso ao alterar dados no DB", retorno);
		
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroAoAlterarDadosNoBancoDeDados() {
		IContratoDao dao = new ContratoDao();
		
		IContratoService service = new ContratoService(dao);
		String retorno = service.alterar();
		Assert.assertEquals("Sucesso ao salvar no DB", retorno);
	}
	
	
	@Test
	public void excluirTest() {
		IContratoDao dao = new ContratoDaoMock();
		IContratoService service = new ContratoService(dao);
		String retorno = service.excluir();
		Assert.assertEquals("Sucesso ao excluir dados no DB", retorno);
		
	}
	
	@Test(expected = UnsupportedOperationException.class)
	public void esperadoErroAoExcluirNoBancoDeDados() {
		IContratoDao dao = new ContratoDao();
		IContratoService service = new ContratoService(dao);
		String retorno = service.excluir();
		Assert.assertEquals("Sucesso ao excluir dados no DB", retorno);
		
	}
}
