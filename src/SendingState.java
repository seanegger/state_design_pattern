public class SendingState implements State {

    @Override
    public void init(Server server)
    {
        System.out.println("Setting Server to sending state.");
        server.setState(this);
    }

    @Override
    public void doAction() {
        System.out.println("Receiving...");
    }
}
