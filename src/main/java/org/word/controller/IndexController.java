package org.word.controller;


import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author xiuyin.cui
 * @Description
 * @date 2019/3/22 10:52
 */
@Controller
public class IndexController {


    @RequestMapping("/")
    public String index(HttpServletRequest request) {
        return "index";
    }
//
//    @ApiOperation("hello")
//    @PostMapping("hello")
//    public BaseResult<HelloReq1> hello(@RequestToken Token token,
//                                       @RequestParam String param1,
//                                       @RequestParam String param2,
//                                       @RequestBody List<HelloReq1> req){
//        return null;
//    }
//    @Data
//    private class HelloReq1 {
//        private String id1;
//        private String name1;
//        private List<HelloReq2> children;
//    }
//    @Data
//    private class HelloReq2 {
//        private String id2;
//        private String name2;
//        private List<HelloReq1> children;
//    }
}
