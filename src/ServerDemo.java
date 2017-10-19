public class ServerDemo {

    // Create the Server
    Server server = new Server();

    // Create the state
    StartupState startupState = new StartupState();
    ReceivingState receivingState = new ReceivingState();
    SendingState sendingState = new SendingState();
    ShutdownState shutdownState = new ShutdownState();

    //Use the States
    startUpState.doAction()
}
