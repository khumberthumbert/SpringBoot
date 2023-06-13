package com.yedam.app.emp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.yedam.app.emp.service.EmpService;
import com.yedam.app.emp.service.EmpVO;

@Controller
public class EmpController {
	
	@Autowired
	EmpService empService;	
	
	//전체조회 페이지
	@GetMapping("empList")
	public String empList(Model model) {
		model.addAttribute("empList", empService.getEmpList());
		return "empList";
		//확장자 제외하고!
	}
	
	//단건조회 페이지
	@GetMapping("empInfo")
	public String empInfo(EmpVO empVO, Model model) {
		model.addAttribute("empInfo", empService.getEmpInfo(empVO));
		return "empInfo";
	}	
	
	//등록 페이지
	@GetMapping("empInsert")
	public void empInsertForm(Model model) {
		model.addAttribute("empVO", new EmpVO());
	}//이렇게 생성시켜서 모델에 담아 보내줘야 뷰에서 이 커맨드 객체를 사용할 수 있다.
	//객체 이름에 유의해야한다. 매개변수 이름이 다른 컨트롤러의 이름과도 같아야 연결이 된다. 다르다면 제대로 인식을 못한다.
	//매개변수라는건 넘어오는 것에 대해 만들어주는 것인데, 같은 이름으로 맵핑하지 않으면 넘어온 데이터 연결 못시킨다.
	//서버 받을 때의 변수 명이 같아야 한다.
	// 등록 페이지 -> 뷰 -> 등록 처리 부분 때문에.
	
	
	//등록 처리
	@PostMapping("empInsert")
	public String empInsert(EmpVO empVO) {
		empService.insertEmpInfo(empVO);
		return "redirect:empList";
	}
	
	
	
	
	
	
	
	
	
	
	
	//등록 처리

}
