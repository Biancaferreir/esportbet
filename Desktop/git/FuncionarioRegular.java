package esports.bet;

public class FuncionarioRegular extends Funcionario {
    
    public FuncionarioRegular(String nome, String cpf, String senha, String email) {
        super(nome, cpf, senha, email);
    }

    @Override
    public boolean login(String email, String senha) {
        return super.login(email, senha); //To change body of generated methods, choose Tools | Templates.
    }
    
}
