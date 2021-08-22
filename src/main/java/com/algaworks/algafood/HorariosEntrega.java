package com.algaworks.algafood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HorariosEntrega {

	@GetMapping("/HorariosEntrega")
	@ResponseBody
	public String Horarios() {
		return "Entregamos entre 10:00 e 22:00 hrs todos os dias da semana";
	}
}
