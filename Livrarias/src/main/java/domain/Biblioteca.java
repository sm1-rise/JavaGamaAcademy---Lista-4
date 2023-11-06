package domain;

import java.util.ArrayList;

public class Biblioteca {
    ArrayList<Livro> listaLivros = new ArrayList<>();

    Livro livro;

    public Biblioteca (){}

    public Biblioteca(Livro livro) {
        this.livro = livro;
    }

    public ArrayList<Livro> getListaLivros() {
        return listaLivros;
    }

    public void setListaLivros(ArrayList<Livro> listaLivros) {
        this.listaLivros = listaLivros;
    }

    public void adicionarLivro (Livro livro){
        listaLivros.add(livro);
    }

    public ArrayList<Livro> listarLivros(){
        return listaLivros;
    }


}
