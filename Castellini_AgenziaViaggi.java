import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

class GruppoTuristi {
    private String nome;
    private int numeroTuristi;

    public GruppoTuristi(String nome) {
        this.nome = nome;
        this.numeroTuristi = 25;
    }

    public void partenzaDagliAlloggi() {
        System.out.println(nome + ": Partenza dagli alloggi.");
    }

    public void arrivoAlPorto() {
        System.out.println(nome + ": Arrivo al porto.");
    }

    public void pagamentoBiglietto() {
        System.out.println(nome + ": Pagamento biglietto.");
    }

    public void imbarco() {
        System.out.println(nome + ": Imbarco sul traghetto.");
    }
}

class Traghetto {
    private int capacita;

    public Traghetto() {
        this.capacita = 25;
    }

    public void partenzaDalPorto() {
        System.out.println("Traghetto: Partenza dal porto.");
    }

    public void ritornoAlPorto() {
        System.out.println("Traghetto: Ritorno al porto.");
    }
}

class Porto {
    private List<String> storicoViaggi;

    public Porto() {
        this.storicoViaggi = new ArrayList<>();
    }

    public void gestisciViaggio(GruppoTuristi gruppo, Traghetto traghetto) {
        gruppo.partenzaDagliAlloggi();
        gruppo.arrivoAlPorto();
        gruppo.pagamentoBiglietto();
        gruppo.imbarco();
        traghetto.partenzaDalPorto();
        traghetto.ritornoAlPorto();
        // Aggiungiamo il viaggio allo storico
        String viaggio = new Date() + " - Viaggio " + gruppo.nome + " completato.";
        storicoViaggi.add(viaggio);
    }

    public List<String> getStoricoViaggi() {
        return storicoViaggi;
    }
}

class Applicazione {
    private Porto porto;
    private Traghetto traghetto;
    private List<GruppoTuristi> gruppi;

    public Applicazione() {
        porto = new Porto();
        traghetto = new Traghetto();
        gruppi = new ArrayList<>();
        gruppi.add(new GruppoTuristi("Francesi"));
        gruppi.add(new GruppoTuristi("Tedeschi"));
        gruppi.add(new GruppoTuristi("Spagnoli"));
    }

    public void esegui() {
        System.out.println("Inizio giornata di viaggi...");
        for (GruppoTuristi gruppo : gruppi) {
            porto.gestisciViaggio(gruppo, traghetto);
        
    public static void main(String[] args) {
        Applicazione app = new Applicazione();
        app.esegui();
    }
}
