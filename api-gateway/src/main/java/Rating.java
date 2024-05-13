public class Rating {
    private Long id;
    private Long userId;
    private Long movieId;
    private int score;

    public Rating(Long id, Long userId, Long movieId, int score) {
        this.id = id;
        this.userId = userId;
        this.movieId = movieId;
        this.score = score;
    }

    // getters and setters...

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }
}