package sample.samplespring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import sample.samplespring.dto.ApiResult;
import sample.samplespring.dto.UserDto;
import sample.samplespring.service.UserService;

import java.util.ArrayList;
import java.util.List;

/**
 * 사용자 관리 컨트롤러 클래스
 * @author 백지연
 */
@RestController
@Slf4j
@RequestMapping("/api/auth/user")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /**
     * 사용자 목록 출력 메소드
     * @return http 상태 코드, 메세지, 사용자 목록
     */
    @GetMapping("users")
    public ApiResult allUsers() {
        List<UserDto> users = new ArrayList<UserDto>(); // = userService.allUserInfo()
        return new ApiResult(HttpStatus.OK.value(), "사용자 목록", users);
    }
}
