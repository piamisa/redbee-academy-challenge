package com.redbee.academy.challenge;

import java.util.ArrayList;
import java.util.List;

public class CompareArrayNumbers {

	/**
	 * Method that receives two lists and returns another list with the max of each
	 * index
	 *
	 * @param a - Some Integer List
	 * @param b - Another Integer List
	 * @return A List with the max of each index
	 */
	public static List<Integer> max(List<Integer> a, List<Integer> b) {
		List<Integer> listMinCantItems = a;
		List<Integer> listMaxCantItems = b;
		List<Integer> listRet = new ArrayList<Integer>();
		if (listMinCantItems.size() > listMaxCantItems.size()) {
			listMinCantItems = b;
			listMaxCantItems = a;
		}
		for (int i = 0; i < listMinCantItems.size(); i++) {
			if (listMaxCantItems.get(i) <= listMinCantItems.get(i))
				listRet.add(listMinCantItems.get(i));
			else
				listRet.add(listMaxCantItems.get(i));
		}
		for (int i = listMinCantItems.size(); i < listMaxCantItems.size(); i++)
			listRet.add(listMaxCantItems.get(i));

		return listRet;
	}

}
