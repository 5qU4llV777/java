package iphoneuml;

public class ReprodutorMusical {

    private String musicaAtual;

    public void tocar() { 
        System.out.println("Tocando música...");
    }

    public void pausar() { 
        System.out.println("Música pausada.");
    }

    public void selecionarMusica(String after_dark) { 
        this.musicaAtual = after_dark;
        System.out.println("Selecionada música: " + after_dark);
    }

    public String getMusicaAtual() {
        return musicaAtual;
    }
}