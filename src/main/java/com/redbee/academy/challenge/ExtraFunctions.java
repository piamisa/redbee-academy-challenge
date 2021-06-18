package com.redbee.academy.challenge;

import java.util.List;

public class ExtraFunctions {

	public static Integer nullToZero(Integer num) {
		if (num == null)
			num = 0;
		return num;
	}

	public static Integer maxOfList(List<Integer> list) {
		Integer aux = 0;
		for (Integer number : list)
			if (number > aux)
				aux = number;
		return aux;
	}

}