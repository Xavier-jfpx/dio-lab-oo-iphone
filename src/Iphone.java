
public class Iphone implements IPlayer, ITelefone, IInternet {
    @Override
    public void pararMusica() {
        System.out.println("Parar música.");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionar música.");

    }

    @Override
    public void tocarMusica() {
        System.out.println("Tocar música.");
    }

    @Override
    public void atenderChamada() {
        System.out.println("Atender telefone.");

    }

    @Override
    public void desligarChamada() {
        System.out.println("Desligar telefone.");

    }

    @Override
    public void ligar() {
        System.out.println("Realizar ligação.");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibir Página");
    }

    @Override
    public void AdicionarTab() {
        System.out.println("Adicionar página.");
    }

    @Override
    public void atualizarTab() {
        System.out.println("Atualizar página.");
    }

}
