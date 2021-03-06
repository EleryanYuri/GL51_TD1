package gl51

import gl51.movie.data.Movie
import gl51.movie.data.MovieRequest
import gl51.movie.service.MovieClient
import gl51.movie.service.impl.MovieClientImpl
import io.micronaut.core.type.Argument
import io.micronaut.http.HttpRequest
import io.micronaut.http.client.annotation.Client
import io.micronaut.runtime.server.EmbeddedServer
import io.micronaut.test.annotation.MicronautTest
import io.micronaut.http.client.RxHttpClient
import io.micronaut.http.HttpResponse
import io.micronaut.http.HttpStatus
import io.micronaut.test.annotation.MockBean
import io.reactivex.Flowable
import spock.lang.AutoCleanup
import spock.lang.Specification
import spock.lang.Shared

import javax.inject.Inject

@MicronautTest
class MovieControllerSpec extends Specification {

    @Shared @Inject
    EmbeddedServer embeddedServer

    @Shared @AutoCleanup @Inject @Client("/")
    RxHttpClient client


    Flowable getFlowable (){
        Flowable flowable = client.retrieve(HttpRequest.GET("/movie"),
                Argument.listOf(Movie))
    }

    void "test index"() {
        given:
            def content = getFlowable().firstElement().blockingGet()

        expect:
            content == []
    }

    void "test movie creation"(){
        given:
            HttpResponse response = client.toBlocking().exchange(
                    HttpRequest.POST("/movie", new MovieRequest(imdbId: "aaaa"))
            )
            def content = getFlowable().firstElement().blockingGet()
        expect:
            response.status == HttpStatus.CREATED
            /*registry.listFavorites().size() == 1
            registry.listFavorites().find{it.title = "my movie"}*/
            content.find{it.title == 'my movie' && it.imdbId == "aaaa"}
    }

    @MockBean(MovieClientImpl)
    MovieClient movieClient() {
        def mock = Mock(MovieClient)
        mock.getMovieDetail("aaaa") >> new Movie(imdbId: "aaaa", title: "my movie")
        mock
    }

}