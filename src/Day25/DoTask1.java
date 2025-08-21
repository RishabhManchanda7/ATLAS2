package Day25;

public class DoTask1 {
    public class DoTask1 implements Command{
        private Task task;

        public DoTask1(Task task) {
            this.task = task;
        }


        public void doIt() {
            this.task.doo();
        }
    }
}
