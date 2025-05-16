package ar.edu.unahur.obj2.Cazadores;

import ar.edu.unahur.obj2.Profugos.IProfugo;

public interface TipoCazador {
    boolean puedeCapturar(IProfugo profugo);
    void concecuenciaIntimidacion(IProfugo profugo);
}
