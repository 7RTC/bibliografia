package com.sevenrtc.biblioteca;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa a seção de referências bibliográficas em um trabalho acadêmico.
 * <p>Veja o <a href="http://www.iac.sp.gov.br/PosIAC/pdf/pb1205905.pdf">link
 * </a> de exemplo.
 *
 * @author Anthony
 */
public class Bibliografia {

    private List<Trabalho> referencias;

    public Bibliografia() {
    }

    public Bibliografia(List<Trabalho> referencias) {
        this.referencias = referencias;
    }

    public List<Trabalho> getReferencias() {
        return referencias;
    }

    public void setReferencias(List<Trabalho> referencias) {
        this.referencias = referencias;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Referências bibiográficas\n");
        sb.append("----------------------------------------------\n");
        for (Trabalho ref : referencias) {
            sb.append(ref);
            sb.append("\n\n");
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        List<Trabalho> artigos = new ArrayList<Trabalho>();
        
        // TODO: Criar Livros, Dissertações, Congressos e Documentos da Internet
        // Preencher parâmetros e adicioná-los à lista.

        Bibliografia bibliografia = new Bibliografia(artigos);
        // Na hora que esse método estiver imprimindo corretamente para todos
        // os tipos de artigo o exercício estará pronto.
        System.out.println(bibliografia);
    }


}
