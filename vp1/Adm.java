package VP1;

public class Adm {
    private final ImoveisCadastrados[] imoveis;
    private int indiceDoProximoImovel;

    public Adm() {
        imoveis = new ImoveisCadastrados[10];
    }


    public Adm(int idImovel) {
        ImoveisCadastrados imovel = Null;

        for (int i = 0; i < imoveis.length; i++) {
            if (idImovel == ImoveisCadastrados.getNumero()){
                imovel = ImoveisCadastrados;
            break;
        }

    }
        return imovel;

}
    public void cadastrarImovel(String numero){
        ImoveisCadastrados imovelNumero = new ImoveisCadastrados(numero);

        imoveis[indiceDoProximoImovel] = imovelNumero;
        indiceDoProximoImovel++;

        System.out.println("O id do seu imével é" + imovelNumero.getCodigoDoImovel());
    }



}

