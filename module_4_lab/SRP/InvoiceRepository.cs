public class InvoiceRepository
{
    public void SaveToDatabase(Invoice invoice)
    {
        // Логика сохранения счета в базу данных
        Console.WriteLine($"Счет с Id {invoice.Id} сохранен в базу данных.");
    }
}