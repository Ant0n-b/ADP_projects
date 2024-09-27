public class InvoiceCalculator
{
    public double CalculateTotal(Invoice invoice)
    {
        double subTotal = 0;
        foreach (var item in invoice.Items)
        {
            subTotal += item.Price;
        }
        return subTotal + (subTotal * invoice.TaxRate);
    }
}