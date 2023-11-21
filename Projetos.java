public class Projetos {
    private String nomeProjeto;
    private String instituicao;
    private String destinadoA;
    public void setNomeProjeto(String nomeProjeto) {
        this.nomeProjeto = nomeProjeto;
    }

    public void setInstituicao(String instituicao) {
        this.instituicao = instituicao;
    }

    public void setDestinadoA(String destinadoA) {
        this.destinadoA = destinadoA;
    }

    public String cadastrarProjeto() {
        return "Nome do projeto: " + this.nomeProjeto + " Instrituições: " + this.instituicao + " Destinado há " + this.destinadoA;
    }
}
