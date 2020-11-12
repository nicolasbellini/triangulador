package com.mercadolibre.quasar;

import com.mercadolibre.quasar.model.Interpretador;
import com.mercadolibre.quasar.model.Mensajes;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;

public class InterpretadorTest {

    private static Interpretador interpretador;

    @BeforeAll
    public static void setUp(){
        interpretador = new Interpretador();
    }

    @Test
    @DisplayName("Se puede resolver tres mensajes del mismo length")
    public void testInterpreteGeneraMensaje(){
        String[] mensaje1 = {"Hola", "", "", "mensaje"};
        String[] mensaje2 = {"Hola", "soy", "", "mensaje"};
        String[] mensaje3 = {"", "soy", "un", "mensaje"};

        ArrayList<String> mensajeDescifrado = interpretador.interpretarMensajes(new Mensajes(mensaje1, mensaje2, mensaje3));

        ArrayList<String> mensajeEsperado = new ArrayList<>(Arrays.asList("Hola", "soy", "un","mensaje"));

        Assertions.assertEquals(mensajeEsperado, mensajeDescifrado);
    }

    @Test
    @DisplayName("Se puede resolver tres mensajes de distinto length")
    public void testInterpreteGeneraMensaje2(){
        String[] mensaje1 = {"","este", "es", "un", "mensaje"};
        String[] mensaje2 = {"este", "", "un", "mensaje"};
        String[] mensaje3 = {"", "", "es", "", "mensaje"};

        ArrayList<String> mensajeDescifrado = interpretador.interpretarMensajes(new Mensajes(mensaje1, mensaje2, mensaje3));

        ArrayList<String> mensajeEsperado = new ArrayList<>(Arrays.asList("este", "es", "un", "mensaje"));

        Assertions.assertEquals(mensajeEsperado, mensajeDescifrado);
    }

    @Test
    @DisplayName("Se puede resolver tres mensajes con distintas palabra perdidas")
    public void testInterpreteGeneraMensaje3(){
        String[] mensaje1 = {"este", "", "", "mensaje", ""};
        String[] mensaje2 = {"", "es", "", "", "secreto"};
        String[] mensaje3 = {"este", "", "un", "", ""};

        ArrayList<String> mensajeDescifrado = interpretador.interpretarMensajes(new Mensajes(mensaje1, mensaje2, mensaje3));

        ArrayList<String> mensajeEsperado = new ArrayList<>(Arrays.asList("este", "es", "un", "mensaje", "secreto"));

        Assertions.assertEquals(mensajeEsperado, mensajeDescifrado);
    }
}

