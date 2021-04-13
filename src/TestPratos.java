import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

@DisplayName("Testa Manipulacao da Lista de Pratos")
public class TestPratos {
	
	@Test
	@DisplayName("Testa se consegue Adcionar Pratos a Lista")
	public void testAdcionandoPratoALista() {
		Pratos pratos = new Pratos();
		pratos.colocarNovoPratoNaLista("Churrasco");
		pratos.colocarNovoPratoNaLista("Feijoada");
		pratos.colocarNovoPratoNaLista("Macarronada");
		
		ArrayList<String> lista_pratos = pratos.getListaDePratos();
		// String listaSimuladaDePratos[] = {"Churrasco","Feijoada","Macarronada"};
		assertEquals(lista_pratos.size(), 3);
	}
	
	
	@Test
	@DisplayName("Pegando um prato na lista e removendo esta prato da lista")
	public void testPegandoUmPratoNaListaDePratos() {
		Pratos listaDePratos = new Pratos();
		listaDePratos.colocarNovoPratoNaLista("Misto");
		assertEquals(listaDePratos.getPratoNaLista(), "Misto");
	}
	
	//for (int i=0; i <= pratos.getQuantidadeDePratos(); i++) {
	//	assertEquals(pratos.)
	//}
	
}
