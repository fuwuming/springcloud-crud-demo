import com.netflix.servo.util.VisibleForTesting;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class test {
    public static void main(String[] args) {
        log.info("hello");

        new Thread(()->{
            log.info("hello world");
            System.out.println("hello world");
        }).start();



    }
}
