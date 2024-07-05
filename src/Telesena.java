public class Telesena {
    private double valor = 10.0;
    private int[] primeiroConjunto = new int[25];
    private int[] segundoConjunto = new int[25];

    public Telesena() {
        gerarConjunto(primeiroConjunto);
        gerarConjunto(segundoConjunto);
    }

    public void gerarConjunto(int[] conjunto) {
        int contagem = 0;
        boolean[] repetidos = new boolean[61];

        while (contagem < 25) {
            int numero = Gerador.gerarNumero(1, 60);

            if (!repetidos[numero]) {
                conjunto[contagem] = numero;
                repetidos[numero] = true;
                contagem++;
            }
        }
    }

    public int[] getPrimeiroConjunto() {
        return primeiroConjunto;
    }

    public int[] getSegundoConjunto() {
        return segundoConjunto;
    }

    public double getValor() {
        return valor;
    }

    public void setPrimeiroConjunto(int[] primeiroConjunto) {
        this.primeiroConjunto = primeiroConjunto;
    }

    public void setSegundoConjunto(int[] segundoConjunto) {
        this.segundoConjunto = segundoConjunto;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
