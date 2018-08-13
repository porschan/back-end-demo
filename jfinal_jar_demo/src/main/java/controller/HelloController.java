package controller;

import com.jfinal.core.Controller;

/**
 * @author:porschan
 * @description:
 * @date: Created in 16:37 2018/8/10
 * @modified By:
 */

public class HelloController extends Controller {

    public void index() {
        renderText("Hello JFinal World.");
    }
}
