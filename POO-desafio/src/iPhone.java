public class iPhone {
    private ReprodutorMusical reprodutorMusical;
    private AparelhoTelefonico aparelhoTelefonico;
    private NavegadorInternet navegadorInternet;

    public iPhone() {
        reprodutorMusical = new ReprodutorMusicalImpl();
        aparelhoTelefonico = new AparelhoTelefonicoImpl();
        navegadorInternet = new NavegadorInternetImpl();
    }

    public void ativarModoAviao() {
        // Lógica para ativar o modo avião no iPhone
    }
}

interface ReprodutorMusical {
    void tocar();
    void pausar();
    void selecionarMusica(String musica);
}

class ReprodutorMusicalImpl implements ReprodutorMusical {
    @Override
    public void tocar() {
        System.out.println("Reproduzindo música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausado");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Música " + " selecionada");
    }
}

interface AparelhoTelefonico {
    void ligar(String numero);
    void atenderChamada();
    void iniciarCorreioVoz();
}

class AparelhoTelefonicoImpl implements AparelhoTelefonico {
    @Override
    public void ligar(String numero) {
        System.out.println("Discando para " + numero);
    }

    @Override
    public void atenderChamada() {
        System.out.println("Chamada em andamento");
    }

    @Override
    public void  iniciarCorreioVoz(){
        System.out.println("Ligando para caixa postal...");
    }
}

interface NavegadorInternet {
    void exibirPagina(String url);
    void adicionarNovaAba();
    void atualizarPagina();
}

class NavegadorInternetImpl implements NavegadorInternet {
    @Override
    public void exibirPagina(String url) {
        System.out.println("Acessando: " = url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualziada");
    }
}
