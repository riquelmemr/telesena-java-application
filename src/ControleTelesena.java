public class ControleTelesena {
    private Pessoa[] pessoas;
    private int quantidadeTelesenasVendidas = 0;
    private double valorTotal = 0.0;


    public ControleTelesena(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }

    public void venderTelesena(Pessoa pessoa) {
        if (quantidadeTelesenasVendidas < 300) {
            for (int i = 0; i < pessoa.getTelesenas().length; i++) {
                if (pessoa.getTelesenas()[i] != null) {
                    int[] primeiroConjunto = pessoa.getTelesenas()[i].getPrimeiroConjunto();
                    int[] segundoConjunto = pessoa.getTelesenas()[i].getSegundoConjunto();

                    Telesena telesena = new Telesena(gerarConjunto(primeiroConjunto), gerarConjunto(segundoConjunto));
                    pessoa.comprarTelesena(telesena);

                    quantidadeTelesenasVendidas++;
                    valorTotal += pessoa.getTelesenas()[i].getValor();
                }
            }
        }
    }

    public int[] gerarConjunto(int[] conjunto) {
        int contagem = 0;
        boolean[] repetidos = new boolean[60];

        while (contagem < 25) {
            int numero = Gerador.gerarNumero(1, 60);

            if (!repetidos[numero]) {
                conjunto[contagem] = numero;
                repetidos[numero] = true;
                contagem++;
            }
        }

        return conjunto;
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
