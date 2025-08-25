import java.util.Scanner;
/**
 
1. Implemente uma classe Livro com os seguintes atributos: título, autor e ano de
publicação. Crie um método que imprima os do objeto Livro.
2. Utilizando o exercício anterior, crie um atributo denominado editora. Crie um
novo objeto da classe Livro e imprima os dados atualizados, com a editora.
3. Crie uma classe chamada Aluno com os seguintes atributos: nome, matricula,
nota1 e nota2.
a. Crie o construtor para esse método.
b. Crie um método chamado calcularMedia() que retorna a média entre as duas notas.
c. Crie um método chamado imprimir() que mostra os dados do aluno.
d. Crie um método chamado aprovado() que retorna o estado do aluno
(aprovado/exame/reprovado).
 
 */

class Livro {
    String titulo;
    String autor;
    int ano_da_publicacao;
    String editora;

    public Livro(String titulo, String autor, int ano_da_publicacao) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano_da_publicacao = ano_da_publicacao;
    }

    public void imprimir() {
        System.out.println("Título do Livro: " + titulo);
        System.out.println("Autor do Livro: " + autor);
        System.out.println("Ano da Publicação do Livro: " + ano_da_publicacao);
        System.out.println("Editora do Livro: " + editora);
        }
}

class Aluno {
    String nome;
    String matricula;
    double nota1;
    double nota2;

    public Aluno(String nome, String matricula, double nota1, double nota2) {
        this.nome = nome;
        this.matricula = matricula;
        this.nota1 = nota1;
        this.nota2 = nota2;
    }

    public double calcularMedia() {
        return (nota1 + nota2) / 2;
    }

    public void imprimir() {
        System.out.println("Nome do Aluno(a): " + nome);
        System.out.println("Matrícula do Aluno(a): " + matricula);
        System.out.println("Nota 1 do Aluno(a): " + nota1);
        System.out.println("Nota 2 do Aluno(a): " + nota2);
        System.out.println("Média do Aluno(a): " + calcularMedia());
        System.out.println("Estado do Aluno(a): " + aprovado());
    }

    public String aprovado() {
        double media = calcularMedia();
        if (media >= 7) {
            return "Aprovado";
        } else if (media >= 4) {
            return "Exame";
        } else {
            return "Reprovado";
        }
    }
}

public class Exercício_3_Classes_e_Objetos {
    public static void main(String[] args) {
        System.out.println("=== Primeiro Livro ===");
        Livro livro1 = new Livro("As coisas que você só vê quando desacelera", "Haemin Sunim", 2012);
        livro1.editora = "SEXTANTE";
        livro1.imprimir();

        System.out.println("\n===  Aluna Aprovada ===");
        Aluno aluno1 = new Aluno("Nichole Maria Furtado", "2024901", 10.0, 10.0);
        aluno1.imprimir();

        System.out.println("\n=== Aluna em Exame ===");
        Aluno aluno2 = new Aluno("Maria Santos", "2023002", 5.0, 4.0);
        aluno2.imprimir();

        System.out.println("\n=== Aluno Reprovado ===");
        Aluno aluno3 = new Aluno("Pedro Souza", "2023003", 3.0, 2.0);
        aluno3.imprimir();

        // Adicionando interação com o usuário
        System.out.println("\n=== Agora é sua vez de testar! ===");
        Scanner scanner = new Scanner(System.in);

        System.out.println("\nVamos cadastrar um livro:");
        System.out.print("Digite o título do livro: ");
        String titulo = scanner.nextLine();
        System.out.print("Digite o autor do livro: ");
        String autor = scanner.nextLine();
        System.out.print("Digite o ano de publicação: ");
        int ano = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer
        System.out.print("Digite a editora: ");
        String editora = scanner.nextLine();

        Livro seuLivro = new Livro(titulo, autor, ano);
        seuLivro.editora = editora;
        System.out.println("\n=== Seu Livro ===");
        seuLivro.imprimir();

        System.out.println("\nAgora vamos cadastrar um aluno:");
        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        System.out.print("Digite a matrícula: ");
        String matricula = scanner.nextLine();
        System.out.print("Digite a primeira nota: ");
        double nota1 = scanner.nextDouble();
        System.out.print("Digite a segunda nota: ");
        double nota2 = scanner.nextDouble();

        Aluno seuAluno = new Aluno(nome, matricula, nota1, nota2);
        System.out.println("\n=== Seu Aluno ===");
        seuAluno.imprimir();

        scanner.close();
    }
}

/**
 Output

 === Primeiro Livro ===
Título do Livro: As coisas que você só vê quando desacelera
Autor do Livro: Haemin Sunim
Ano da Publicaç?o do Livro: 2012
Editora do Livro: SEXTANTE

===  Aluna Aprovada ===
Nome do Aluno(a): Nichole Maria Furtado
Matrícula do Aluno(a): 2024901
Nota 1 do Aluno(a): 10.0
Nota 2 do Aluno(a): 10.0
Média do Aluno(a): 10.0
Estado do Aluno(a): Aprovado

=== Aluna em Exame ===
Nome do Aluno(a): Maria Santos
Matrícula do Aluno(a): 2023002
Nota 1 do Aluno(a): 5.0
Nota 2 do Aluno(a): 4.0
Média do Aluno(a): 4.5
Estado do Aluno(a): Exame

=== Aluno Reprovado ===
Nome do Aluno(a): Pedro Souza
Matrícula do Aluno(a): 2023003
Nota 1 do Aluno(a): 3.0
Nota 2 do Aluno(a): 2.0
Média do Aluno(a): 2.5
Estado do Aluno(a): Reprovado

=== Agora é sua vez de testar! ===

Vamos cadastrar um livro:
Digite o título do livro: Não nascemos prontos!
Digite o autor do livro: Mario Sergio Cortella
Digite o ano de publicaç?o: 2015
Digite a editora: Nobilis

=== Seu Livro ===
Título do Livro: Nao nascemos prontos!
Autor do Livro: Mario Sergio Cortella
Ano da Publicaç?o do Livro: 2015
Editora do Livro: Nobilis

Agora vamos cadastrar um aluno:
Digite o nome do aluno: joaozinho
Digite a matrícula: 79130
Digite a primeira nota: 8
Digite a segunda nota: 4

=== Seu Aluno ===
Nome do Aluno(a): joaozinho
Matrícula do Aluno(a): 79130
Nota 1 do Aluno(a): 8.0
Nota 2 do Aluno(a): 4.0
Média do Aluno(a): 6.0
Estado do Aluno(a): Exame

  
 */