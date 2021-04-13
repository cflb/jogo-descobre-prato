import javax.swing.JOptionPane;

public class JogoDescobrePratos {
 
	static Boolean status = false;
	static Pratos pratos = new Pratos();
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pratos.colocarNovoPratoNaLista("Misto");
		pratos.colocarNovoPratoNaLista("Muqueca");
		pratos.colocarNovoPratoNaLista("Feijoada");
		pratos.colocarNovoPratoNaLista("Macarronada");
		
		JOptionPane.showMessageDialog(null, "Seja Bem Vindo ao Descubra o Prato.\n Pressione Ok para continuar.");
		JOptionPane.showMessageDialog(null, "Na minha memória eu conheço estes pratos: " + pratos.getListaDePratos());
		
		int liga_desliga = JOptionPane.showConfirmDialog(null, "Gostaria de Iniciar o Jogo?", "Jogo: Eu sei oque você quer comer!", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);		
		iniciarJogo(liga_desliga);
		//JOptionPane.showMessageDialog(null, args);
		
		//while (status == true) {
		
		//	static res = JOptionPane.showOptionDialog(null, "Qual prato você esta pensando? ", getTentativaDeAdivinhar(), 1, 0, null, args, getStatus());
			//int x = JOptionPane.showConfirmDialog(null, "Teste 01", "choose one", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
			//System.out.println(x);
		//}

		
		
		// tela de cadastro e loop
		/*
		if (getTentativaDeAdivinhar() == 0) {
			JOptionPane.showMessageDialog(null, "Assertei saporra!!!");
		} else {
			//TODO: Adcionar a logica final para verificar se acertou do contrario reinicia (loop)
			JOptionPane.showMessageDialog(null, "Errei!!!");
		}
		*/
		//JOptionPane.showMessageDialog(null, pratos.getListaDePratos());
	}

	public static void iniciarJogo(int liga_desliga) {
		while (liga_desliga  == 0) {			
			int resposta = JOptionPane.showConfirmDialog(null, "Seria um " + getTentativaDeAdivinhar() + " ?", "Qual prato você esta pensando?", JOptionPane.YES_NO_OPTION);

			if (resposta == 0) {
				JOptionPane.showMessageDialog(null, "Acertei!");
				status = 1;
				JOptionPane.showMessageDialog(null, "Fim, para continuar reinicie o jogo");
			}
			
			else if (pratos.getQuantidadeDePratos() == 0) {
				JOptionPane.showMessageDialog(null, "Eu não tenho mais nenhuma ideia de prato.");
				int add_nova_prato = JOptionPane.showConfirmDialog(null, "Gostaria de Adicionar algum prato novo?", "Gostaria de Iniciar o Jogo?", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);

				if (add_nova_prato == 0) {
					pratos.colocarNovoPratoNaLista("prato");
					
				}
			} else {
				JOptionPane.showMessageDialog(null, "Errei!");
			}
		}

	}
	
	public Boolean getStatus() { 
		if (status == false) {
			return false;
		} else {
			return true;
		}
	}
	
	public void setStatus(Boolean status) {
		this.status = status;
	}

	public static String getTentativaDeAdivinhar() {
		// TODO Auto-generated method stub
		// Seleciona um prato de uma lista de pratos na memoria
		return pratos.getPratoNaLista();
	}

	
}
