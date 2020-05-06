
public class sistemaInterno {
	
	private int senha = 2222;
	
	public void autentica (Gerente g) {
		boolean autenticou = g.autentica(this.senha);
		
	}

}
