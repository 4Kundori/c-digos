package br.com.Livro;

public class Livro1 extends Livro {
    public static void main(String[] args) {
        Livro i = new Livro();
        i.titulo = "Java para Iniciantes";
        System.out.println(i.status());
        i.emprestar();
        System.out.println(i.status());
    }
}
