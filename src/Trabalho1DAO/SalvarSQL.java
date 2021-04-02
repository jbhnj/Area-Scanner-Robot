package Trabalho1DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import Trabalho1.Euclidiana;
import Trabalho1.Manhattan;
import Trabalho1.Unidade;

public class SalvarSQL implements UnidadeDAO{
	
	private static final String URI = "jdbc:h2:~/test";
	
	private static final String Insert = "INSERT INTO UNIDADES(ID, abscissa, ordenada, video, termometro, co2, ch4, tipo) values\r\n" + 
            "(?, ?, ?, ?, ?, ?, ?, ?)\r\n" + 
            "";
	
	private static final String update = "UPDATE UNIDADES SET ABSCISSA = ?, ORDENADA = ? WHERE ID = ?";
	
	private static final String recuperar = "SELECT * FROM UNIDADES";
	
	public SalvarSQL() throws SQLException {
		
		DriverManager.registerDriver(new org.h2.Driver());
		
	}
	
	public Connection conectarBanco() throws SQLException {
		
		Connection connection = DriverManager.getConnection(URI, "sa","");
		return connection;
					
	}
	
	@Override
	public void salvar(Unidade armazenar) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement statement = this.conectarBanco().prepareStatement(Insert);
		statement.setInt(1, armazenar.getId());
		statement.setDouble(2, armazenar.getAbscissa());
		statement.setDouble(3, armazenar.getOrdenada());
		statement.setBoolean(4, armazenar.isVideo());
		statement.setBoolean(5, armazenar.isTermometro());
		statement.setBoolean(6, armazenar.isCo2());
		statement.setBoolean(7, armazenar.isCh4());
		
		
		if (armazenar instanceof Euclidiana) {
			
			statement.setString(8, "Euclidiana");
		
		}
		else if (armazenar instanceof Manhattan) {
			
			statement.setString(8, "Manhattan");
		}
		
		statement.executeUpdate();
		statement.close();
	}

	@Override
	public void atualizar(Unidade atual, float abscissa, float ordenada) throws SQLException {
		// TODO Auto-generated method stub
		PreparedStatement statement = this.conectarBanco().prepareStatement(update);		
		statement.setDouble(1, abscissa);
		statement.setDouble(2, ordenada);
		statement.setInt(3, atual.getId());
		statement.executeUpdate();
		statement.close();
	}

	@Override
	public List<Unidade> getUnidade() throws SQLException {
		// TODO Auto-generated method stub
	
		List <Unidade> listaunidade = new ArrayList<Unidade>();
		Statement acessobd = this.conectarBanco().createStatement();
		if (acessobd.execute(recuperar)) {
			
			ResultSet resultado = acessobd.getResultSet();
			
			while (resultado.next()) {
				
				int id = resultado.getInt("ID");
				double abscissa = resultado.getDouble("ABSCISSA");
				double ordenada = resultado.getDouble("ORDENADA");
				boolean video = resultado.getBoolean("VIDEO");
				boolean termometro = resultado.getBoolean("TERMOMETRO");
				boolean co2 = resultado.getBoolean("CO2");
				boolean ch4 = resultado.getBoolean("CH4");
				String tipo = resultado.getString("TIPO"); 
			
				if (tipo.matches("Euclidiana")) {
					
					Unidade euclid = new Euclidiana(id, abscissa, ordenada, video, termometro, co2, ch4);
					listaunidade.add(euclid);
				}
				
				if (tipo.matches("Manhattan")) {
					
					Unidade manhattan = new Manhattan(id, abscissa, ordenada, video, termometro, co2, ch4);
					listaunidade.add(manhattan);
				}
			}
			
		}
	
		
		return listaunidade;
	}


	
}
