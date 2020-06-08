import io.vertx.core.Launcher;

public class Test {

    public static void main(final String[] args) {
        Launcher.executeCommand("run", SimpleServerVerticle.class.getName());
    }
}
