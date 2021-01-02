package com.movieactors.actors.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Actor {

    @Id
    @GeneratedValue
    private int id;
    private String nom;
    private String movieName;

    public Actor() {
    }

    public Actor(int id, String nom, String movieName) {
        this.id=id;
        this.nom=nom;
        this.movieName=movieName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id=id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom=nom;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String nom) {
        this.movieName=movieName;
    }


    @Override
    public String toString(){
        return "Acteurs{"+
                "id=" + id +
                ", nom='"+ nom +
                ", movie=" + movieName +'\'' + '}';
    }

}
