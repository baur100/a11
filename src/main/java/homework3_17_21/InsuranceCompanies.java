package homework3_17_21;

public class InsuranceCompanies {
    private InsuranceCompany company;

    public InsuranceCompanies(InsuranceCompany company) {
        this.company = company;
    }

    public InsuranceCompany getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Accepted Insuranses-"
                + company;
    }
}
