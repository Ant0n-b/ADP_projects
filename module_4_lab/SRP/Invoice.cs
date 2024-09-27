public class Invoice
{
    public int Id { get; set; }
    public List<Item> Items { get; set; }
    public double TaxRate { get; set; }

    public Invoice()
    {
        Items = new List<Item>();
    }
}