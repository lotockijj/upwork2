package secondJob;

/**
 * Created by Роман Лотоцький on 10.03.2017.
 */
public class ToDoItem{
    private int referenceNubmer;
    private String textDescription;
    private int priorityLevel;

    public ToDoItem(int referenceNubmer, String textDescription, int priorityLevel) {
        this.referenceNubmer = referenceNubmer;
        this.textDescription = textDescription;
        this.priorityLevel = priorityLevel;
    }

    public int getReferenceNubmer() {
        return referenceNubmer;
    }

    public void setReferenceNubmer(int referenceNubmer) {
        this.referenceNubmer = referenceNubmer;
    }

    public String getTextDescription() {
        return textDescription;
    }

    public void setTextDescription(String textDescription) {
        this.textDescription = textDescription;
    }

    public int getPriorityLevel() {
        return priorityLevel;
    }

    public void setPriorityLevel(int priorityLevel) {
        this.priorityLevel = priorityLevel;
    }

}
