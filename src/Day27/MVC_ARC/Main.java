package Day27.MVC_ARC;

public class Main {
    public static void main(String[] args) {
        Student model = new Student("Rishabh", 17);

        StudentView view = new StudentView();

        StudentController controller = new StudentController(model, view);

        controller.updateView();

        controller.setStudentName("RM");

        controller.updateView();
    }
}