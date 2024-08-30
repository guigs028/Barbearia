import java.time.LocalDateTime;

public class Agendamento {
    private Cliente cliente;
    private Serviço serviço;
    private LocalDateTime dataHora;
    
    //Getter Hora
    public LocalDateTime getDataHora() {
        return dataHora;
    }

    //Construtor
    public Agendamento(Cliente cliente, Serviço serviço, LocalDateTime dataHora) {
        this.cliente = cliente;
        this.serviço = serviço;
        this.dataHora = dataHora;
    }

    public String toString (){
        return "Agendamento: " + cliente + ", Serviço: " + serviço + ", Data/Hora: " + dataHora;
    }

}
