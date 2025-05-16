package ar.edu.unahur.obj2.Agencia;

import java.util.Comparator;
import java.util.Set;
import java.util.stream.Collectors;

import ar.edu.unahur.obj2.Cazadores.Cazador;
import ar.edu.unahur.obj2.Profugos.IProfugo;

public class AgenciaCazadores {
    private Set<Cazador> cazadores;

    public AgenciaCazadores(Set<Cazador> cazadores) {
        this.cazadores = cazadores;
    }

    public void agregarCazador(Cazador cazador) {
        cazadores.add(cazador);
    }

    public Set<IProfugo> profugosCapturados() {
        return cazadores.stream().flatMap(cazador -> cazador.getProfugosCapturados().stream()).collect(Collectors.toSet());
    }

    public IProfugo profugoMasHabilCapturado(){
        return this.profugosCapturados().stream().max(Comparator.comparing(IProfugo::getHabilidad)).orElseThrow(() -> new RuntimeException("No hay prófugos capturados"));
    }

    public Cazador cazadorConMasCapturasRealizadas(){
        return cazadores.stream().max(Comparator.comparing(cazador -> cazador.getProfugosCapturados().size())).orElseThrow(() -> new RuntimeException("No hay cazadores"));
    }
}
