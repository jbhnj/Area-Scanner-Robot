package Trabalho1;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Trabalho1DAO.MemUnidade;
import Trabalho1DAO.SalvarSQL;
import Trabalho1DAO.UnidadeDAO;

public class Sistema {
	
	private UnidadeDAO memUnidade;
	
	public Sistema () throws SQLException {
		
		memUnidade = new SalvarSQL();
		
	}
	
	public void addEuclidiana(int id, double abscissa, double ordenada, boolean video, boolean termometro, boolean co2, boolean ch4) throws Exception {
		Unidade euclidiana = new Euclidiana(id, abscissa, ordenada, video, termometro, co2, ch4);
		this.setUnidade(euclidiana);
	}
	
	public void addManhattan(int id, double abscissa, double ordenada, boolean video, boolean termometro, boolean co2, boolean ch4) throws Exception {
		Unidade manhattan = new Manhattan(id, abscissa, ordenada, video, termometro, co2, ch4);
		this.setUnidade(manhattan);
	}
		
	private void setUnidade(Unidade nova) throws Exception {
		
		memUnidade.salvar(nova);	
		
	}
	
	public String monitorar(float abscissa, float ordenada, boolean video, boolean
			termometro, boolean co2, boolean ch4) throws Exception{
		
		List<Unidade> unidadesDisponiveis = new ArrayList<Unidade>();
		
		int menorDistancia = 0;
		
		for(Unidade novo: memUnidade.getUnidade()) {
			
			if(novo.contem(video, termometro, co2, ch4)) {
				unidadesDisponiveis.add(novo);
			}	
		}
		
		for(int iCont = 0; iCont < unidadesDisponiveis.size(); iCont ++ ) {
			
			menorDistancia = (unidadesDisponiveis.get(menorDistancia).locomover(abscissa, ordenada) < unidadesDisponiveis.get(iCont).locomover(abscissa, ordenada))
							? menorDistancia : iCont;
			
		}
		
		memUnidade.atualizar(unidadesDisponiveis.get(menorDistancia), abscissa, ordenada);
		
		return "o identificador da unidade que será transladada para o local a ser monitorado é: " + unidadesDisponiveis.get(menorDistancia).getId();
	}
	
}

//for(Unidade unidades: unidadesDisponiveis)
//	unidades.locomover
