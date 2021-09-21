package bean;

import java.util.List;

import javax.faces.bean.ManagedBean;

import dao.PersistidorDeAutomovel;
import entidades.Automovel;

@ManagedBean
public class AutomovelBean {

	private Automovel automovel = new Automovel();
	
	PersistidorDeAutomovel PA = new PersistidorDeAutomovel();
	
	public Automovel getAutomovel() {
		return automovel;
	}

	public void salvar(Automovel automovel) {
		PA.cadastrar(automovel);
	}
	
	public void mostrar() {
		List<Automovel> lista = PA.selecionar();
		for(Automovel a : lista) {
		
		System.out.println(a.getMarca());
		
		}
	}

}
