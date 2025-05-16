package ar.edu.unahur.obj2.Profugos;

public class EntrenamientoElite extends ProfugoDecorator{

    public EntrenamientoElite(IProfugo profugoDecorado) {
        super(profugoDecorado);
    }

    @Override
    public Boolean esNervioso() {
        return false;
    }

    @Override
    public void volverseNervioso() {}
}
