public class UndoCommand implements Command{

    private VideoEditor editor;   

    public UndoCommand(VideoEditor editor){

        this.editor = editor;         
    }

    public void undo(){}

    public void backup(){}

    public boolean execute(){

        editor.undo();
        return false;
    }

    
}
