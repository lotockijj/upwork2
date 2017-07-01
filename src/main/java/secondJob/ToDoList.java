package secondJob;

import java.util.ArrayList;

/**
 * Created by Роман Лотоцький on 10.03.2017.
 */
public class ToDoList {
    public ArrayList<ToDoItem> list;

    public ToDoList() {
        list = new ArrayList<ToDoItem>();
    }

    public void addToDoItem(ToDoItem item){
        boolean result = true;
        for(int i = 0; i < list.size(); i++){
            if(list.get(i).getReferenceNubmer() == item.getReferenceNubmer()){
                System.out.println("Error! Reference number already exists. ");
                result = false;
            }
        }
        if(result) {
            list.add(item);
        }
    }

    public void deleteItem(ToDoItem item){
        list.remove(item);
    }

    public void sortListByPriority(){
        list.sort((ToDoItem item1, ToDoItem item2) -> item1.getPriorityLevel() -
        item2.getPriorityLevel());
        /*Collections.sort(list, new Comparator<ToDoItem>() {
            public int compare(ToDoItem item1, ToDoItem item2) {
                return item1.getPriorityLevel() - item2.getPriorityLevel();
            }
        });*/
    }

    public void sortListByReference(){
        list.sort((ToDoItem item1, ToDoItem item2) -> item1.getReferenceNubmer()-
        item2.getReferenceNubmer());
        /*Collections.sort(list, new Comparator<ToDoItem>(){
            public int compare(ToDoItem item1, ToDoItem item2){
                return item1.getReferenceNubmer() - item2.getReferenceNubmer();
            }
        });*/
    }
}
