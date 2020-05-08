package performancetst.performancetst;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.time.LocalDateTime;

@RestController
public class Controller {

    @GetMapping("/performancetest")
    public ResponseEntity<String> getResponse() {
	final LocalDateTime now = LocalDateTime.now();
        final  long contor = 4999999999L;
        long sum = 0;
        for (long i = 0; i < contor; i++){
            sum+= 1;
        }
        final LocalDateTime finish = LocalDateTime.now();

        System.out.println(sum);
        System.out.println(finish.minusSeconds(now.getSecond()).getSecond());
	return ResponseEntity.ok("Hello world ! This is Tudor's performance test. The application is up and running after " + finish.minusSeconds(now.getSecond()).getSecond() + " seconds since the request for URL was called. Now let's see the graphics for the performance tests.");
    }
	

}
