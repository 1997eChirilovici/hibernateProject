import model.Gender;
import service.GenderService;

public class Main {
    public static void main(String[] args) {
        GenderService genderService = new GenderService();
        genderService.deleteAll();
        genderService.persist(new Gender("male"));
        genderService.persist(new Gender("female"));
        genderService.findAll().forEach(System.out::println);
    }
}
