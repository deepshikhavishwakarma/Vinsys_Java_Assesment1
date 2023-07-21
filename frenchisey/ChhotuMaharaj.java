package frenchisey;

abstract class ChhotuMaharaj {
    private String franchiseName;
    private String state;
    protected String status;

    public ChhotuMaharaj(String franchiseName, String state) {
        this.franchiseName = franchiseName;
        this.state = state;
        this.status = "off";
    }

    public void greetCustomers() {
        System.out.println("Welcome to " + franchiseName + " in " + state);
    }

    public abstract void franchisePermit();


     public static void main(String[] args) {
        ChhotuMaharaj bhopalFranchise = new Bhopal("ChhotuMaharaj Bhopal");
        bhopalFranchise.greetCustomers();
        bhopalFranchise.franchisePermit();
        System.out.println("Franchise Permit Status for Bhopal: " + bhopalFranchise.status);

        ChhotuMaharaj indoreFranchise = new Indore("ChhotuMaharaj Indore");
        indoreFranchise.greetCustomers();
        indoreFranchise.franchisePermit();
        System.out.println("Franchise Permit Status for Indore: " + indoreFranchise.status);
    }
}

class Bhopal extends ChhotuMaharaj {
    public Bhopal(String franchiseName) {
        super(franchiseName, "Madhya Pradesh");
    }

    @Override
    public void franchisePermit() {
        this.status = "on"; // Give permit for Bhopal
    }
}

class Indore extends ChhotuMaharaj {
    public Indore(String franchiseName) {
        super(franchiseName, "Madhya Pradesh");
    }

    @Override
    public void franchisePermit() {
        this.status = "off"; // Remove permit for Indore
    }

}