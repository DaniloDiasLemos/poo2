public class Personagem {
    private final String nome;
    private final PersonagemProfissoes.profissao profissao;
    private final Equipamento equipamento;
    private final Atributos atributos;
    private final Habilidades habilidades;

    public Personagem(String nome, PersonagemProfissoes.profissao profissao, Equipamento equipamento, Atributos atributos,
            Habilidades habilidades) {
        this.nome = nome;
        this.profissao = profissao;
        this.equipamento = equipamento;
        this.atributos = atributos;
        this.habilidades = habilidades;
    }

    public String getNome() {
        return nome;
    }

    public PersonagemProfissoes.profissao getProfissao() {
        return profissao;
    }

    public Equipamento getEquipamento() {
        return equipamento;
    }

    public Atributos getAtributos() {
        return atributos;
    }

    public Habilidades getHabilidades() {
        return habilidades;
    }
}