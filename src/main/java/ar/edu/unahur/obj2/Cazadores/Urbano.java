package ar.edu.unahur.obj2.Cazadores;

import ar.edu.unahur.obj2.Profugos.IProfugo;

public class Urbano implements TipoCazador {
    @Override
    public boolean puedeCapturar(IProfugo profugo) {
        return !profugo.esNervioso();
    }

    @Override
    public void concecuenciaIntimidacion(IProfugo profugo) {
        profugo.dejarDeEstarNervioso();
    }

}
