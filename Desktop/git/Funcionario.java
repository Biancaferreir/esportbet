package esports.bet;

public abstract class Funcionario {
    private String nome;
    private String cpf;
    private String senha;
    private String email;
    
    public Funcionario(String nome, String cpf, String senha, String email){
        this.nome = nome;
        this.cpf = cpf;
        this.senha = senha;
        this.email = email;
    }
    
    public String getNome(){
        return nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getCpf(){
        return cpf;
    }
    
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    
    public String getSenha(){//senha tem get e set?
        return senha;
    }
    
    public void setSenha(String senha){
        this.senha = senha;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String email){
        this.email = email;
    }
    
    public boolean login(String email, String senha){
        if (this.getEmail() == email && this.senha == senha){
            return true;
        }
        return false;
        }
    
  
}
    
