import java.util.UUID;

public class Aluno {
    private String endereco;
    private String nome;
    private int idade;
    private UUID uuid;

    public Aluno()
    {

    }

    public String getEndereco()
    {
        return endereco;
    }

    public void setEndereco(String endereco)
    {
        this.endereco = endereco;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public int getIdade()
    {
        return idade;
    }

    public void setIdade(int idade)
    {
        this.idade = idade;
    }

    public UUID getUUID()
    {
        return uuid;
    }

    public void setUUID(UUID uuid)
    {
        this.uuid = uuid;
    }
}
