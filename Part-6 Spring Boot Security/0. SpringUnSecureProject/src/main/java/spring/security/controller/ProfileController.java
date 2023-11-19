package spring.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * @Created 14 / 04 / 2020 - 3:27 PM
 * @project SpringUnSecurityPlus
 * @Author Hamdamboy
 */

@Controller
@RequestMapping("profile")
public class ProfileController {

	static Logger logger = LoggerFactory.getLogger(ProfileController.class);
	
    @GetMapping("index")
    public String index(){
    	logger.info("INSIDE PROFILE");
        return "profile/index";
    }
}
