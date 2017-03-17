package com.optus;



import org.apache.jasper.tagplugins.jstl.core.Set;
import org.springframework.web.portlet.ModelAndView;
import org.springframework.web.portlet.mvc.AbstractController;

import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;


public class MovieController extends AbstractController{

    private MovieService movieService;

    public void setMovieService(MovieService movieService) {
        this.movieService = movieService;
    }

    @Override
    public ModelAndView handleRenderRequestInternal(RenderRequest request, RenderResponse response){

        Set movies = (Set) movieService.getAllMoviesForThisWeek();
        ModelAndView mv = new ModelAndView("moviesView", "movies", movies);
        return mv;
    }
}