import javax.swing.JOptionPane;

public class JogoDescobrePratos {
 
	private Boolean status = false;
	static Pratos pratos = new Pratos();
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		pratos.colocarNovoPratoNaLista("Misto");
		
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
			String jogada = jogadaAdivinharPrato();
			int resposta = JOptionPane.showConfirmDialog(null, "Seria um " + jogada + " ?", "Qual prato você esta pensando?", JOptionPane.YES_NO_OPTION);

			if (resposta == 0) {
				JOptionPane.showMessageDialog(null, "Acertei!");
				JOptionPane.showMessageDialog(null, "Fim, para continuar reinicie o jogo");
				liga_desliga = 1;
				break;
			}
			
			else if (pratos.getQuantidadeDePratos() == 0) {
				JOptionPane.showMessageDialog(null, "Eu não tenho mais nenhuma ideia de prato.");
				int add_nova_prato = JOptionPane.showConfirmDialog(null, "Gostaria de Adicionar um novo prato?", "Você pode adicionar um prato!", JOptionPane.YES_OPTION, JOptionPane.QUESTION_MESSAGE);
				
				if (add_nova_prato == 0) {
					pratos.colocarNovoPratoNaLista(novoPratoAoJogo());
					//ArrayList<String> memoria = pratos.getMemoria();
					JOptionPane.showMessageDialog(null, "Aprendi, agora conheço mais: " + pratos.getMemoria());
				}
			} else {
				JOptionPane.showMessageDialog(null, "Errei!");
			}
		}

	}
	
	public static String novoPratoAoJogo() {
		String novoPrato = JOptionPane.showInputDialog(null, "Qual prato você deseja: ");
		return novoPrato;
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

	public static String jogadaAdivinharPrato() {
		// TODO Auto-generated method stub
		// Seleciona um prato de uma lista de pratos na memoria
		return pratos.getPratoNaLista();
	}

	
}
