public class Vehicle
{
    public void Start()
    {
        Console.WriteLine($"{this.GetType().Name} is starting");
    }

    public void Stop()
    {
        Console.WriteLine($"{this.GetType().Name} is stopping");
    }
}