public class Server {

    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void doServerStuff()
    {
        state.doAction();
    }

}
