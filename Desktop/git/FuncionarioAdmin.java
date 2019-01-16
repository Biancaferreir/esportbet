package esports.bet;

public class FuncionarioAdmin extends Funcionario {
    
    public FuncionarioAdmin(String nome, String cpf, String senha, String email) {
        super(nome, cpf, senha, email);
    }

    @Override
    public boolean login(String email, String senha) {
        return super.login(email, senha); 
    }
    
    
}
