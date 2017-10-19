public class ReceivingState implements State {


    public void doAction(Server server)
    {
        System.out.println("Setting Server to receiving state.");
        server.setState(this);
    }
}
