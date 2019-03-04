package Race;
// The Observers update method is called when the Subject changes

public interface Observer {

    public void update(int bibNumber, String dateAndTime, String firstName, String lastName, String gender, int age);

    public void updateCourse(int bibNumber, String dateAndTime, double distanceTraveled);
    
}
