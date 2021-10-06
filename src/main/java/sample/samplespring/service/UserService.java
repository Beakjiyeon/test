package sample.samplespring.service;

import org.springframework.stereotype.Service;
import sample.samplespring.dto.UserDto;
import sample.samplespring.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * 사용자 관리 컨트롤러 클래스
 *  @author 백지연
 */
@Service
public class UserService {

    private final UserRepository userRepository;

    /**
     * 생성자 메소드
     * @param userRepository 사용자 처리 리퍼지터리 인스턴스
     */
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    /**
     * 전체 사용자 목록 정보 메소드
     * @return 전체 사용자 목록
     */
    public List<UserDto> allUserInfo() {
        /*
        List<User> users = userRepository.findAll();
        List<UserDto> userDtos = users.stream()
                .map(user -> makeUserDto(user))
                .collect(Collectors.toList());
        return userDtos;
         */
        return new ArrayList<UserDto>();
    }

}
