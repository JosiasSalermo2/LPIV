
public class IMC {
    public static void main(String[] args){

        double peso = 110;
        double altura = 1.83;
        String sexo = "M";

        System.out.println("Sexo: " + (sexo.equalsIgnoreCase("F") ? "Feminino" : "Masculino"));
        System.out.println("Altura: " + altura + "m");
        System.out.println("Peso: " + peso + "kg");

        if (peso > 0 && altura > 0){
            double imc = peso / (altura * altura);
            System.out.printf("IMC: %.2f\n", imc);

            String condicao = classificar(sexo, imc);
            System.out.println("Condição: " + condicao);
        } else{
            System.out.println("Peso e altura devem ser maiores que zero.");
        }
    }

    private static String classificar(String sexo, double imc){

        if(sexo.equalsIgnoreCase("F")){
            if(imc < 19.1){
                return "Abaixo do peso";
            } else {
                if(imc < 25.8){
                    return "Peso em um peso";
                }else {
                    if(imc < 27.3){
                        return "Marginalmente acima do peso";
                    } else{
                        if(imc < 32.3){
                            return "Acima do peso ideal";
                        }else {
                            return "Obeso";
                        }
                    }
                }


            }

        } else {
            if(imc < 20.7){
                return "Abaixo do peso";
            } else {
                if(imc < 26.4){
                    return "Peso em um peso";
                }else {
                    if(imc < 27.8){
                        return "Marginalmente acima do peso";
                    } else{
                        if(imc < 31.1){
                            return "Acima do peso ideal";
                        }else {
                            return "Obeso";
                        }
                    }
                }


            }
        }



    }




}




