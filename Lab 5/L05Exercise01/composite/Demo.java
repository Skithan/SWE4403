public class Demo {
  public static void show() {
    
    var subTeam1 = new Team();
    subTeam1.add(new Truck());
    subTeam1.add(new HumanResource());
    subTeam1.add(new HumanResource());

    var subTeam2 = new Team();
    subTeam2.add(new Truck());
    subTeam2.add(new HumanResource());
    subTeam2.add(new HumanResource());

    var team = new Team();
    team.add(subTeam1);
    team.add(subTeam2);
    
    System.out.println("\nCurrent Full Team");

    team.deploy();

    System.out.println("\nAdding a subTeam3 with 1 Truck and 1 Human Resource");

    var subTeam3 = new Team();
    subTeam3.add(new Truck());
    subTeam3.add(new HumanResource());

    team.add(subTeam3);

    team.deploy();

    System.out.println("\nRemoving subTeam3");
    team.remove(subTeam3);

    team.deploy();
  }

  public static void main(String[] args) {
    
      show();    
  }
  
}
