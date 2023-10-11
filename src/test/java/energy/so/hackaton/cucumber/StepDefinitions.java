package energy.so.hackaton.cucumber;

import energy.so.hackaton.datasampler.model.Account;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;

import java.io.IOException;

public class StepDefinitions {

    private Account account;
    private static final String GET_ACCOUNT_PATH = "https://portal-api-gateway.staging.soenergy.co/accounts/account_finder";
    private static final String APPLICATION_JSON = "application/json";
    private final CloseableHttpClient httpClient = HttpClients.createDefault();


    @Given("get active account")
    public void givenGetActiveAccount() {
    }

    @Given("get active product")
    public void givenGetActiveProduct() {
    }

    @Given("credit on the account")
    public void givenCreditOnTheAccount() throws IOException {

    }

    @Given("create DD payment")
    public void givenCreateDDPayment() throws IOException {

    }

    @Given("supply Start date is in the past")
    public void givenSupplyStartDateIsInThePast() {

    }

    @Given("GSP Group _A")
    public void givenGSPGroup_A() {

    }

    @Given("Product Type Electricity MPAN")
    public void givenProductTypeElectricityMPAN() {

    }

    @Then("entities should be returned")
    public void thenAccountShouldBeReturned() {

    }

}