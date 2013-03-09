package sample.web.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Date;

/**
 * 簡単なコントローラ
 * Created with IntelliJ IDEA.
 * User: kamatama_41
 */
@Controller
public class HelloWorldController {

	@RequestMapping("/hello")
	public ModelAndView helloWorld() {

		ModelAndView mav = new ModelAndView("helloView");
		// 直接モデルに、メッセージを設定する
		mav.addObject("message1", "Hello World.<strong>StringMVC 3.0!</strong>");
		// モデルを取得して、メッセージを取得する
		mav.getModelMap().put("message2", "メッセージ2");

		mav.addObject("currentDate", new Date());

		return mav;
	}

}
