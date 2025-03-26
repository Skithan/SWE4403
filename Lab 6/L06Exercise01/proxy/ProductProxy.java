

public class ProductProxy extends Product {
    private DbContext context;
 

    public ProductProxy(int id, DbContext context) {
    // put your code here.
    super(id);        
    this.context = context;   
       
    }


    @Override
    public void setName(String name) {
    // put your code here.
        super.setName(name); 
        context.markAsChanged(this);

    }
   }