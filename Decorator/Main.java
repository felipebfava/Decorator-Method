public class Main {
    public static void main(String[] args) {
        
        Musica music = new Musica();
        //tocando musica sem nenhuma alteracao
        music.tocar("Cover da Lady Gaga\n");

        
        music = new EfeitosSonorosDecorator(music, true, false);
        //tocando musica com efeito eco, sem reverb
        music.tocar("\nEsse som está diferente do original");
        
        music = new EqualizacaoDecorator(new EfeitosSonorosDecorator(music, false, true), 5, 0);
        /*tocando musica com efeito eco, reverb e com grave
        por mais que eu passe o eco como false, ele fica com a função anterior que o eco era true
        solucao: Comente a funcao onde eco é true e agora sera false.
        */
        music.tocar("\nMusica com reverb e grave");
    }
}