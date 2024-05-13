

import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    // User management
    @PostMapping("/users")
    public String createUser(@RequestBody User user) {
        // Create a new user
        return "User created successfully";
    }

    @GetMapping("/users/{id}")
    public User getUser(@PathVariable Long id) {
        // Retrieve a user by their ID
        return new User(id, "John Doe", "john.doe@example.com");
    }

    // Movie catalog
    @GetMapping("/movies")
    public List<Movie> getMovies() {
        // Retrieve all movies
        return Arrays.asList(new Movie(1L, "Movie 1", "Description 1"), new Movie(2L, "Movie 2", "Description 2"));
    }

    @GetMapping("/movies/{id}")
    public Movie getMovie(@PathVariable Long id) {
        // Retrieve a movie by its ID
        return new Movie(id, "Movie Title", "Movie Description");
    }

    // Ratings
    @PostMapping("/ratings")
    public String createRating(@RequestBody Rating rating) {
        // Create a new rating
        return "Rating created successfully";
    }

    // Recommendations
    @GetMapping("/recommendations")
    public List<Movie> getRecommendations() {
        // Retrieve movie recommendations
        return Arrays.asList(new Movie(1L, "Recommended Movie 1", "Description 1"),
                new Movie(2L, "Recommended Movie 2", "Description 2"));
    }
}