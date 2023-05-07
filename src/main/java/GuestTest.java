import hostel.app.model.Guest;
import hostel.app.model.Information;
public class GuestTest {
    public static void main(String[] args) {
        Guest florentino = new Guest();
        Information information = new Information();
        florentino.setZipCode("37130223");
        florentino.setAdress("Rua Piu XII ");
        florentino.setCountry("Brasil");
        florentino.setName("Paulo");
        florentino.setLastName("César Moraes");
        florentino.setCity("Alfenas - MG");
        florentino.setNumberAdress("1152");
        florentino.setContact("31984283441");

        System.out.println();
        System.out.println("Bem vindo Hospede: "+ florentino.getName()+ " "+ florentino.getLastName());
        System.out.println();
        System.out.println("Endereço do hospede: "+florentino.getCountry() +", "+ florentino.getZipCode()+ ", "+florentino.getCity()+",  "+florentino.getNumberAdress()+" " + florentino.getContact());
        /*boolean resultado = florentino.setName("Florentino");
        if (resultado) {
            System.out.println("Hóspede cadastrado com sucesso");
            System.out.println("Name...: " + florentino.getName());
            System.out.println("Surname...: " + florentino.getLastName());
        }
        else
            System.out.println("O nome deve ter mais que 2 caracteres");

         */

    }
}
