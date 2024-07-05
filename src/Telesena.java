public class Telesena {
    private double valor = 10.0;
    private int[] primeiroConjunto;
    private int[] segundoConjunto;

    public Telesena(int[] primeiroConjunto, int[] segundoConjunto) {
        this.primeiroConjunto = primeiroConjunto;
        this.segundoConjunto = segundoConjunto;
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
