package fatec.aula4;

public class Edereco {
    private String logradouro;
    private String cep;
    private Estado estado;

    public Edereco(String logradouro, String cep, Estado estado) {
        this.logradouro = logradouro;
        this.cep = cep;
        this.estado = estado;
    }

    public void mostrarDados(){
        System.out.println("logradouro"+logradouro);
        System.out.println("logradouro"+cep);
        System.out.println("logradouro"+estado);
    }

    public String getLogradouro(){
        return logradouro;
    }

        
}
