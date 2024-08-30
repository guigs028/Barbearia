public class Cliente {
    //atributos
    private String nome;
    private String numero;
    
    //constutor
    public Cliente(String nome, String numero) {
        this.nome = nome;
        this.numero = numero;
    }
    
    //getters e setters
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getNumero() {
        return numero;
    }
    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String toString() {
        return "Cliente: " + nome + ", Telefone: " + numero;
    }

}