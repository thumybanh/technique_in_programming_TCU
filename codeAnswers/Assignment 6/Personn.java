public abstract class Personn<ID> implements Identifiable<ID>{
    protected ID id;
    protected String name;

    public Personn(ID id, String name){
        this.id = id;
        this.name = name;
    }
    @Override
    public ID getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public abstract void displayInfo();

}
