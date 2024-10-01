package chapter1.java;

public class nestedifelse3 {
    public static void main(String[] args) {
        String lightColor = "Green"; // Traffic light color
        boolean isPedestrianWaiting = true; // Is a pedestrian waiting?

        if ("Green".equals(lightColor)) {
            if (isPedestrianWaiting) {
                System.out.println("Slow down");
            } else {
                System.out.println("Drive");
            }
        } else if ("Yellow".equals(lightColor)) {
            System.out.println("Prepare to stop");
        } else if ("Red".equals(lightColor)) {
            System.out.println("Stop");
        }
    }
}





