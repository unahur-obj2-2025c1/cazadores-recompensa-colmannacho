package ar.edu.unahur.obj2.Cazadores;

import ar.edu.unahur.obj2.Profugos.IProfugo;

public class Sigiloso implements TipoCazador {
    @Override
    public boolean puedeCapturar(IProfugo profugo) {
        return profugo.getHabilidad() < 50;
    }

    @Override
    public void concecuenciaIntimidacion(IProfugo profugo) {
        profugo.reducirHabilidad();
    }

}
