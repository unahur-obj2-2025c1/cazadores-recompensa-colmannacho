package ar.edu.unahur.obj2.Profugos;

public class ProteccionLegal extends ProfugoDecorator{

    public ProteccionLegal(IProfugo profugoDecorado) {
        super(profugoDecorado);
    }

    @Override
    public Integer getInocencia() {
        return Math.max(40, super.getInocencia());
    }

    @Override
    public void disminuirInocencia(){
        if (super.getInocencia() > 40) {
            super.disminuirInocencia();
        }
    }

}
