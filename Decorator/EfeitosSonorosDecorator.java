public class EfeitosSonorosDecorator extends MusicaDecorator{
    private boolean eco;
    private boolean reverb;

    public EfeitosSonorosDecorator(Musica music, boolean eco, boolean reverb) {
        super(music);
        this.eco = eco;
        this.reverb = reverb;
    }

    public void tocar(String musica) {
        music.tocar(musica);

        if(eco) {
            System.out.println("Play Music with eco effect");
        }

        if(reverb) {
            System.out.println("Play Music with reverb effect");
        }
    }
}
