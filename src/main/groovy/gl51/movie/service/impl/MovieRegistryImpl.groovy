package gl51.movie.service.impl

import gl51.movie.data.Movie
import gl51.movie.service.MovieRegistry

import javax.inject.Singleton

@Singleton
class MovieRegistryImpl implements MovieRegistry {

    private List<Movie> internalRegistry = []

    @Override
    void addMovieToFavorites(String imdbID) {
        // << = .add
        internalRegistry << new Movie(imdbId: imdbID)
    }

    @Override
    List<Movie> listFavorites() {
        // Return is optional
        internalRegistry
    }
}
