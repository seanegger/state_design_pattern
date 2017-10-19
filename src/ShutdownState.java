public class ShutdownState implements State{

    public void doAction(Server server)
    {
        System.out.println("Starting up server.");
        server.setState(this);
    }
}
