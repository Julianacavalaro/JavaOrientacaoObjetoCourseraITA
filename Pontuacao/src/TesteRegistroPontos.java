import static org.junit.Assert.*;

import org.junit.jupiter.api.Test;


public class TesteRegistroPontos {

	@Test
	public void pontosCriarTopico() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 5);
	}
	
	@Test
	public void pontosCriarTopicoBonusDoDia() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia =1;
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 5);
	}
	
	
	@Test
	public void pontosFazerComentario() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.fazerUmComentario(u);
		assertEquals(u.pontos, 3);
	}
	
	@Test
	public void pontosDarUmLike() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.darUmLike(u);
		assertEquals(u.pontos, 1);
	}
	
	@Test
	public void pontosCriarTopicoVIP() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		u.vip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 25);
	}
	
	@Test
	public void pontosCriarTopicoVIPBonusDia() {
		Usuario u = new Usuario();
		u.nome = "Guerra";
		u.vip = true;
		CalculadoraBonus cb = new CalculadoraBonus();
		cb.bonusDoDia = 2;
		RegistroPontos rp = new RegistroPontos(cb);
		rp.criarUmTopico(u);
		assertEquals(u.pontos, 50);
	}
}
