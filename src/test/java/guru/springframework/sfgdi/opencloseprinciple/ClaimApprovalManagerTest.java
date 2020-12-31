package guru.springframework.sfgdi.opencloseprinciple;

public class ClaimApprovalManagerTest {

    public static void main(String[] args) {

        ClaimApprovalManager claimApprovalManager = new ClaimApprovalManager();

        HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor();
        VehicleInsuranceSurveyor vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();

        claimApprovalManager.processClaim(healthInsuranceSurveyor);
        claimApprovalManager.processClaim(vehicleInsuranceSurveyor);
    }
}
