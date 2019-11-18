package lt.sikutis.pm5be.controller;

import lt.sikutis.pm5be.model.SensorPollutionData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class SensorPollutionDataController {

    @Autowired
    private final RestTemplate restTemplate;

    public SensorPollutionDataController(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    @GetMapping("/pollution")
    public ResponseEntity<Object> getData() {

        //this.restTemplate
        String url = "https://airbox.edimaxcloud.com/devices_all?token=bbd61c7d-f2d7-4899-bd08-00a75e01abff&id=74DA38E69CBC&fbclid=IwAR1q3ejN3-dEzjFCsbnV9B8k2it2QPTdITYNiIOtysZ-nwI8Ccw54gqtnhc";

        String response = "test";
        SensorPollutionData pd = new SensorPollutionData(response);

        return new ResponseEntity<>(pd, HttpStatus.OK);
    }
}
