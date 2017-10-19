public class SendingState implements State {

    public void doAction(Server server)
    {
        System.out.println("Setting Server to sending state.");
        server.setState(this);
    }
}
