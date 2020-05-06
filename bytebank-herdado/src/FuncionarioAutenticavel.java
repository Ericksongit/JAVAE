
public abstract class FuncionarioAutenticavel extends Funcionario{
	
private int senha = 2222;
	
	public boolean autentica (Gerente g) {
		boolean autenticou = g.autentica(this.senha);
		
		if (this.senha == senha) {
			return true;
		} else {return false;}
		
	}

}
