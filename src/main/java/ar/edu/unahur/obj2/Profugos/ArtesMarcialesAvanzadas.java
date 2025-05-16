package ar.edu.unahur.obj2.Profugos;

public class ArtesMarcialesAvanzadas extends ProfugoDecorator{

    public ArtesMarcialesAvanzadas(IProfugo profugoDecorado) {
        super(profugoDecorado);
    }

    @Override
    public Integer getHabilidad() {
        return Math.min(100, super.getProfugoDecorado().getHabilidad() * 2);
    }

}
