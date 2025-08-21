package Day25;

public class main3 {
    public static void main(String[] args) {
        System.out.println("Command Pattern - Behavioural DP");
        Task task = new Task();
        Mom remote = new Mom();

        Command onCommand = new DoTask1(task);
        Command offCommand = new DontDoTask(task);

        remote.setCommand(onCommand);
        remote.executeCommand();

        remote.setCommand(offCommand);
        remote.executeCommand();

    }
}