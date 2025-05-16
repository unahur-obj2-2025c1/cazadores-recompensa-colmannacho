package ar.edu.unahur.obj2;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;

import ar.edu.unahur.obj2.Agencia.Zona;
import ar.edu.unahur.obj2.Cazadores.Cazador;
import ar.edu.unahur.obj2.Cazadores.Rural;
import ar.edu.unahur.obj2.Cazadores.Sigiloso;
import ar.edu.unahur.obj2.Cazadores.Urbano;
import ar.edu.unahur.obj2.Profugos.ArtesMarcialesAvanzadas;
import ar.edu.unahur.obj2.Profugos.EntrenamientoElite;
import ar.edu.unahur.obj2.Profugos.IProfugo;
import ar.edu.unahur.obj2.Profugos.ProfugoDefault;

public class TestCazador {
    private Cazador cazador1 = new Cazador(0, new Urbano());
    private Cazador cazador2 = new Cazador(15, new Rural());
    private Cazador cazador3 = new Cazador(0, new Sigiloso());

    private ProfugoDefault profugo1 = new ProfugoDefault(10, 15, false);
    private IProfugo profugoConEntrenamientoElite = new EntrenamientoElite(new ProfugoDefault(10, 15, true));
    private IProfugo profugoConArtesMarcialesAvanzadas = new ArtesMarcialesAvanzadas(new ProfugoDefault(10, 15, true));
    private Zona zona1 = new Zona("zona1", new ArrayList<>(Arrays.asList(profugo1, profugoConEntrenamientoElite, profugoConArtesMarcialesAvanzadas)));

    @Test
    public void cazador1NoPuedeCapturarProfugosDeZona1YAumentaExperienciaA15() {
        zona1.captura(cazador1);
        
        assertEquals(0, cazador1.getProfugosCapturados().size());
        assertEquals(15, cazador1.getExperiencia());
    }

    @Test
    public void cazador2CapturaSoloAlProfugoDeArtesMarcialesDeZona1YAumentaExperienciaA2(){
       // zona1.captura(cazador2);
        
        //assertEquals(2, zona1.getProfugos().size());
        //assertEquals(1, cazador2.getProfugosCapturados().size());
        //assertEquals(2, cazador2.getExperiencia());
    }
}
