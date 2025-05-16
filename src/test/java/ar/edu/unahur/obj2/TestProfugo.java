package ar.edu.unahur.obj2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.Profugos.*;

public class TestProfugo {
    
    private ProfugoDefault profugo1 = new ProfugoDefault(10, 15, false);
    private ProfugoDefault profugo2 = new ProfugoDefault(10, 15, true);

    @Test
    public void profugo1DejaDeSerNervioso() {
        profugo1.volverseNervioso();
        assertEquals(Boolean.TRUE, profugo1.esNervioso());
    }

    @Test
    public void profugo1PasaASerNercioso(){
        profugo1.dejarDeEstarNervioso();
        assertEquals(Boolean.FALSE, profugo1.esNervioso());
    }

    @Test
    public void profugo1ReduceHabilidad() {
        profugo1.reducirHabilidad();
        assertEquals(10, profugo1.getHabilidad());
    }

    @Test
    public void profugo1DisminuyeInocencia() {
        profugo1.disminuirInocencia();
        assertEquals(8, profugo1.getInocencia());
    }

    @Test
    public void profugo2EntrenaArtesMarcialesYDuplicaHabilidad() { 
        assertEquals(15, profugo2.getHabilidad());
        
        IProfugo profugoArtesMarciales = new ArtesMarcialesAvanzadas(profugo2);

        assertEquals(30, profugoArtesMarciales.getHabilidad());
    }

    @Test
    public void profugo2HaceEntrenamientoEliteDejaDeSerNerviosoYNoPuedeCambiar() { 
        assertTrue(profugo2.esNervioso());

        IProfugo profugoEntrenamientoElite = new EntrenamientoElite(profugo2);

        profugoEntrenamientoElite.dejarDeEstarNervioso();
        assertFalse(profugoEntrenamientoElite.esNervioso());
    }

    @Test
    public void profugo2TieneProteccionLegalYSuInocenciaNoDisminuteDe40() { 
        assertEquals(10, profugo2.getInocencia());

        IProfugo profugoProteccionLegal = new ProteccionLegal(profugo2);

        profugoProteccionLegal.disminuirInocencia();
        assertEquals(40, profugoProteccionLegal.getInocencia());
    }

}
