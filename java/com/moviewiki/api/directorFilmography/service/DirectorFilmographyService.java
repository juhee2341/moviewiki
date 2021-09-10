package com.moviewiki.api.directorFilmography.service;

import com.moviewiki.api.director.domain.Director;
import com.moviewiki.api.directorFilmography.domain.DirectorFilmography;
import com.moviewiki.api.movie.domain.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface DirectorFilmographyService {

    public List<DirectorFilmography> findDirectorFilmographyByDirector(Director director);
    public List<DirectorFilmography> findDirectorFilmographyByMovie(Movie movie);

}
