package com.practice.springbootjdbc.domain.movie;

import com.practice.springbootjdbc.domain.actor.Actor;

import java.time.LocalDate;
import java.util.List;

public record Movie(
        Integer id,
        String name,
        List<Actor> actors,
        LocalDate releasedDate
) {
}
