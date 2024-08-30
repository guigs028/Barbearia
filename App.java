import java.util.Scanner;

public class App {
    private Barbearia barbearia = new Barbearia();
    private Scanner tec = new Scanner(System.in);

    public void iniciar (){
        int opcao;
        
        do {
            System.out.println("========================");
            System.out.println("Digite a opção desejada:");
            System.out.println("========================");
            System.out.println("1. Cadastrar Usuário");
            System.out.println("2. Agendar um horário");
            System.out.println("3. Mostrar usuários");
            System.out.println("4. Sair");
            System.out.println("========================");
    
            opcao = tec.nextInt();
            tec.nextLine();

    
            switch(opcao){
                case 1:
                    cadastrarCliente();
                    break;
                /*case 2:
                    agendarHorario();
                    break;*/
                case 3:
                    barbearia.mostrarClientes();
                    break;
                case 4:
                    System.out.println("Saindo do programa...");
                    break;
                default:
                    System.out.println("Opção inválida, digite um número de 1 a 4!");
                    break;
            }
        } while (opcao != 4);
    }

    public void cadastrarCliente (){
        System.out.println("Digite o nome:");
        String nome = tec.nextLine();
        System.out.println("Digite o número");
        String numero = tec.nextLine();

        Cliente cliente = new Cliente(nome, numero);

        if(barbearia.cadastrarCliente(cliente) == true){
            System.out.println("Cliente cadastrado!");
        } else {
            System.out.println("Cliente já cadastrado, verifique o número!");
        }
    }
}
