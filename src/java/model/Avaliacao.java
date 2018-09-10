/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author alunoces
 */
public class Avaliacao {
 private String titulo;
 private String usuario;
 private String avalicao;
 private int nota;

    public Avaliacao() {
    }

    public Avaliacao(String titulo, String usuario, String avalicao, int nota) {
        this.titulo = titulo;
        this.usuario = usuario;
        this.avalicao = avalicao;
        this.nota = nota;
    }
   
    

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getAvalicao() {
        return avalicao;
    }

    public void setAvaliacao(String avaliacao) {
        this.avalicao = avaliacao;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
 
 
 
    

    
    
}