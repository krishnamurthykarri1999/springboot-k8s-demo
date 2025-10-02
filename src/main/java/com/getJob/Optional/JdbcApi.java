//package com.getJob.Optional;
//
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//
//import org.springframework.util.comparator.Comparators;
//
//public class JdbcApi {
//
//	public static void main(String[] args) {
//
//		List<Integer> list = Arrays.asList(52, 8, 1, 2, 8, 9, 9, 52);
//
//		list.stream().distinct().sorted(new Comparator() {
//			@Override
//			public int compare(Object o1, Object o2) {
//				return o2-o1;
//			}
//
//		}).forEach(System.out::println);
//
//	}
//}
