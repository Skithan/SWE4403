

public interface  Command {

    public void backup();
    public void undo();
    public boolean execute();
}
