package com.mercadolibre.quasar;

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
      Posicion posicion = triangulador.triangularLocacion(1f, 1f, 1f);

      Assertions.assertEquals(posicion.x, -300.5 );
      Assertions.assertEquals(posicion.y, -1419.0025);
    }
}
