package ohm.softa.a03;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public abstract class State {
    protected static final Logger logger = LogManager.getLogger();

    private int t;

    private final int duration;

    // Maybe unused
    public State(int duration) {
        this.duration = duration;
    }

    public final State tick(Cat cat) {
        t++;
        cat.tick();
        logger.info("tick()");
        return this;
    }

    abstract State successor(Cat cat);

    public int getTime() {
        return t;
    }

    public int getDuration() {
        return duration;
    }
}
