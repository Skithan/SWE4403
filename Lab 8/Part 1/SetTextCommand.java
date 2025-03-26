public class SetTextCommand implements Command {
    

    private VideoEditor editor;   
    private String backupText;
    private String text; 

    SetTextCommand(VideoEditor editor, String text)
    {

        this.editor = editor;
        this.text= text;
    }     


    public void backup(){

        backupText = editor.getText();
    }


    public void undo(){

        editor.setText(backupText);
    }

    public boolean execute(){

        backup();
        editor.setText(text);
        return true;
    }

}
