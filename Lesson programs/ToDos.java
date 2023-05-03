import java.util.ArrayList;

public class ToDos {

    public static void main(String[] args) {
        ArrayList<String> toDoList = new ArrayList<String>();
        ArrayList<String> sherlocksToDos = new ArrayList<String>();
        ArrayList<String> poirotsToDos = new ArrayList<String>();
        String toDo1 = "Water plants";
        String toDo2 = "Cleaning";
        String toDo3 = "Cooking";
        toDoList.add(toDo1);
        toDoList.add(toDo2);
        toDoList.add(toDo3);
        // Sherlock Section
        sherlocksToDos.add("visit the crime scene");
        sherlocksToDos.add("play violin");
        sherlocksToDos.add("interview suspects");
        sherlocksToDos.add("solve the case");
        sherlocksToDos.add("apprehend the criminal");
        System.out.println(sherlocksToDos.size());
        sherlocksToDos.set(1, "listen to Dr.Watson for amusement");
                // Poirots Section
        poirotsToDos.add("visit the crime scene");
        poirotsToDos.add("interview suspects");
        poirotsToDos.add("let the little grey cells do their work");
        poirotsToDos.add("trim mustache");
        poirotsToDos.add("call all suspects together");
        poirotsToDos.add("reveal the truth of the crime");
        System.out.println(poirotsToDos.size());

        System.out.println("Hercule Poirot");
        System.out.println(sherlocksToDos.get(2));
        System.out.println(poirotsToDos.get(2));









        System.out.println(toDoList);

    }

}
