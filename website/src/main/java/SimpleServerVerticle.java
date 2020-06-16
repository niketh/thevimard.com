import io.vertx.core.AbstractVerticle;
import io.vertx.core.Future;
import io.vertx.core.Vertx;

public class SimpleServerVerticle extends AbstractVerticle {
    public static void main(String[] args) {
        Vertx vertx = Vertx.vertx();
        vertx.deployVerticle(new SimpleServerVerticle());
    }

    @Override
    public void start(Future<Void> future) {
        vertx.createHttpServer()
                .requestHandler(
                        r -> r.response().end("Welcome to TheVimard.com"))
                .listen(config().getInteger("http.port", 8080), result -> {
                    if (result.succeeded()) {
                        future.complete();
                    } else {
                        future.fail(result.cause());
                    }
                });
    }

}