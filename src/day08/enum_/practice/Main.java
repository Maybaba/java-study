package day08.enum_.practice;

import static day08.enum_.practice.TeamRole.*;

public class Main {
    public static void main(String[] args) {
        TeamMember alice = new TeamMember("Alice", DEVELOPER);
        TeamMember bob = new TeamMember("Bob", DESIGNER);
        TeamMember charlie = new TeamMember("Charlie", LEADER);
        TeamMember david = new TeamMember("David", TESTER);

        alice.assignTask(); // Alice is assigned to Develops the software.
        bob.assignTask();   // Bob is assigned Designs the user interface.
        charlie.assignTask(); // Charlie is assigned Manages the team and coordinates.
        david.assignTask();  // David is assigned Tests the software for bugs.
    }

}
