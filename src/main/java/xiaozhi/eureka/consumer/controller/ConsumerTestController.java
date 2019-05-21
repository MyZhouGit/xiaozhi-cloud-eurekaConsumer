package xiaozhi.eureka.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import xiaozhi.eureka.consumer.client.TestClient;

@RestController
public class ConsumerTestController {
@Autowired
private RestTemplate restTemplate;

    @Autowired
    private TestClient testClient;

    @GetMapping("/getPrInfo")
    public String getPrInfo(){
    return restTemplate.getForObject("http://provider-user/getInfo",String.class);
    }

    @GetMapping("/getFeign")
    public String getPrInfoByFeign() {
        return testClient.getPrInfo();
    }
}
