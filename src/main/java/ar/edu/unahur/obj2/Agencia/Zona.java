package ar.edu.unahur.obj2.Agencia;

import java.util.List;

import ar.edu.unahur.obj2.Cazadores.Cazador;
import ar.edu.unahur.obj2.Profugos.IProfugo;

public class Zona {

    private String nombre;
    private List<IProfugo> profugos;

    public Zona(String nombre, List<IProfugo> profugos) {
        this.nombre = nombre;
        this.profugos = profugos;
    }

    public void captura(Cazador cazador){
        profugos.forEach(profugo -> cazador.capturar(profugo,this));
        cazador.sumarExperiencia(this);
    }

    public List<IProfugo> getProfugos() {
        return profugos;
    }
}