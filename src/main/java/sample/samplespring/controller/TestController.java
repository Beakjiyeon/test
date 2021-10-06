package sample.samplespring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 서버 연결 테스트 클래스
 * @author 백지연
 */
@RestController
@Slf4j
@RequestMapping("/api/auth/test")
public class TestController {

    @GetMapping("/server/hello")
    public String connectTest(){
        return "Hello, I am Auth Server.";
    }

}
