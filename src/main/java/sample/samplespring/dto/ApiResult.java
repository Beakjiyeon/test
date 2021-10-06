package sample.samplespring.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

/**
 * API 응답 속성을 포함하는 클래스
 * @author 백지연
 */
@Data //@Getter, @Setter, @ToString, @EqualsAndHashCode, @RequiredConstructor
@Builder
@AllArgsConstructor
public class ApiResult {

    private Integer status;

    private String message;

    private Object data;

}
