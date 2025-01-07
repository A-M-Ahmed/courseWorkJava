/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package triathlon.com;


public class TriathlonResults {
    
  //  the private attributes 
    private String name;
    private String id;
    private int swimmingTime;
    private int cyclingTime;
    private int runningTime;

    // Constructor
    public TriathlonResults(String name, String id, int swimmingTime, int cyclingTime, int runningTime) {
        this.name = name;
        this.id = id;
        setSwimmingTime(swimmingTime);
        setCyclingTime(cyclingTime);
        setRunningTime(runningTime);
    }

    // the getters and the setters.
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getSwimmingTime() {
        return swimmingTime;
    }

    public void setSwimmingTime(int swimmingTime) {
        if (swimmingTime < 0) {
            throw new IllegalArgumentException("Error Swimming time should not be a negative digit.");
        }
        this.swimmingTime = swimmingTime;
    }

    public int getCyclingTime() {
        return cyclingTime;
    }

    public void setCyclingTime(int cyclingTime) {
        if (cyclingTime < 0) {
            throw new IllegalArgumentException("Error Cycling Time should not be a negative digit.");
        }
        this.cyclingTime = cyclingTime;
    }

    public int getRunningTime() {
        return runningTime;
    }

    public void setRunningTime(int runningTime) {
        if (runningTime < 0) {
            throw new IllegalArgumentException("Error Running time should not be a negative digit.");
        }
        this.runningTime = runningTime;
    }

    public int getTotalTime() {
        return swimmingTime + cyclingTime + runningTime;
    }
}

   


