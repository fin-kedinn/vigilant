import java.util.ArrayList;
import java.util.Calendar;

/**
 * Created by Chloe on 20/08/2017.
 */
public class Tasks {
//    class for the tasks
//    task description variables
//    task title
    private String taskTitle;
//    task description
    private String taskDescription;
//    task due date
    private Calendar taskDueDate;
//    task set date (opt)
    private Calendar taskSetDate;
//    array list of sections, with an arraylist of subsections as content
    private ArrayList<String> taskSections;
//    subsections arraylist
    private ArrayList<String> taskSubsections;


//    default constructor
    public Tasks(){

    }

//    constructor to create new task
    public Tasks(String title, String content, Calendar date){
        title = this.taskTitle;
        content = this.taskDescription;
        date = this.taskDueDate;
    }

    public String getTaskTitle() {
        return taskTitle;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public Calendar getTaskDueDate() {
        return taskDueDate;
    }

    public Calendar getTaskSetDate() {
        return taskSetDate;
    }

    public ArrayList<String> getTaskSections() {
        return taskSections;
    }

    public ArrayList<String> getTaskSubsections() {
        return taskSubsections;
    }

}
