public class Editor{



    public void openProject(String path) {


        MainDecorator main = new MainDecorator(new NormalArtefact("Main"));  
        main.setIsMain(true);
       
        NormalArtefact demo = new NormalArtefact("Demo");

        ErrorDecorator emailClient = new ErrorDecorator(new NormalArtefact("EmailClient")); 
        emailClient.setHasError(true);

        NormalArtefact emailProvider = new NormalArtefact("EmailProvider");




        Artefact a1, a2, a3, a4; 

        a1 = main; 
        a2 = demo; 
        a3 = emailClient; 
        a4 = emailProvider;
        
        Artefact[] artefacts = {a1, a2, a3, a4};
        

        for (var artefact : artefacts)
            System.out.println(artefact.render());
    }
    
}
