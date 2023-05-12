public class PersonagemBuilder implements Builder {
    private String nome;
    private PersonagemProfissoes.profissao profissao;
    private Equipamento equipamento;
    private Atributos atributos;
    private Habilidades habilidades;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setProfissao(int profissao) {
        switch (profissao) {
            case 1:
                this.profissao = PersonagemProfissoes.profissao.MAGO;
                break;

            case 2:
                this.profissao = PersonagemProfissoes.profissao.GUERREIRO;
                break;

            case 3:
                this.profissao = PersonagemProfissoes.profissao.ARQUEIRO;
                break;
        }
    }

    public void setEquipamento(Equipamento equipamento) {
        this.equipamento = equipamento;
    }

    public void setAtributos(Atributos atributos) {
        this.atributos = atributos;
    }

    public void setHabilidades(Habilidades habilidades) {
        this.habilidades = habilidades;
    }

    public void getPersonagem() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Profissão: " + this.profissao);
        equipamento.getEquipamento();
        atributos.getAtributos();
        habilidades.getHabilidades();
    }
}
