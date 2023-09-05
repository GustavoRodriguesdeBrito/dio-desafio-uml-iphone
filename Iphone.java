package grb.uml.iphone;

import java.util.List;

class Iphone implements IAparelhoTelefonico, INavegadorInternet, IReprodutorMusical {

    List<String> listaContatos;
    List<String> listaMidia;

    public void powerOn() {
        System.out.println("ligando...");
    }

    public void powerOff() {
        System.out.println("desligando...");
    }

    @Override
    public void encerrarlicagao() {
        System.out.println("ligação encerrada");

    }

    @Override
    public void iniciarCorreioDeVoz() {
        System.out.println("iniciando correio de voz...");

    }

    @Override
    public void iniciarLligacao(String numTelefone) {
        System.out.println("iniciando chamada para: " + numTelefone);

    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("abrindo nova aba...");

    }

    @Override
    public void atualizarPagina() {
        System.out.println("atualizando página...");

    }

    @Override
    public void exibirPagina(String urlPagina) {
        System.out.println("Exibindo página: " + urlPagina);

    }

    @Override
    public void fecharAba() {
        System.out.println("fechando aba...");

    }

    @Override
    public void pausar() {
        System.out.println("música pausada");

    }

    @Override
    public void selecionarMusica(String nomeMusica) {
        System.out.println("música selecionada: " + nomeMusica);

    }

    @Override
    public void tocar() {
        System.out.println("tocando música...");

    }

}
