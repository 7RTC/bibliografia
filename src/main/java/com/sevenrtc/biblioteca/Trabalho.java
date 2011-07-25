package com.sevenrtc.biblioteca;

import java.util.List;

/**
 * Representa um trabalho qualquer a ser citado.
 *
 * @author Anthony
 */
public abstract class Trabalho {

    private String titulo;
    private List<Autor> autores;

    public Trabalho() {
    }

    public Trabalho(String titulo, List<Autor> autores) {
        this.titulo = titulo;
        this.autores = autores;
    }

    public List<Autor> getAutores() {
        return autores;
    }

    public void setAutores(List<Autor> autores) {
        this.autores = autores;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    /**
     * Gera uma citação no formato ABNT para o trabalho.
     * <p>Cada tipo de artigo terá uma citação em formato diferente. Atente-se
     * para a quantidade de autores no artigo (regra do et al), formato do nome,
     * ordem dos parâmetros etc.</p>
     * Veja uma compilação das regras ABNT
     * <a href="http://www.leffa.pro.br/textos/abnt.htm">aqui</a><br/>
     *
     * @return Referencia para o artigo em formato ABNT.
     */
    public abstract String getReferencia();

    @Override
    public String toString() {
        return getReferencia();
    }

}
