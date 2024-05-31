package br.com.dio.desafio.dominio;

public abstract class Faculdade{
    private String nomeFaculdade;
    private int semestres;
    private int semestreAtual;

    public Faculdade(String nomeFaculdade, int semestres, int semestreAtual) {
        this.nomeFaculdade = nomeFaculdade;
        this.semestres = semestres;
        this.semestreAtual = semestreAtual;
    }

    public abstract void semestresFormar();
    
    public int getSemestreAtual() {
        return semestreAtual;
    }

    public void setSemestreAtual(int semestreAtual) {
        this.semestreAtual = semestreAtual;
    }


    public String getnomeFaculdade() {
        return nomeFaculdade;
    }

    public void setnomeFaculdade(String nomeFaculdade) {
        this.nomeFaculdade = nomeFaculdade;
    }

    public int getSemestres() {
        return semestres;
    }

    public void setSemestres(int semestres) {
        this.semestres = semestres;
    }

 }
