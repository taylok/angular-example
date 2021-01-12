package com.kmt.angularexample;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Slf4j
@Controller
@RequiredArgsConstructor
public class RootController {

    @RequestMapping({"/"})
    public String loadUI() {
        return "forward:/index.html";
    }

}
