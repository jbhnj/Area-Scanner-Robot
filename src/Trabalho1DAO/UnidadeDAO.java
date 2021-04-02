package Trabalho1DAO;

import java.sql.SQLException;
import java.util.List;

import Trabalho1.Unidade;

public interface UnidadeDAO {

	public void salvar(Unidade armazenar) throws Exception;
	public void atualizar(Unidade atual, float abscissa, float ordenada) throws Exception;
	public List<Unidade> getUnidade() throws Exception;

}
