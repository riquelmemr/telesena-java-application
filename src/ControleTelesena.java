import java.util.Arrays;

public class ControleTelesena {
    private Pessoa[] pessoas;
    private int quantidadeTelesenasVendidas = 0;
    private double valorTotal = 0.0;


    public ControleTelesena(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }

    public void venderTelesena(Pessoa pessoa) {
        if (quantidadeTelesenasVendidas < 300) {
            Telesena telesena = new Telesena();
            pessoa.adicionarTelesena(telesena);

            System.out.println("Telesena comprada: " + Arrays.toString(telesena.getPrimeiroConjunto()) + " e " + Arrays.toString(telesena.getSegundoConjunto()));

            quantidadeTelesenasVendidas++;
            valorTotal += telesena.getValor();
        }
    }

    public Pessoa[] getPessoas() {
        return pessoas;
    }

    public int getQuantidadeTelesenasVendidas() {
        return quantidadeTelesenasVendidas;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }

    public void setQuantidadeTelesenasVendidas(int quantidadeTelesenasVendidas) {
        this.quantidadeTelesenasVendidas = quantidadeTelesenasVendidas;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }
}
