public class Fotos implements CadastrarFotos {
    private String foto;
    private int data;
    private String responsavel;

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public void setData(int data) {
        this.data = data;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    @Override
    public String cadstrarFoto() {
        return "Foto: " + this.foto + " Data: " + this.data + " Pessoa responsável pela foto: " + this.responsavel;
    }
}
