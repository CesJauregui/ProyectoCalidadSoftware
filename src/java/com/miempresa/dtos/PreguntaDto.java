/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.miempresa.dtos;

/**
 *
 * @author Lenovo1
 */
public class PreguntaDto {
    
    private int id;
    private String anio, bimestre, curso, dificultad, pregunta;

    public PreguntaDto(String anio, String bimestre, String curso, String dificultad, String pregunta) {
        this.anio = anio;
        this.bimestre = bimestre;
        this.curso = curso;
        this.dificultad = dificultad;
        this.pregunta = pregunta;
    }

    public PreguntaDto(int id, String anio, String bimestre, String curso, String dificultad, String pregunta) {
        this.id = id;
        this.anio = anio;
        this.bimestre = bimestre;
        this.curso = curso;
        this.dificultad = dificultad;
        this.pregunta = pregunta;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAnio() {
        return anio;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public String getBimestre() {
        return bimestre;
    }

    public void setBimestre(String bimestre) {
        this.bimestre = bimestre;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getDificultad() {
        return dificultad;
    }

    public void setDificultad(String dificultad) {
        this.dificultad = dificultad;
    }

    public String getPregunta() {
        return pregunta;
    }

    public void setPregunta(String pregunta) {
        this.pregunta = pregunta;
    }
    
    
    
    
}
