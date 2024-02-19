package springMVCScheduled.conponents.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Service
@EnableScheduling
@Slf4j
public class UtilServices {
    private static volatile LocalDate currentDate;

    public UtilServices() {
        var s = "UtilServices created";
        log.info(s);
        System.out.println(s);
    }

    @Scheduled(cron = "*/20 * * * * *", zone = "Europe/Moscow")
    public synchronized void checkScheduleder() {
        System.out.println("running checkScheduleder");
        log.info("running checkScheduleder");

        try{
        log.info("UtilServices.currentDate is " +  UtilServices.currentDate.toString());}
        catch (NullPointerException e){
            var s = "UtilServices.currentDate is null";
            log.info(s);
            System.out.println(s);
        }

            if (UtilServices.currentDate != null &&
                    UtilServices.currentDate.equals(LocalDate.now())) {
                var s = "The business logic has already been completed. Exit.";
                log.info(s);
                System.out.println(s);
                return;
            } else {
                UtilServices.currentDate = LocalDate.now();
                var s = "UtilServices.checkScheduleder performs business logic in " + LocalDateTime.now();
                log.info(s);
                System.out.println(s);
            }
    }
    /*public void test(){
        var s = "test";
        log.info(s);
        System.out.println(s);
    }*/
}
