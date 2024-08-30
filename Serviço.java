public class Serviço {
    private String serviço;
    private double preco;
    
    
    public Serviço(String serviço, double preco) {
        this.serviço = serviço;
        this.preco = preco;
    }

    public static Serviço criarCorte(){
        return new Serviço("Corte", 50);
    }

    public String getServiço() {
        return serviço;
    }
    public void setServiço(String serviço) {
        this.serviço = serviço;
    }
    public double getPreco() {
        return preco;
    }
    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String toString() {
        return "Serviço: " + serviço + ", Valor: " + preco;
    }
}
