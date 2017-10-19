public class ReceivingState implements State {

    @Override
    public void init(Server server)
    {
        System.out.println("Setting Server to receiving state.");
        server.setState(this);
    }

    @Override
    public void doAction() {
        System.out.println("Sending...");
    }
}
