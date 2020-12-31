package guru.springframework.sfgdi.opencloseprinciple;

public class HealthInsuranceSurveyor extends InsuranceSurveyor{
    @Override
    public boolean isValidClaim() {
        System.out.println("HealthInsuranceSurveyor: Validating health insurance claim...");
        return true;
    }
}
