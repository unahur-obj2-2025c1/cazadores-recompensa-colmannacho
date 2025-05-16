package ar.edu.unahur.obj2.Profugos;

public abstract class ProfugoDecorator implements IProfugo {
    private IProfugo profugoDecorado;

    public ProfugoDecorator(IProfugo profugoDecorado) {
        this.profugoDecorado = profugoDecorado;
    }

    public IProfugo getProfugoDecorado() {
        return profugoDecorado;
    }

    @Override
    public Integer getInocencia() {
        return profugoDecorado.getInocencia(); 
    }

    @Override
    public Integer getHabilidad() {
        return profugoDecorado.getHabilidad();
    }

    @Override
    public Boolean esNervioso() {
        return profugoDecorado.esNervioso();
    }

    @Override
    public void volverseNervioso() {
        profugoDecorado.volverseNervioso();
    }

    @Override
    public void dejarDeEstarNervioso() {
        profugoDecorado.dejarDeEstarNervioso();
    }

    @Override
    public void reducirHabilidad() {
        profugoDecorado.reducirHabilidad();
    }

    @Override
    public void disminuirInocencia() {
        profugoDecorado.disminuirInocencia();
    }
}
