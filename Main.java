import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Maria", "Feminino"));
        pessoas.add(new Pessoa("João", "Masculino"));
        pessoas.add(new Pessoa("Ana", "Feminino"));
        pessoas.add(new Pessoa("Carlos", "Masculino"));
        pessoas.add(new Pessoa("Patricia", "Feminino"));

        System.out.println("Lista de pessoas:");
        for (Pessoa p : pessoas) {
            System.out.println("Nome: " + p.getNome() + ", Sexo: " + p.getSexo());
        }

        List<Pessoa> feminino = new ArrayList<>();
        pessoas.stream()
                .filter(p -> p.getSexo().equals("Feminino"))
                .forEach(feminino::add);

        System.out.println("Lista de pessoas do sexo feminino:");
        for (Pessoa p : feminino) {
            System.out.println("Nome: " + p.getNome() + ", Sexo: " + p.getSexo());
        }
    }

    }
