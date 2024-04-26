public abstract class MusicaDecorator extends Musica {
    protected Musica music;

    public MusicaDecorator(Musica music) {
        this.music = music;
    }
    
    public abstract void tocar(String musica);
}