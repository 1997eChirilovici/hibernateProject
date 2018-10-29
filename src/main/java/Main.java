import service.GenderService;
import service.HumanCastService;
import service.HumanService;

public class Main {
    public static void main(String[] args) {
        GenderService genderService = new GenderService();
        HumanService humanService = new HumanService();
        HumanCastService humanCastService = new HumanCastService();
        genderService.findAll().forEach(System.out::println);
        humanService.findAll().forEach(System.out::println);
        humanCastService.findAll().forEach(System.out::println);
//        humanCastService.findAll().forEach(sc -> System.out.println(sc.getGenderByIdGender().getTitleGender()+" "+sc.getHumanByIdHuman().getNameHuman()));

    }
}
