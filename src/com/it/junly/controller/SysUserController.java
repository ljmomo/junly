package com.it.junly.controller;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fasterxml.jackson.core.JsonEncoding;
import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.it.junly.po.Authority;
import com.it.junly.po.SysUser;
import com.it.junly.service.AuthorityService;


@Controller
@RequestMapping("/sysuser")
public class SysUserController {
	
	@Resource
	private AuthorityService authorityService;
	
	@RequestMapping("/login")
	public void login(SysUser sysUserPo, HttpServletRequest request, HttpServletResponse response) throws IOException {
		ObjectMapper mapper = new ObjectMapper();
		Map<String, Object> result = new HashMap<String, Object>();
		result.put("result", 1);
		JsonFactory factory = mapper.getFactory();
	    JsonGenerator  responseJsonGenerator = factory.createGenerator(response.getOutputStream(), JsonEncoding.UTF8);
	    responseJsonGenerator.writeObject(result);
	}
	
	@RequestMapping("/home")
	public ModelAndView home(HttpServletRequest request, HttpServletResponse response) {
		List<Authority> allMenuList = authorityService.selectAuthorityALL("0");
		return new ModelAndView("back/index", "authority", allMenuList);
	}
	
	@RequestMapping("/homepage")
	public String homepage(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/homepage";
	}

	@RequestMapping("/dict")
	public String dict(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/dict";
	}

	@RequestMapping("/role")
	public String role(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/role";
	}

	@RequestMapping("/department")
	public String department(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/department";
	}

	@RequestMapping("/mail")
	public String mail(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/mail";
	}

	@RequestMapping("/information")
	public String information(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/information";
	}

	@RequestMapping("/authority")
	public String authority(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/authority";
	}

	@RequestMapping("/typography")
	public String typography(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/typography";
	}

	@RequestMapping("/uielements")
	public String uielements(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/uielements";
	}

	@RequestMapping("/buttonsicon")
	public String buttonsicon(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/buttonsicon";
	}

	@RequestMapping("/contentslider")
	public String contentslider(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/contentslider";
	}

	@RequestMapping("/nestablelist")
	public String nestablelist(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/nestablelist";
	}

	@RequestMapping("/jquerydatatables")
	public String jquerydatatables(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/jquerydatatables";
	}

	@RequestMapping("/formelements")
	public String formelements(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/formelements";
	}

	@RequestMapping("/formelements2")
	public String formelements2(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/formelements2";
	}

	@RequestMapping("/wizardvalidation")
	public String wizardvalidation(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/wizardvalidation";
	}

	@RequestMapping("/uiwidgets")
	public String uiwidgets(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/uiwidgets";
	}

	@RequestMapping("/calendar")
	public String calendar(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/calendar";
	}

	@RequestMapping("/gallery")
	public String gallery(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/gallery";
	}

	@RequestMapping("/pricingtables")
	public String pricingtables(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/pricingtables";
	}

	@RequestMapping("/invoice")
	public String invoice(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/invoice";
	}

	@RequestMapping("/timeline")
	public String timeline(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/timeline";
	}

	@RequestMapping("/faq")
	public String faq(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/faq";
	}

	@RequestMapping("/error404")
	public String error404(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/error404";
	}

	@RequestMapping("/error500")
	public String error500(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/error500";
	}

	@RequestMapping("/grid")
	public String grid(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/grid";
	}

	@RequestMapping("/charts")
	public String charts(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/charts";
	}
	
	@RequestMapping("/gongzuo")
	public String gongzuo(HttpServletRequest request, HttpServletResponse response) throws IOException {
		return "back/gongzuo";
	}

}
