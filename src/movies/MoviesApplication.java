package movies;

import util.Input;

import java.util.Scanner;

public class MoviesApplication {

    private Movie[] movies;
    private Input input;

    /**
     * Constructor
     */
    public MoviesApplication(Movie[] movies, Input input) {
        this.movies = movies;
        this.input = input;
    }

    /**
     * Returns a string of the menu for later display
     */
    private String getMenu() {
        return "What would you like to do?\n" +
                "\n" +
                "0 - exit\n" +
                "1 - view all movies\n" +
                "2 - view movies in the animated category\n" +
                "3 - view movies in the drama category\n" +
                "4 - view movies in the horror category\n" +
                "5 - view movies in the scifi category\n";
    }


    /**
     * Formats a movie object as a string for display
     */
    private String getMovieDisplay(Movie movie) {
        return movie.getCategory() + " --- " + movie.getName() + "\n";
    }

    /**
     * Returns a string of all movies formatted for display
     */
    private String getAllMovies() {
        String output = "\n";
        for (Movie movie : movies) {
            output += getMovieDisplay(movie);
        }
        return output;
    }

    /**
     * Returns a string of all movies formatted for display
     */
    private String viewMoviesByCat(String category) {
        String output = "\n";
        for (Movie movie : movies) {
            if (movie.getCategory().equalsIgnoreCase(category)) {
                output += getMovieDisplay(movie);
            }
        }
        return output;
    }

    /**
     * Outputs a string according to the user input
     */
    private int processChoice(int userChoice) {
        String output;
        switch (userChoice) {
            case 1:
                output = getAllMovies();
                break;
            case 2:
                output = viewMoviesByCat("animated");
                break;
            case 3:
                output = viewMoviesByCat("drama");
                break;
            case 4:
                output = viewMoviesByCat("horror");
                break;
            case 5:
                output = viewMoviesByCat("scifi");
                break;
            default:
                return 0;
        }
        System.out.println(output);
        return 1;
    }

    /**
     * Starts the application
     */
    public void start() {
        System.out.println("Welcome to Movie App!");
        boolean willContinue = true;
        do {
            System.out.println(getMenu());
            if (processChoice(input.getInt(0, 5)) == 0) {
                willContinue = false;
            }
        } while (willContinue);
        System.out.println("Goodbye!");
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Input input = new Input(scn);
        MoviesApplication ma = new MoviesApplication(MoviesArray.findAll(), input);
        ma.start();
    }

}