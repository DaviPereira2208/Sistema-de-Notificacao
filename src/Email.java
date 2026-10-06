public class Email implements Notificador{

    private String nome;
    private String de;
    private String para;

    public Email(String nome, String de, String para) {
        this.nome = nome;
        this.de = de;
        this.para = para;
    }

    @Override
    public void enviar(String mensagem) {
        IO.println("Enviando Email: " + mensagem);
    }

    @Override
    public String   toString() {
        return "Email{" +
                "nome='" + nome + '\'' +
                ", de='" + de + '\'' +
                ", para='" + para + '\'' +
                '}';
    }
}
