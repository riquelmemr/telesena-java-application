public class ControleTelesena {
    private Pessoa[] pessoas;
    private int quantidadeTelesenasVendidas = 0;
    private double total = 0.0;
    private double premiacao = 0.0;

    public ControleTelesena(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }

    public void venderTelesena(Pessoa pessoa) {
        if (quantidadeTelesenasVendidas < 300) {
            Telesena telesena = new Telesena();
            pessoa.adicionarTelesena(telesena);

            quantidadeTelesenasVendidas++;
            atualizarTotal(telesena.getValor());
        }
    }

    private void atualizarTotal(double valor) {
        this.total += valor;
    }

    public Pessoa[] getPessoas() {
        return pessoas;
    }

    public int getQuantidadeTelesenasVendidas() {
        return quantidadeTelesenasVendidas;
    }

    public double getTotal() {
        return total;
    }

    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }

    public void setQuantidadeTelesenasVendidas(int quantidadeTelesenasVendidas) {
        this.quantidadeTelesenasVendidas = quantidadeTelesenasVendidas;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getPremiacao() {
        return premiacao;
    }

    public void setPremiacao(double premiacao) {
        this.premiacao = premiacao;
    }
}
