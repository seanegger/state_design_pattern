public class ShutdownState implements State{

    @Override
    public void init(Server server)
    {
        System.out.println("Starting up server.");
        server.setState(this);
    }

    @Override
    public void doAction() {
        System.out.println("Shutting Down...");
    }
}
