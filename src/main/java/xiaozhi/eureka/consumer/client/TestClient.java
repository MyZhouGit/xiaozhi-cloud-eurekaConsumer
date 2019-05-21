package xiaozhi.eureka.consumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("provider-user")
public interface TestClient {
    @RequestMapping(value = "/getInfo", method = RequestMethod.GET)
    String getPrInfo();
}
