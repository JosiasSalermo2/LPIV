public class PessoaIMC {

    private double peso;
    private double altura;
    private String sexo;

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if( peso <=0) {
            throw new IllegalArgumentException("Peso deve ser maior que zero.");
        }
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura <=0) {
            throw new IllegalArgumentException("Altura deve ser maior que zero.");
        }
        this.altura = altura;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        if (sexo == null || sexo.isBlank()){
            throw new IllegalArgumentException("Sexo não pode ser nulo ou vazio.");
        }
        this.sexo = sexo;
    }

    public double calcularIMC(){
        return peso / (altura * altura);
    }

    public String getCondicao(){
        double imc = calcularIMC();
        return classificar(imc);
    }



}
