

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

@DisplayName("Test Game.")
public class TestGame {
	
	@Test
	@DisplayName("Test Start Game")
	public void testStartGame() {
		JogoDescobrePratos jdp = new JogoDescobrePratos();
		jdp.setStatus(true);
		Boolean status = jdp.getStatus();
		assertEquals(true, status);
	}
	
	@Test
	@DisplayName("Test Descobrir o prato que o usuário esta pensando.")
	public void testTentativaDeAdivinharOPrato() {
		JogoDescobrePratos jdp = new JogoDescobrePratos();
	}

}
