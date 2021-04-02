package Trabalho1DAO;

import java.util.ArrayList;
import java.util.List;

import Trabalho1.Unidade;

public class MemUnidade implements UnidadeDAO{

	List<Unidade> unidades = new ArrayList<Unidade>();
	
	@Override
	public void salvar(Unidade armazenar) {
		this.unidades.add(armazenar);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void atualizar(Unidade atual, float abscissa, float ordenada) {
		atual.mudarPosicao(abscissa, ordenada);
		
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Unidade> getUnidade() {
		
		return this.unidades;
		// TODO Auto-generated method stub
	}

	
}
