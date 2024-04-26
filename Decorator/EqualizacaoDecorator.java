public class EqualizacaoDecorator extends MusicaDecorator{
    private int graves;
    private int agudos;

    public EqualizacaoDecorator(Musica music, int graves, int agudos) {
        super(music);
        this.graves = graves;
        this.agudos = agudos;
    }

    public void tocar(String musica) {
        music.tocar(musica);
        System.out.println("Play Music with equalization: graves = " + graves + ", agudos = " + agudos);
    }
}
