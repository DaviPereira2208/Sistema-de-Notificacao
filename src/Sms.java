public class Sms  implements Notificador{

    private String nome;
    private int numero;

    public Sms(String nome, int numero) {
        this.nome = nome;
        this.numero = numero;
    }

    @Override
    public void enviar(String mensagem) {
        IO.println("Enviando SMS: " + mensagem);
    }

    @Override
    public String toString() {
        return "Sms{" +
                "nome='" + nome + '\'' +
                ", numero=" + numero +
                '}';
    }
}
