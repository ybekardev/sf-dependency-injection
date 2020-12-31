package guru.springframework.sfgdi.opencloseprinciple;

import org.junit.jupiter.api.Test;

public class ClaimApprovalManagerTest {

    @Test
    public void testProcessClaim() throws Exception {

        ClaimApprovalManager claimApprovalManager = new ClaimApprovalManager();

        HealthInsuranceSurveyor healthInsuranceSurveyor = new HealthInsuranceSurveyor();
        claimApprovalManager.processClaim(healthInsuranceSurveyor);

        VehicleInsuranceSurveyor vehicleInsuranceSurveyor = new VehicleInsuranceSurveyor();
        claimApprovalManager.processClaim(vehicleInsuranceSurveyor);

    }
}
