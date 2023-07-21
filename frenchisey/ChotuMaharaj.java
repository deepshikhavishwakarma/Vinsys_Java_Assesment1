package frenchisey;

abstract class ChotuMaharaj {
    
    private static String state;
    protected String status;

    public ChotuMaharaj(String state) {
       this.state = state;
        this.status = "off";
    }

    public void greetCustomers() {
        System.out.println("Welcome to " + state);
    }

    public abstract void franchisePermit();


     public static void main(String[] args) {
        ChotuMaharaj bhopalFranchise = new Bhopal(state);
        bhopalFranchise.greetCustomers();
        bhopalFranchise.franchisePermit();
        System.out.println("Franchise Permit Status for Bhopal: " + bhopalFranchise.status);

        ChotuMaharaj indoreFranchise = new Indore();
        indoreFranchise.greetCustomers();
        indoreFranchise.franchisePermit();
        System.out.println("Franchise Permit Status for Indore: " + indoreFranchise.status);
    }
}

class Bhopal extends ChotuMaharaj {
   

    public Bhopal(String state) {
        super(state);
        
    }

    @Override
    public void franchisePermit() {
        this.status = "on"; // Give permit for Bhopal
    }
}

class Indore extends ChotuMaharaj {
    public Indore() {
        super( "Madhya Pradesh");
    }

    @Override
    public void franchisePermit() {
        this.status = "off"; // Remove permit for Indore
    }

}