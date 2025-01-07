/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triathlon.com;


   
public class participant extends TriathlonResults {
    public participant(String name, String id, int swimmingTime, int cyclingTime, int runningTime) {
        super(name, id, swimmingTime, cyclingTime, runningTime);
    }

    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("ID: " + getId());
        System.out.println("Total Time: " + getTotalTime() + " minutes");
    }
}

