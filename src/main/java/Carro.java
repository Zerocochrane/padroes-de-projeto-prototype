public class Carro implements Cloneable{
    public String nomeModelo;
    public int preco;

    public Carro(String nomeModelo, int preco){
        super();
        this.nomeModelo = nomeModelo;
        this.preco = preco;
    }

    public String getNomeModelo(){
        return nomeModelo;
    }
    public int getPreco() {
        return preco;
    }

    public void setNomeModelo(String nomeModelo){
        this.nomeModelo = nomeModelo;
    }
    public void setPreco(int preco) {
        this.preco = preco;
    }

    public Carro clone() throws CloneNotSupportedException{
        return (Carro)super.clone();
    }

    @Override
    public String toString() {
        return "Carro{" +
                "nomeModelo='" + nomeModelo + '\'' +
                ", preco=" + preco +
                '}';
    }
}