package com.bruce.puerile.login.ctrller;

import com.bruce.base.framework.FrameLogger;
import com.bruce.puerile.common.model.SessionModel;
import com.bruce.puerile.login.model.LoginModel;
import com.bruce.puerile.login.model.OnlineUserModel;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by bruce on 2016/7/12.
 */
@Controller
@SessionAttributes("sessionModel")
//@RequestMapping(path = "/login")
public class UserLoginCtrller {

    private FrameLogger logger = FrameLogger.getLogger(this.getClass());

    @RequestMapping(method = RequestMethod.GET)
    public ModelAndView requestLoginPage (@ModelAttribute("command") LoginModel loginModel,
                                          SessionModel sessionModel,
            ModelAndView mav,
            BindingResult result) {
        logger.debug("get request Login Page..");
        boolean passFlag = validateSession(loginModel);

        if (sessionModel.validateOnlineUser()) {//validate already login
            logger.debug("request login page with session Obj..");
            if (passFlag) {
                //remainder whether user want to shift account
                mav.setViewName("demo");
            } else {
                //remainder incorrect user info
                mav.setViewName("test");
            }
            loginModel.setUsername(loginModel.getUsername());
            mav.addObject("command", loginModel);
        } else {
            logger.debug("request login page without session Obj..");
            if (passFlag) {
                OnlineUserModel onlineUser = new OnlineUserModel();
                onlineUser.setUsername(loginModel.getUsername());
                sessionModel.setOnlineUserModel(onlineUser);
                mav.setViewName("main_menu");
            } else {
                mav.setViewName("login");
            }
        }
        return mav;
    }

    @RequestMapping(path = "/login", method = RequestMethod.POST)
    public ModelAndView loginRequest (@ModelAttribute("command") LoginModel loginModel,
                                      SessionModel sessionModel,ModelAndView mav,
                                      BindingResult result) {
        if ("bruce".equals(loginModel.getUsername()) && "112233".equals(loginModel.getPassword())) {
            logger.debug("login success..");
            if (sessionModel.validateOnlineUser()) {

            } else {
                OnlineUserModel onlineUser = new OnlineUserModel();
                onlineUser.setUsername("bruce");
                sessionModel.setOnlineUserModel(onlineUser);
            }
            mav.setViewName("main_menu");
        } else {
            logger.debug("login fail..");
            loginModel.setUsername("");
            loginModel.setPassword("");
        }

        return mav;
    }

    /**
     * This is a test function
     */
    @RequestMapping(path = "/demo", method = RequestMethod.GET)
    public ModelAndView toDemo (@ModelAttribute("command") LoginModel loginModel,
                                      ModelAndView mav,
                                      BindingResult result) {
        if ("bruce".equals(loginModel.getUsername()) && "112233".equals(loginModel.getPassword())) {
            logger.debug("login success..");
            mav.setViewName("main_menu");
        } else {
            logger.debug("login fail..");
            loginModel.setUsername("");
            loginModel.setPassword("");
        }

        return mav;
    }

    /**
     * This is a test function
     */
    @RequestMapping(path = "/mainmenu", method = RequestMethod.GET)
    public ModelAndView toMainMenu (@ModelAttribute("command") LoginModel loginModel,
                                ModelAndView mav,
                                BindingResult result) {
        if ("bruce".equals(loginModel.getUsername()) && "112233".equals(loginModel.getPassword())) {
            logger.debug("login success..");
            mav.setViewName("main_menu");
        } else {
            logger.debug("login fail..");
            loginModel.setUsername("");
            loginModel.setPassword("");
        }

        return mav;
    }

    /**
     * 模拟拦截器方法
     * @param obj
     * @return
     */
    public boolean validateSession(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj instanceof LoginModel) {
            LoginModel loginModel = (LoginModel) obj;
            if ("bruce".equals(loginModel.getUsername()) && "112233".equals(loginModel.getPassword())) {
                return true;
            }
        }
        return false;
    }

    public boolean validateLoginInfo (LoginModel loginModel) {
        if ("bruce".equals(loginModel.getUsername()) && "111111".equals(loginModel.getPassword())) {
            return true;
        } else {
            return false;
        }
    }

    /*
    @RequestMapping(method = RequestMethod.GET)
    public String get() {
        logger.info("get method process");
        return "main_menu";
    }


    @RequestMapping(path = "/first", method = RequestMethod.GET)
     public String login() {

        logger.info("login method process");
        return "main_menu";
    }

    @RequestMapping(path = "/second", method = RequestMethod.GET)
    public String setupForm() {

        logger.info("setupForm method process");
        return "main_menu";
    }

    @RequestMapping(path = "/pets/{petId}", method = RequestMethod.GET)
    public String findPet(@PathVariable String petId, @MatrixVariable(required = false, name="q", pathVar="petId") String q) {
        logger.info("findPet method process");
        logger.info(petId);
        logger.info(q);
        // petId == 42
        // q == 11
        return "main_menu";
    }
    */
/*
    @RequestMapping(path = "/test", method = RequestMethod.POST)
    public String test(@RequestBody String userName, ModelMap modelMap) {

        logger.info("username:" + userName);
        logger.info("login servlet process");
        return "test";
    }
    */
}
