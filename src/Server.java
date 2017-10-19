/*
		Author: Sean Egger, Alev Ruvlev
		Class: CSI-340-01
		Assignment: Presentation
		Date Assigned: October 4
		Due Date: November 30 11:59
		Description:
		Files for the State Design Pattern Presentation
		Certification of Authenticity:
		I certify that this is entirely my own work, except where I have given
		fully-documented references to the work of others. I understand the definition and
		consequences of plagiarism and acknowledge that the assessor of this assignment
		may, for the purpose of assessing this assignment:
		- Reproduce this assignment and provide a copy to another member of academic
		- staff; and/or Communicate a copy of this assignment to a plagiarism checking
		- service (which may then retain a copy of this assignment on its database for the
		- purpose of future plagiarism checking)
*/
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
