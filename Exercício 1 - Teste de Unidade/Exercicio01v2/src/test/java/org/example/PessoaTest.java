package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;


public class PessoaTest {

    Pessoa pessoa;

    @BeforeEach
    void setUp(){
        pessoa = new Pessoa();
        pessoa.setAltura(1.0f);
    }

    @Test
    void deveRetornarMasculinoAbaixoPeso(){
        pessoa.setPeso(20.6f);
        pessoa.setGenero("masculino");
        assertEquals("Abaixo do peso",pessoa.definirStatus());
    }

    @Test
    void deveVerificarPesoValido(){
        assertEquals(0.1f,pessoa.getPeso());
    }

    @Test
    void deveVerificarPesoInvalido(){
        try{
            pessoa.setPeso(00f);
            fail();
        }
        catch (IllegalArgumentException e){
            assertEquals("peso invalido", e.getMessage());
        }
    }

    @Test
    void deveVerificarMarginalmenteAcimaMasculino(){
        pessoa.setGenero("Masculino");
        pessoa.setPeso(27.7f);
        assertEquals("Marginalmente acima", pessoa.definirStatus());
        
        String status = pessoa.definirStatus();
    }
    
    @Test
    void deveVerificarMarginalmenteAcimaFeminino(){
        pessoa.setGenero("Feminino");
        pessoa.setPeso(27.1f);
        assertEquals("Marginalmente acima", pessoa.definirStatus());
    }
    
    @Test
    void deveVerificarAcimaPesoMasculino(){
        pessoa.setGenero("Masculino");
        pessoa.setPeso(31);
        assetEquals("Acima do peso", pessoa.definirStatus());
    }
    
    @Test
    void deveVerificarAcimaPesoFeminino(){
        pessoa.setGenero("Feminino");
        pessoa.setPeso(32.2);
        assetEquals("Acima do do peso", pessoa.definirStatus());
    }

}
