package entidades;

import java.util.ArrayList;
import java.util.List;

import dao.PersistidorDeAutomovel;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PersistidorDeAutomovel PA = new PersistidorDeAutomovel();
		Automovel auto = new Automovel();
		
		//CADASTRAR
//		auto.setAnoFabricacao(2020);
//		auto.setModelo("Corolla");
//		auto.setObservacoes("Nunca foi batido");
//		
//		PA.cadastrar(auto);
		
		
		//SELECT
		List<Automovel> lista = PA.selecionar();
		
		for(Automovel a :lista) {
			System.out.println(a.getObservacoes());
		}
		
		
		PA.remover(auto, 4l);
	}

}
