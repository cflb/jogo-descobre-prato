import java.util.ArrayList;
import java.util.Random;

public class Pratos {
	
	ArrayList<String> listaDePratos = new ArrayList<>();
	ArrayList<String> memoriaListaDePratos = new ArrayList<>();
	
	public void colocarNovoPratoNaLista(String prato) {
		this.listaDePratos.add(prato);
	}
	
	public String getPratoNaLista() {
		Random rand = new Random();
		int indicePratoAleatorio = rand.nextInt(listaDePratos.size()-1);
	    String prato = this.listaDePratos.get(indicePratoAleatorio);
	    memoriaListaDePratos.add(prato);
	    listaDePratos.remove(prato);
	    getMemoria();
	    return prato;
	} 
	
	public ArrayList<String> getMemoria() {
		return this.memoriaListaDePratos;
	}
	
	public ArrayList<String> getListaDePratos(){
		return this.listaDePratos;
	}
	
	public int getQuantidadeDePratos() {
		int quantidadeDePratos = this.listaDePratos.size();
		return quantidadeDePratos;
	}
}
