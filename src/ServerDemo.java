public class ServerDemo {

    public static void main(String args[])
    {
        // Create the Server
        Server server = new Server();

        // Create the state
        StartupState start = new StartupState();
        ReceivingState receive = new ReceivingState();
        SendingState send = new SendingState();
        ShutdownState shutdown = new ShutdownState();

        //Use the States
        start.init(server);
        server.doServerStuff();
        receive.init(server);
        server.doServerStuff();
        send.init(server);
        server.doServerStuff();
        shutdown.init(server);
        server.doServerStuff();
    }

}
