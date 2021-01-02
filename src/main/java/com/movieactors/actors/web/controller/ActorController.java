package com.movieactors.actors.web.controller;
import com.movieactors.actors.dao.ActorDao;
import com.movieactors.actors.model.Actor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
public class ActorController {

    @Autowired
    private ActorDao actorDao;

    @RequestMapping(value="/Actors", method= RequestMethod.GET)
    public List<Actor> listActors() {

        return actorDao.findAll();
    }

    @GetMapping(value="/Actors/{id}")
    public Actor afficherUnActeurID(@PathVariable int id) {
        return actorDao.findById(id);
    }

   /* @GetMapping(value="/Actors/{movieName}")
    public Actor afficherUnActeurFilm(@PathVariable String movieName) {

        return actorDao.findByMovieName(movieName);
    }*/

    @RequestMapping(value = "/recommended")
    public String readingList(){
        return "Spring in Action (Manning), Cloud Native Java (O'Reilly), Learning Spring Boot (Packt)";
    }




}
