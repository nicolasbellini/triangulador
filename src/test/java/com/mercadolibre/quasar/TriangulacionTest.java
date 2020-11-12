package com.mercadolibre.quasar;

import com.mercadolibre.quasar.model.Distancias;
import com.mercadolibre.quasar.model.Posicion;
import com.mercadolibre.quasar.model.Triangulador;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class TriangulacionTest {

    private static Triangulador triangulador;

    @BeforeAll
    public static void setUp(){
        triangulador = new Triangulador();
    }

    @Test
    public void testTriangularUnObjeto(){
      Posicion posicion = triangulador.triangularLocacion(new Distancias(1f, 1f, 1f));

      Assertions.assertEquals(posicion.getX(), -300.5 );
      Assertions.assertEquals(posicion.getY(), -1419.0025);
    }
}
