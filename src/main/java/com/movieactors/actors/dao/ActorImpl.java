package com.movieactors.actors.dao;
import com.movieactors.actors.model.Actor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ActorImpl implements ActorDao {

    public static List<Actor>actors=new ArrayList<>();
    static {
        actors.add(new Actor(1, new String("Camille Leou"), new String("Avatar")));
        actors.add(new Actor(2, new String("Jerome Coffin"), new String ("Titanic")));
        actors.add(new Actor(3, new String("Parès-Breton"), new String ("Hunger Games")));
    }

    @Override
    public List<Actor>findAll() {

        return actors;
    }

    @Override
    public Actor findById(int id){
        for (Actor actor : actors) {
            if(actor.getId() == id) {
                return actor;
            }
        }
        return null;
    }

   /* @Override
    public Actor findByMovieName(String movieName) {
        for (Actor actor : actors) {
            if (actor.getMovieName() != movieName) {
                continue;
            }
            return actor;
        }
        return null;
    }*/



}
