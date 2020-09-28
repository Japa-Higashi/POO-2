/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exercicio.pkg1;

/**
 *
 * @author luizh
 */
public class Livro {
    String nome, autor, biblioteca;
    int capitulos;

    Livro(String nome, String autor, String biblioteca, int capitulos) {
        this.nome = nome;
        this.autor = autor;
        this.biblioteca = biblioteca;
        this.capitulos = capitulos;
    }
   

   

    void info(){
        System.out.println("Nome do livro: " + this.getNome());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Biblioteca: " + this.getBiblioteca());
        System.out.println("Capitulos: " + this.getCapitulos());
    }
    
    public String getNome() {
        return this.nome;
    }

   

    public String getAutor() {
        return this.autor;
    }

    public String getBiblioteca() {
        return this.biblioteca;
    }

    public int getCapitulos() {
        return this.capitulos;
    }

    

   
}
