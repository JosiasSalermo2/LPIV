package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Pessoa p = new Pessoa();
        p.setGenero("M");
        p.setPeso(110f);
        p.setAltura(1.83f);

        float imc = p.calcularImc();
        String status = p.definirStatus();
    }
}