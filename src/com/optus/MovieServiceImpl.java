package com.optus;

import java.util.LinkedHashSet;
import java.util.Set;


	public class MovieServiceImpl implements MovieService{

	    private static Set allMovies = new LinkedHashSet();

	    public Set getAllMoviesForThisWeek() {

	        if (allMovies.size() == 0){
	            initMovies();
	        }
	        return allMovies;
	    }

	    private static void initMovies(){
	        allMovies.add(new Movie("DDLJ", "Dilwale"));
	        allMovies.add(new Movie("GR", "Gravity"));
	        allMovies.add(new Movie("INTR", "Interstellar"));
	    }

}
