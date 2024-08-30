import java.util.ArrayList;
import java.util.List;

public class Barbearia {
    private List<Cliente> clientes = new ArrayList();
    private List<Agendamento> agendamentos = new ArrayList<>();
    private final Serviço corte = new Serviço("corte", 30);

    //metodo para cadastrar um cliente
    public boolean cadastrarCliente (Cliente cliente){
        for(int i = 0; i < clientes.size(); i++){
            Cliente c = clientes.get(i);
            if(c.getNumero().equals(cliente.getNumero())){
                return false;
            }
        } 
        clientes.add(cliente);
        return true;
    }

    //metodo para mostrar os clientes cadastrados
    public void mostrarClientes (){
        if (clientes.isEmpty()) {
            System.out.println("Nenhum cliente cadastrado!");
        } else {
            System.out.println("CLIENTES:");
            for(int i = 0; i < clientes.size(); i++){
                Cliente cliente = clientes.get(i);
                System.out.println(cliente);
            }
        }
    }
}
