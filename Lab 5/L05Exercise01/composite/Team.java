import java.util.ArrayList;
import java.util.List;

public class Team implements Resource{
  private List<Resource> resources = new ArrayList<>();

  public void add(Resource resource) {
    resources.add(resource);
  }

  public void remove(Resource resource) {
    resources.remove(resource);
  }

  public void deploy() {
    
    System.out.println("Deploying a team");

    for (var resource : resources) {
     resource.deploy();
    }
  }
}
