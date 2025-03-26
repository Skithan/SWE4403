public class NormalArtefact implements Artefact{
    
    private String name;

    public NormalArtefact(String name)
    {
        this.name = name; 
    }

    public String render()
    {

        return String.format("%s", name); 

    }
}
