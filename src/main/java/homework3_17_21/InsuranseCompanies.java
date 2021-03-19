package homework3_17_21;

public class InsuranseCompanies {
    private InsuranseCompany company;

    public InsuranseCompanies(InsuranseCompany company) {
        this.company = company;
    }

    public InsuranseCompany getCompany() {
        return company;
    }

    @Override
    public String toString() {
        return "Accepted Insuranses-"
                + company;
    }
}
