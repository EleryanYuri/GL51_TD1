package gl51.movie.service.impl

import gl51.movie.data.Movie
import gl51.movie.service.MovieRegistry

import javax.inject.Singleton

@Singleton
class MovieRegistryImpl implements MovieRegistry {
    @Override
    void addMovieToFavorites(String imdbID) {

    }

    @Override
    List<Movie> listFavorites() {
        return null
    }
}
