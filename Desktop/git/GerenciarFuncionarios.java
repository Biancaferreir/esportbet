package esports.bet;

import java.util.ArrayList;

public class GerenciarFuncionarios {
    
    private ArrayList<Funcionario> funcionarios;
    
    public GerenciarFuncionarios(){
        funcionarios = new ArrayList<>();
    }
    
    public void cadastrar(Funcionario f){
        funcionarios.add(f);
    }
    
    public boolean login(String email, String senha){
        for (Funcionario funcionario : funcionarios) {
            if(email == funcionario.getEmail() && senha == funcionario.getSenha()){
                return true;
            }
        }
        return false;
    }
    
}
