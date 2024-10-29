import br.com.dio.challenge.domain.BootCamp;

import br.com.dio.challenge.domain.Course;
import br.com.dio.challenge.domain.Dev;
import br.com.dio.challenge.domain.Mentoring;

public class App {
    public static void main(String[] args) throws Exception {
       BootCamp bootCamp =  new BootCamp();
       bootCamp.setName("bootcamp java developer");
       bootCamp.setDiscipition("discrição bootcamp java developer");

       bootCamp.getContents().add(new Course());
       bootCamp.getContents().add(new Mentoring());
       bootCamp.getContents().add(new Course());

       Dev devfabio = new Dev();
       devfabio.setName("camila");
       devfabio.submitBootCamp(bootCamp);
       System.out.println("conteudo instrito:"+ devfabio.getSubscribedContent());;
    }
}
