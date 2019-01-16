package esports.bet;

import java.util.Scanner;

public class EsportsBet {

    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nome, cpf, senha, email;
        int opcao = 0;
        
        GerenciarFuncionarios funcionarios = new GerenciarFuncionarios();
        System.out.println("-Login-");
        System.out.println("Email: ");
        email = leia.next();
        System.out.println("Senha: ");
        senha = leia.next();
        funcionarios.login(email, senha);
        
        while(opcao != 3){
            System.out.println("1 - Cadastrar Funcionario");
            opcao = leia.nextInt();
            
        switch (opcao){
            case 1:
                System.out.println("--Cadastro Funcionario--");
                System.out.println("Nome: ");
                nome = leia.next();
                System.out.println("Cpf: ");
                cpf = leia.next();
                System.out.println("Email: ");
                email = leia.next();
                System.out.println("Senha: ");
                senha = leia.next();
                funcionarios.cadastrar(new FuncionarioAdmin(nome, cpf, senha, email));
                break;
        }
        }
        
    }
    
}
