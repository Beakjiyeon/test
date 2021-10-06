package sample.samplespring.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
/*
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
*/
@Slf4j
@RestController
@RequestMapping(value = "/user", method = RequestMethod.POST)
public class UsersController {

    /*
    * 사용자 목록 조회
     */
    @GetMapping("/list_user")
    public ResponseEntity listUser(){
        /*
         Map<String, String> filters = new LinkedHashMap<>();
         

        if (search1.isPresent()) filters.put(search1.get(), value1.orElse(""));
        if (search2.isPresent()) filters.put(search2.get(), value2.orElse(""));

        Map<String, Integer> pageInfo = new HashMap<>();

         pageInfo.put("pageNo", pageNo.orElse(1));
         pageInfo.put("pageSize", pageSize.orElse(1000));

        log.debug("### list user filters : " + filters);

        ResultMessage resultMessage = manageService.listUser(filters, pageInfo);

         */
        return ResponseEntity.status(HttpStatus.OK).body(1);
    }
}
