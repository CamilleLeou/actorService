package com.movieactors.actors.dao;
import com.movieactors.actors.model.Actor;
import java.util.List;

public interface ActorDao {

    public List<Actor> findAll();
    //public Actor findByMovieName(String movieName);
    public Actor findById(int id);
}
