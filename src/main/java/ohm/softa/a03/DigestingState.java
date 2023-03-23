package ohm.softa.a03;

public class DigestingState extends State {
    private final int awake;

    public DigestingState(int duration, int awake) {
        super(duration);
        this.awake = awake;
    }

    @Override
    State successor(Cat cat) {
        logger.info("Getting in a playful mood!");

        return new PlayfulState(this.awake - cat.getDigest());
    }
}
