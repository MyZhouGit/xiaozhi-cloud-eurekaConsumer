package xiaozhi.eureka.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ConsumerTestController {
@Autowired
private RestTemplate restTemplate;
@GetMapping("/getPrInfo")
    public String getPrInfo(){
    return restTemplate.getForObject("http://provider-user/getInfo",String.class);
}
}
