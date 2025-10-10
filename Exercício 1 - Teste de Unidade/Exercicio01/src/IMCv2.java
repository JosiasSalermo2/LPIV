
public class IMCv2 {
    public static void main(String[] args){

        PessoaIMC pessoa = new PessoaIMC();
        pessoa.setPeso(110);
        pessoa.setAltura(1.83);
        pessoa.setSexo("M");

        double imc = pessoa.calcularIMC();
        String condicao = pessoa.getCondicao();
    }






}




