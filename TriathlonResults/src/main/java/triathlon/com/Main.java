/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triathlon.com;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
  
        // Creating participants
        EliteParticipant alice = new EliteParticipant("Alice", "001", 25, 40, 20, "Nike");
        participant bob = new participant("Bob", "002", 20, 35, 25);
        participant charlie = new participant("Charlie", "003", 30, 50, 30);
        BeginnerParticipant diana = new BeginnerParticipant("Diana", "004", 28, 42, 18);

        // Adding participants to the list
        ArrayList<participant> participants = new ArrayList<>();
        participants.add(alice);
        participants.add(bob);
        participants.add(charlie);
        participants.add(diana);

        // Sort participants by total time
        Collections.sort(participants, Comparator.comparingInt(participant::getTotalTime));

        // Display results and handle ties
        System.out.println("Sorted Participants by Total Time:");
        for (int i = 0; i < participants.size(); i++) {
            participants.get(i).displayDetails();
            if (i < participants.size() - 1 && participants.get(i).getTotalTime() == participants.get(i + 1).getTotalTime()) {
                System.out.println(" (Tied with next participant)");
            }
            System.out.println();
        }

        // Print fastest and second fastest participants
        if (!participants.isEmpty()) {
            System.out.println("Fastest Participant:");
            participants.get(0).displayDetails();
            System.out.println();
        }

        if (participants.size() > 1) {
            if (participants.get(0).getTotalTime() == participants.get(1).getTotalTime()) {
                System.out.println("Second Fastest Participant (Tied with first):");
            } else {
                System.out.println("Second Fastest Participant:");
            }
            participants.get(1).displayDetails();
            System.out.println();
        }
    }
}

        
    


