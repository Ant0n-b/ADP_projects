public class ExtLogSerB {
    public void sendPackage(String packageInfo) {
        System.out.println("Sending package: " + packageInfo + " via External Logistics Service B.");
    }

    public String checkPackageStatus(String trackingCode) {
        return "Package status for " + trackingCode + " from External Logistics Service B.";
    }
}
