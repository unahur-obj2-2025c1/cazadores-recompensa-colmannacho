package ar.edu.unahur.obj2.Cazadores;

import java.util.ArrayList;
import java.util.List;

import ar.edu.unahur.obj2.Agencia.Zona;
import ar.edu.unahur.obj2.Profugos.IProfugo;

public class Cazador {
    private Integer experiencia;
    private TipoCazador especialidad;
    private List<IProfugo> profugosCapturados = new ArrayList();

    public Cazador(Integer experiencia, TipoCazador tipo) {
        this.experiencia = experiencia;
        this.especialidad = tipo;
    }

    public Integer getExperiencia() {
        return experiencia;
    }

    public void capturar(IProfugo profugo, Zona zona){
        if (experiencia > profugo.getInocencia() && especialidad.puedeCapturar(profugo)){
            zona.getProfugos().remove(profugo);
            profugosCapturados.add(profugo);
        }
        else {
            this.intimidar(profugo);
        }
    }

    public void intimidar(IProfugo profugo){
        profugo.disminuirInocencia();
        especialidad.concecuenciaIntimidacion(profugo);
    }

    public void sumarExperiencia(Zona zona){
        experiencia += zona.getProfugos().stream().mapToInt(profugo -> profugo.getHabilidad()).min().orElse(0) + 2 * profugosCapturados.size();
    }

    public List<IProfugo> getProfugosCapturados() {
        return profugosCapturados;
    }
}
