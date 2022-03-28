public class Dancer extends Performer
{
    //1
    int shoeSize;

    //2
    public Dancer(String name, int age, Agent agent, int shoeSize)
    {
        super(name, age, agent);
        this.shoeSize = shoeSize;
    }

    //3
    public void pirouette(int spins)
    {
        System.out.println("I am spinning " + spins + " times");
    }

    //4
    @Override
    public void rehearse()
    {
        this.pirouette(3);
        super.rehearse();
    }

    //5
    public void perform(boolean warmUp)
    {
       if (warmUp)
       {
            this.rehearse();
            super.perform();
       }
       else
       {
           super.perform();
       }
    }

    //6
    @Override
    public void callAgent()
    {
        super.callAgent();
        System.out.println("My shoes don’t fit!  Please pick me up a new pair.");
    }

    //7
    public void callAgent(int correctSize)
    {
        this.callAgent();
        System.out.println("I wear size " + correctSize + " by the way!");
    }

    //8
    public int getShoeSize()
    {
        return shoeSize;
    }

    //9
    @Override
    public String getName()
    {
        return super.getName() + " is a dancer!";
    }
}
