package com.example.demo_gradle.echo;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/echo/*")
public class EchoController {

    @ResponseBody
    @RequestMapping(value="/{str}", method = RequestMethod.GET)
    public String echo(@PathVariable("str") String str) { return str; }


}
