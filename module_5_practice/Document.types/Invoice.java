class Invoice implements Document {
    @Override
    public void open() {
        System.out.println("Opening an invoice document.");
    }
}