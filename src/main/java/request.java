public class request {
    public Integer number;
    public String name;
    public Integer numrandomizer()
    {
        int sum = 0;
        while (number != 0)
        {
            sum++;
            number /= 10;
        }
        int max= (int) Math.pow(10,sum);
        sum=(int)Math.pow(10,sum-1);
        return (int)((Math.random()*(max-sum)+sum));
    }
    public String getName()
    {
        return name;
    }
}