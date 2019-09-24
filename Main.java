import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.UUID;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Vagas");
        // testeCriarVagas();
        // System.out.println("%%%%%%%%%%%%%%%%%%%");
        // System.out.println("Candidatos");
        // testeCriarCandidados();
        // System.out.println("%%%%%%%%%%%%%%%%%%%");
        avaliarCandidato();
    }

    public static void testeCriarVagas() {
        Map<Vaga, String> listVagas = criarVagas();

        Set set = listVagas.entrySet();
        Iterator i = set.iterator();

        while (i.hasNext()) {
            Map.Entry entrada = (Map.Entry) i.next();
            System.out.println(entrada.getKey());
        }
    }

    public static Map<Vaga, String> criarVagas() { // Esta OK
        Map<Vaga, String> vagas = new HashMap<>();
        Vaga programador = new Vaga();
        programador.setValue("vaga1");
        programador.setNome("Analista");
        programador.setBeneficio("VR, VA, VT, AM");
        programador.setExperienciaMinima(1);
        programador.setSalariao("2.300,00");
        vagas.put(programador, programador.getValue());

        Vaga cordenador = new Vaga();
        cordenador.setValue("vaga2");
        cordenador.setNome("Cordenador de TI");
        cordenador.setBeneficio("VR, VA, VT, AO, AM, PLR");
        cordenador.setExperienciaMinima(5);
        cordenador.setSalariao("6.500,00");
        vagas.put(cordenador, cordenador.getValue());

        Vaga analista = new Vaga();
        analista.setValue("vaga3");
        analista.setNome("Programador");
        analista.setBeneficio("VR, VA, VT, AM");
        analista.setExperienciaMinima(4);
        analista.setSalariao("4.300,00");
        vagas.put(analista, analista.getValue());

        Vaga tester = new Vaga();
        tester.setValue("vaga4");
        tester.setNome("Tester");
        tester.setBeneficio("VR, VA, VT, AM");
        tester.setExperienciaMinima(1);
        tester.setSalariao("4.300,00");
        vagas.put(tester, tester.getValue());

        return vagas;
    }

    public static void testeCriarCandidados() {
        Map<Candidato, String> candidatos = criarCandidatos();
        int cont = 1;

        Set set = candidatos.entrySet();

        Iterator i = set.iterator();

        while (i.hasNext()) {
            Map.Entry entrada = (Map.Entry) i.next();
            System.out.println(entrada.getKey());
        }
    }

    public static Map<Candidato, String> criarCandidatos() { // Esta Ok
        Map<Candidato, String> candidatos = new HashMap<>();
        Random r = new Random();

        Candidato adelia = new Candidato();
        adelia.setValue("00001");
        adelia.setNome("Adelia");
        adelia.setSobrenome("Monteiro");
        adelia.setCargo("Ouvidoria");
        adelia.setExperiencia(4);
        adelia.setSexo(Sexo.F);
        adelia.setIdade(35);
        adelia.setCpf(String.valueOf(r.nextLong()));
        adelia.setPessoaComDeficiencia(PessoaComDeficiencia.NAO);
        adelia.setRg(String.valueOf(r.nextInt()));
        adelia.setTitulo(String.valueOf(r.nextInt()));
        adelia.setDataValidade(Calendar.getInstance().getTime());

        candidatos.put(adelia, adelia.getValue());

        Candidato lucas = new Candidato();
        lucas.setValue("00002");
        lucas.setNome("Lucas");
        lucas.setSobrenome("Vieira");
        lucas.setCargo("Analista");
        lucas.setExperiencia(1);
        lucas.setSexo(Sexo.M);
        lucas.setIdade(19);
        lucas.setCpf(String.valueOf(r.nextLong()));
        lucas.setPessoaComDeficiencia(PessoaComDeficiencia.NAO);
        lucas.setRg(String.valueOf(r.nextInt()));
        lucas.setTitulo(String.valueOf(r.nextInt()));
        lucas.setDataValidade(Calendar.getInstance().getTime());

        candidatos.put(lucas, lucas.getValue());

        Candidato allan = new Candidato();
        allan.setValue("00003");
        allan.setNome("Allan");
        allan.setSobrenome("Vieira");
        allan.setCargo("Analista");
        allan.setExperiencia(1);
        allan.setSexo(Sexo.M);
        allan.setIdade(19);
        allan.setCpf(String.valueOf(r.nextLong()));
        allan.setPessoaComDeficiencia(PessoaComDeficiencia.NAO);
        allan.setRg(String.valueOf(r.nextInt()));
        allan.setTitulo(String.valueOf(r.nextInt()));
        allan.setDataValidade(Calendar.getInstance().getTime());

        candidatos.put(allan, allan.getValue());

        Candidato julia = new Candidato();
        julia.setValue("00004");
        julia.setNome("Julia");
        julia.setSobrenome("Vieira");
        julia.setCargo("Produtora de moda");
        julia.setExperiencia(2);
        julia.setSexo(Sexo.F);
        julia.setIdade(21);
        julia.setCpf(String.valueOf(r.nextLong()));
        julia.setPessoaComDeficiencia(PessoaComDeficiencia.NAO);
        julia.setRg(String.valueOf(r.nextInt()));
        julia.setTitulo(String.valueOf(r.nextInt()));
        julia.setDataValidade(Calendar.getInstance().getTime());

        candidatos.put(julia, julia.getValue());
        return candidatos;

    }

    public static void avaliarCandidato() {
        boolean aprovado = false;

        Map<Candidato, String> candidatos = criarCandidatos();
        Set set = candidatos.entrySet();
        Iterator i = set.iterator();

        while (i.hasNext()) {
            Map.Entry entrada = (Map.Entry) i.next();
            System.out.println(entrada.getKey());

        }

        Map<Vaga, String> vagas = criarVagas();
        set = vagas.entrySet();
        i = set.iterator();

        while (i.hasNext()) {
            Map.Entry entrada = (Map.Entry) i.next();
            System.out.println(entrada.getKey());

        }

    }

    /**
     * receita de coxinha producao coxinhas 50 un fabrica 2 kl de farinha com
     * fermento 6 ovos 500 ml leite gelado 100 g de acucar 10 g de mateiga recheio 2
     * peitos de frango cozidos e desfiado temperado tempeiro 10 g de coentro 5 g de
     * tempeiro baiano 5 g de sal
     * 
     * 1 produto kit festa para 10 pessoas 1.1 producao coxinhas 50 un 1.2
     * refrigerante 1.3 etc...
     * 
     * 2 kl farinha com fermento 3 uni ovos 4 ect ..
     * 
     */

    public static void testeVeiculos() {
        Veiculo carro = new Veiculo();
        carro.setNome("Corsa");
        carro.setDataValidade(null);
        carro.setValue("carro.corsa");
        carro.setPlaca("lfv0987");
        System.out.println(carro);
    }
}

// Entidades
class Candidato extends Pessoa {
    private String email;
    private String cargo;
    private boolean estaEmpregado;
    private PretensaoSalarial pretensaoSalarial;
    private int experiencia;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public boolean isEstaEmpregado() {
        return estaEmpregado;
    }

    public void setEstaEmpregado(boolean estaEmpregado) {
        this.estaEmpregado = estaEmpregado;
    }

    public PretensaoSalarial getPretensaoSalarial() {
        return pretensaoSalarial;
    }

    public void setPretensaoSalarial(PretensaoSalarial pretensaoSalarial) {
        this.pretensaoSalarial = pretensaoSalarial;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public String toString() {
        return super.toString() + "Cargo: " + cargo + "\nE-mail: " + email + "\nEsta empregado: " + estaEmpregado
                + "\nExperiencia: " + experiencia + "\nPretensao Salarial: " + pretensaoSalarial + "\n";
    }

}

class Vaga extends Entidade {
    private String beneficio;
    private String salariao;
    private int experienciaMinima;
    private int idadeMinima;

    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }

    public String getSalariao() {
        return salariao;
    }

    public void setSalariao(String salariao) {
        this.salariao = salariao;
    }

    @Override
    public String toString() {
        return super.toString() + "Beneficio: " + beneficio + "\nSalariao: " + salariao + "\n";
    }

    public int getExperienciaMinima() {
        return experienciaMinima;
    }

    public void setExperienciaMinima(int experienciaMinima) {
        this.experienciaMinima = experienciaMinima;
    }

    public int getIdadeMinima() {
        return idadeMinima;
    }

    public void setIdadeMinima(int idadeMinima) {
        this.idadeMinima = idadeMinima;
    }

    public Vaga() {
        this.setId(UUID.randomUUID().toString().toUpperCase().replace("-", ""));
    }

}

class Colaborador extends Pessoa {
    private static String re = ("Colaborador" + UUID.randomUUID()).toUpperCase().replace("-", "");

    public String getRe() {
        return re;
    }

    @Override
    public String toString() {
        return super.toString() + "RE: " + getRe();
    }

}

class Pessoa extends Entidade {// Esta Pronta
    private String sobrenome;
    private int idade;
    private Sexo sexo;
    private String cpf;
    private String rg;
    private String titulo;
    private PessoaComDeficiencia pessoaComDeficiencia;

    public String getSobrenome() {
        return sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public PessoaComDeficiencia getPessoaComDeficiencia() {
        return pessoaComDeficiencia;
    }

    public void setPessoaComDeficiencia(PessoaComDeficiencia pessoaComDeficiencia) {
        this.pessoaComDeficiencia = pessoaComDeficiencia;
    }

    @Override
    public String toString() {
        return super.toString() + "CPF: " + cpf + "\nIdade: " + idade + "\nPessoa com deficiencia: "
                + pessoaComDeficiencia + "\nRG: " + rg + "\nSexo: " + sexo + "\nSobrenome: " + sobrenome + "\nTitulo: "
                + titulo + "\n";
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    public Pessoa() {
        this.setId(UUID.randomUUID().toString().toUpperCase().replace("-", ""));
    }

}

class Veiculo extends Entidade {
    private String placa;

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    @Override
    public String toString() {
        return super.toString() + "placa: " + getPlaca();
    }

    public Veiculo() {
        this.setId(UUID.randomUUID().toString().toUpperCase().replace("-", ""));
    }
}

class Entidade {
    private String id;
    private static Date dataCriacao = Calendar.getInstance().getTime();
    private Date dataValidade;
    private String value;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString() {
        return "Data Criacao: " + dataCriacao + "\nData Validade: " + dataValidade + "\nID: " + id + "\nNome: " + nome
                + "\nValue: " + value + "\n";
    }

    public void setId(String id) {
        this.id = id;
    }

}

// Enumeradores comboList
enum PessoaComDeficiencia { // Esta pronta
    SIM("Sim tenho deficiencia"), NAO("Nao tenho deficiencia"), INSS("Reabilitado INSS");

    private PessoaComDeficiencia(String pessoaComDeficiencia) {
        this.pessoaComDeficiencia = pessoaComDeficiencia;
    }

    String pessoaComDeficiencia;

    public String getPessoaComDeficiencia() {
        return pessoaComDeficiencia;
    }

    public void setPessoaComDeficiencia(String pessoaComDeficiencia) {
        this.pessoaComDeficiencia = pessoaComDeficiencia;
    }

    @Override
    public String toString() {
        return getPessoaComDeficiencia();
    }
}

// Pretensao
enum PretensaoSalarial { // Esta pronta
    ATEMIL("Ate R$1.000,00"), APARTIRDEMIL("Ate R$1.000,00"), ATE2MIL("Ate R$2.000,00"), ATE3MIL("Ate R$3.000,00");

    private PretensaoSalarial(String pretensaoSalarial) {
        this.pretensaoSalarial = pretensaoSalarial;
    }

    private String pretensaoSalarial;

    public String getPretensaoSalarial() {
        return pretensaoSalarial;
    }

    public void setPretensaoSalarial(String pretensaoSalarial) {
        this.pretensaoSalarial = pretensaoSalarial;
    }

}

enum Sexo {
    M("Masculino"), F("Feminino");

    private String sexo;

    Sexo(String sexo) {
        this.sexo = sexo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return getSexo();
    }
}

// Controladores
class ControllerCandidato {
    Candidato candidato = new Candidato();

    public ControllerCandidato(Candidato candidato) {
        this.candidato = candidato;
    }

}

class Conexao {
    PreparedStatement preparedStatement;
    Connection connection;

    public Conexao() {
        try {
            connection = preparedStatement.getConnection();

        } catch (SQLException e) {
            System.out.println(e);
        }

    }
}

class ControllerColaborador {
    Colaborador colaborador = null;

    public ControllerColaborador(String nome, int idade, Sexo sexo, String sobrenome, String cpf, String rg,
            PessoaComDeficiencia pessoaComDeficiencia, String titulo) {

        if (nome.isEmpty() || nome.equals("") || idade != 0 || !sexo.getSexo().isEmpty()) {
            colaborador = new Colaborador();
            this.colaborador.setNome(nome);
            this.colaborador.setSobrenome(sobrenome);
            this.colaborador.setIdade(idade);
            this.colaborador.setSexo(sexo);
            this.colaborador.setCpf(cpf);
            this.colaborador.setRg(rg);
            this.colaborador.setPessoaComDeficiencia(pessoaComDeficiencia);
            this.colaborador.setTitulo(titulo);

        } else {
            System.out.println("Erro");
        }
    }

    @Override
    public String toString() {
        return "ControllerColaborador [colaborador=" + colaborador;
    }

}