public class SetContrastCommand implements Command {

    private VideoEditor editor;   
    private Float backupContrast; 
    private Float contrast; 

    SetContrastCommand(VideoEditor editor, float contrast)
    {

        this.editor = editor;
        this.contrast = contrast;
    } 
    
    public void backup(){

        backupContrast = editor.getContrast();
    }

    public void undo(){

        editor.setContrast(backupContrast);
    }

    public boolean execute(){

        backup();
        editor.setContrast(contrast);
        return true;
    }
}
